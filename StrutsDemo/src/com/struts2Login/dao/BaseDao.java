package com.struts2Login.dao;

import com.struts2Login.bean.User;

import java.util.Map;

/**
 * Created by Super on 2015/6/1.
 */
public interface BaseDao {
    /**
     * �ӿ��ļ�ģ������ݿ��ж������ݷ���Map�з���
     * @param filename �ļ��������Ե�ַ��
     * @return �洢�û���Ϣ��Map
     */
    Map<String,String> findAllUser(String filename);

    /**
     * ������д��һ��txt�ļ�
     * @param user �洢�û���Ϣ�Ķ���
     */
    void writeData(User user);
}
