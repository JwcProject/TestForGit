package com.struts2Login.dao;

import com.struts2Login.bean.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Super on 2015/5/30.
 */

public interface UserDao extends BaseDao{

    /**
     * ͨ���û�������û��������û���Ϣ
     * @param username �û�������û���
     * @return �洢�û���Ϣ��user����
     */
    User findUserByName(String username);

}
