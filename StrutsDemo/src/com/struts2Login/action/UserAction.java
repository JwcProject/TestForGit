package com.struts2Login.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2Login.bean.User;
import com.struts2Login.service.UserService;
import org.apache.struts2.convention.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;


/**
 * Created by Super on 2015/5/30.
 */
@Controller

@Scope("prototype")
@Namespace("/user")
@ParentPackage("struts2")
public class UserAction extends ActionSupport {
    private User user;

    @Resource
    private UserService userService;


    @Action(value = "login", results = {
            @Result(name = SUCCESS, location = "/LoginResult.jsp"),
            @Result(name = INPUT, location = "/failLogin.jsp")
           }
    )
    public String login (){
        switch (userService.checkUserLogin(user.getUsername(), user.getPassword())){
            case UserService.SUCCESS:
                User user=new User();
                user.setUsername(user.getUsername());
                user.setPassword(user.getPassword());

                ActionContext.getContext().getSession().put("userInfo",user);
                return SUCCESS;
            case UserService.PASSWORD_WRONG:
                return INPUT;
            case UserService.No_THIS_USER:
                return INPUT;
        }
        return INPUT;
        /*if(userService.checkUserLogin(user.getUsername(), user.getPassword())){
            User user=new User();
            user.setUsername(user.getUsername());
            user.setPassword(user.getPassword());

            ActionContext.getContext().getSession().put("userInfo",user);
            return SUCCESS;
        }
        return INPUT;*/
    }

    @Action(value = "register",results = {
            @Result(name=SUCCESS,location = "/registerResult.jsp"),
            @Result(name=ERROR,location = "/failRegister.jsp")
    })
    public String register(){
        //todo:注册失败没有判断
        //todo:用户名不能重复
        if(userService.checkUsernameExist(user.getUsername())){
            return ERROR;
        }
        userService.addUser(user);
        return SUCCESS;
    }

    @Action(value = "mainPage",results = {
            @Result(name = SUCCESS,location = "/mainResult.jsp")
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
