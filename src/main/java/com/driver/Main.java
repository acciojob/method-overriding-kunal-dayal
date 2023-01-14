package com.driver;

public class Main {
    public static void main(String[] args) {
    B call = new B();
    String lol = "see what happens";
    String see = B.meth(lol);
    }
}
class A {
    public static String meth (String check ){
        return check;
    }
}
class B extends A {
    public static String meth (String check ){
        return check;
    }
}