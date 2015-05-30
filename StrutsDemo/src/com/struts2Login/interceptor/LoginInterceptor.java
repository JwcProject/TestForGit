package com.struts2Login.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.struts2Login.action.UserAction;

import java.util.Map;

/**
 * Created by Super on 2015/5/28.
 */
public class LoginInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        /*if(LoginAction.class==actionInvocation.getAction().getClass()
                || RegisterAction.class==actionInvocation.getAction().getClass()){
            return actionInvocation.invoke();
        }*/

//        if(UserAction.class==actionInvocation.getAction().getClass()){
//            return actionInvocation.invoke();
//        }



        Map map=actionInvocation.getInvocationContext().getSession();

        if(null==map.get("userInfo")){
            return Action.LOGIN;
        }

        return actionInvocation.invoke();
    }
}
