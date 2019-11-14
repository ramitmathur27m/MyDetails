package com.lambda.java.classes;

public class LambdaMain {
    public static void main(String args[]){
        System.out.println("inside main method of LambdaMain!!!!!");
        MyLambda mlI = ()-> System.out.println("Its mee!!!!!");
        mlI.foo();
    }
}

interface MyLambda{
    void foo();
        }
