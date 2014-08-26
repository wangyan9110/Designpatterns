package org.yywang;

/**
 * 脸装扮类
 */
public class Face {

    private String name;

    public Face(){

    }

    public Face(String name){
        this.name=name;
    }

    public void show(){
        System.out.println("开始装扮Face:" + name);
    }

}
