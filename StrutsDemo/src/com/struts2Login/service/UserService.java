package com.struts2Login.service;

import com.struts2Login.bean.User;

/**
 * Created by Super on 2015/5/28.
 */

public interface UserService {

    int SUCCESS=0;
    int PASSWORD_WRONG=1;
    int No_THIS_USER=2;
    int MULTI_USER =3;

    /**
     * ��֤�û�����������������Ƿ�ƥ��
     * @param username �û����������
     * @param password �û����������
     * @return ��֤ͨ��������true;��֮������false
     */
    int checkUserLogin(String username, String password);

    /**
     * ����û����Ƿ����
     * @param username �û�ע����û���
     * @return ��֤ͨ��������true;��֮������false
     */
    boolean checkUsernameExist(String username);

    void addUser(User user);
}
