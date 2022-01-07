package com.daw;

public class test {
    static public void main(String[] args){
        //System.out.println(JSON2.standard_user().get(2));
        //System.out.println(JSON2.credentials().get(1));
        System.out.println(JSON_Credentials.standard_user().get(0));
        System.out.println(JSON_Credentials.problem_user().get(0));
        System.out.println(JSON_Links.MainPage().get(0));
        //JSON2.standard_user().size();
    }
}
