package com.fissst;

public class Test {

    static public void main(String[] args){
        System.out.println(JSON_Credentials.standard_user().get(0));
        System.out.println(JSON_Credentials.problem_user().get(0));
        System.out.println(JSON_Links.MainPage().get(0));
    }
}

