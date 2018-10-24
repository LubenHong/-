package com.actionForm;

import org.apache.struts.action.ActionForm;

public class BookCaseForm extends ActionForm {
    private Integer id;
    private String name;
    //构造方法
    public BookCaseForm(){
    }
    public Integer getId() {
    	System.out.println("aaaa");
    	System.out.println("bbbb");
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
