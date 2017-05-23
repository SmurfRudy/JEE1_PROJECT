package com.ProjetJSF.controller.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PageMngBean implements Serializable{
	public PageMngBean(){
		
	}
	
	public String goToPage(){
		return "welcome.xhtml";
	}

}
