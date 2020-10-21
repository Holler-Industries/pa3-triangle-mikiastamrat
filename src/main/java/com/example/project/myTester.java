package com.example.project;

public class myTester {
    public static void main(String[] args) {
        System.out.println("myTriangle");
        Triangle myTriangle = new Triangle(0, 0, 3, 0, 0, 4);

        System.out.println(myTriangle.perimeter());
        System.out.println(myTriangle.area());

        System.out.println(myTriangle.getx0());
        System.out.println(myTriangle.getx1());
        System.out.println(myTriangle.getx2());
        myTriangle.translateX(3);
        System.out.println(myTriangle.getx0());
        System.out.println(myTriangle.getx1());
        System.out.println(myTriangle.getx2());
        System.out.println(myTriangle.gety0());
        System.out.println(myTriangle.gety1());
        System.out.println(myTriangle.gety2());
        myTriangle.translateY(3);
        System.out.println(myTriangle.gety0());
        System.out.println(myTriangle.gety1());
        System.out.println(myTriangle.gety2());

        System.out.println("otherTriangle");
        Triangle otherTriangle = new Triangle(0, 0, 0, 0, 0, 0);
        System.out.println(otherTriangle.perimeter());
        System.out.println(otherTriangle.area());
        System.out.println(otherTriangle.getx0());
        System.out.println(otherTriangle.getx1());
        System.out.println(otherTriangle.getx2());
        otherTriangle.translateX(3);
        System.out.println(otherTriangle.getx0());
        System.out.println(otherTriangle.getx1());
        System.out.println(otherTriangle.getx2());
        System.out.println(otherTriangle.gety0());
        System.out.println(otherTriangle.gety1());
        System.out.println(otherTriangle.gety2());
        otherTriangle.translateY(3);
        System.out.println(otherTriangle.gety0());
        System.out.println(otherTriangle.gety1());
        System.out.println(otherTriangle.gety2());



        }




    }

