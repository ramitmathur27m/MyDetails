package com.lambda.java.classes;

import java.util.ArrayList;
import java.util.List;

public class LambdaMain {

    List<String> strList= new ArrayList<String>();

    public static void main(String args[]){
        System.out.println("inside main method of LambdaMain!!!!!");
        LambdaMain lm = new LambdaMain();
        //boolean flag = lm.strList.forEach(s ->s.equalsIgnoreCase("Three"));
    }
    public void LambdaMain(){
        strList.add("One");
        strList.add("Two");
        strList.add("Three");
        strList.add("Four");
        strList.add("Five");
        strList.add("Six");
    }
}
