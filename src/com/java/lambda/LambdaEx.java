package com.java.lambda;

interface Lamdaex
{
    void m1();
}
public class LambdaEx
{
    // Normal method in Java
    static int add_No(int a, int b)
    {
        System.out.println("Addition");
        return a+b;
    }
    public static void main(String args[])
    {
System.out.println("Lambda expression");
        System.out.println(add_No(4,5));

        // lambda expression
        Lamdaex l1 = () -> {
            System.out.println("Lambda expression is function without the name.");
            System.out.println("Good morning");
         };
        l1.m1();
    }
}
