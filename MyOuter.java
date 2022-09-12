package com.example.training;

public class MyOuter{
    private int x = 10;

    public void makeInner() {
        MyInner mi = new MyInner();
        mi.peekOuter();
    }
    public class MyInner{
        public void peekOuter(){
            System.out.println("Outer integer * 10 = " + x*10);
            System.out.println("Inner class ref : "+ this);
            System.out.println("Outer class ref : "+ MyOuter.this);
        }
    }


    public static void main(String[] args) {
        MyOuter obj_within_MyOuter = new MyOuter();
        obj_within_MyOuter.makeInner();
    }
}

class ThirdParty{
    public static void main(String[] args) {  /* Inner class object from outside the outer class */
//        MyOuter obj = new MyOuter();
//        MyOuter.MyInner inner_obj = obj.new MyInner();
        MyOuter.MyInner obj_outside_MyOuter = new MyOuter().new MyInner();
        obj_outside_MyOuter.peekOuter();
    }
}