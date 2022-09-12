package com.example.training;

public class OuterMethodLocal {
    private String str = "OuterStr";

    void doStuff(){
        String str_inner_method = "InnerStr";
        class InnerMethodLocal{
            public void peekOuter(){
                System.out.println("Outer string is " + str);
                System.out.println("Inner string is " + str_inner_method);
            }
        }
        InnerMethodLocal in = new InnerMethodLocal();
        in.peekOuter();
    }
}

class Runner{
    public static void main(String[] args) {
        OuterMethodLocal o = new OuterMethodLocal();
        o.doStuff();
    }
}
