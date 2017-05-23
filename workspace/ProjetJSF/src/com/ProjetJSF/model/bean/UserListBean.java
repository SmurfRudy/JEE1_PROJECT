package com.ProjetJSF.model.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UserListBean { 
	private List<UserBean> userList;
	public UserListBean() {
        userList = new ArrayList<>();
        UserBean u;
        for (int i = 0; i < 20; i++) {
			u = new UserBean();
			u.setLogin("joe" + i);
			u.setPwd("pwd" + i);
			userList.add(u);
        }
	}
	public List<UserBean> getUserList() {
        return userList;
	}
	public void setUserList(List<UserBean> userList) {
        this.userList = userList;
	}

}
