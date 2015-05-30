package com.struts2Login.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts2Login.bean.User;
import com.struts2Login.dao.UserDao;
import com.struts2Login.dao.impl.UserDaoImpl;
import com.struts2Login.service.LoginServeice;
import com.struts2Login.service.impl.LoginServiceImpl;
import org.apache.struts2.convention.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


/**
 * Created by Super on 2015/5/30.
 */
@Controller

@Scope("prototype")
@Namespace("/user")
@ParentPackage("struts2")
public class UserAction extends ActionSupport {

    private User user;

    private UserDao userDao=new UserDaoImpl();

    private LoginServeice loginServeice=new LoginServiceImpl();


    @Action(value = "login", results = {
            @Result(name = SUCCESS, location = "/LoginResult.jsp"),
            @Result(name = INPUT, location = "/failLogin.jsp")
           }
    )
    public String login (){
        if(this.loginServeice.checkUserLogin(user.getUsername(), user.getPassword())){
            User user=new User();
            user.setUsername(user.getUsername());
            user.setPassword(user.getPassword());

            ActionContext.getContext().getSession().put("userInfo",user);
            return SUCCESS;
        }
        return INPUT;
    }

    @Action(value = "register",results = {
            @Result(name="success",location = "/registerResult.jsp")
    })
    public String register(){
        //todo:注册失败没有判断
        //todo:用户名不能重复
        String filename="D:\\sql.txt";
        /*if(loginServeice.checkUsernameExist(user.getUsername())){
            return ERROR;
        }*/
        userDao.write(filename,user);
        return SUCCESS;
    }

    @Action(value = "mainPage",results = {
            @Result(name = "success",location = "/mainResult.jsp")
    })
    public String mainPage(){
        return SUCCESS;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
