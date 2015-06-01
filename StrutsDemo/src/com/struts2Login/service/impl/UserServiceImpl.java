package com.struts2Login.service.impl;

import com.struts2Login.bean.User;
import com.struts2Login.dao.UserDao;
import com.struts2Login.dao.impl.UserDaoImpl;
import com.struts2Login.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Super on 2015/5/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    /**
     *��֤�û�����������������Ƿ�ƥ��
     * @param username �û����������
     * @param password �û����������
     * @return ��֤ͨ��������true;��֮������false
     */
    @Override
    public int checkUserLogin(String username, String password) {
        User user=userDao.findUserByName(username);
        if(user==null){
            return No_THIS_USER;
        }
        if(!password.equals(user.getPassword())){
            return PASSWORD_WRONG;
        }
        return SUCCESS;
        /*if(username.equals(user.getUsername())&&password.equals(user.getPassword())){
            return SUCCESS;
        }
        else if(user==null){
            return No_THIS_USER;
        }
        return PASSWORD_WORRY;*/
    }

    @Override
    public boolean checkUsernameExist(String username) {
        User user=userDao.findUserByName(username);
        if(user!=null){
            return true;
        }
        return false;
    }

    @Override
    public void addUser(User user) {
        userDao.writeData(user);
    }
}
