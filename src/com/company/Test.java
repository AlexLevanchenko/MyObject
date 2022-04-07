package com.company;

public class Test {
    public static void main(String[] args) {
        MyObject myFirsObject = new MyObject();
        myFirsObject.number = 10;
        myFirsObject.text = "text1";

        MyObject mySecondObject = new MyObject();
        mySecondObject.number = 20;
        mySecondObject.text = "text2";

        System.out.println("myFirstObject: number= " + myFirsObject.number + ", text= " + myFirsObject.text);
        System.out.println("mySecondObject: number= " + mySecondObject.number + ", text= " + mySecondObject.text);

        System.out.println("Static: " + myFirsObject.STATIC_NUMBER + ", "
                + mySecondObject.STATIC_NUMBER + ", "
                + MyObject.STATIC_NUMBER);

        MyObject.STATIC_NUMBER = MyObject.STATIC_NUMBER + 1;

        System.out.println("Static: " + myFirsObject.STATIC_NUMBER + ", "
                + mySecondObject.STATIC_NUMBER + ", "
                + MyObject.STATIC_NUMBER);

    }
}
