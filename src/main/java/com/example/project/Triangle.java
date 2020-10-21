package com.example.project;
import java.lang.Math;

public class Triangle {

   private double x0;
   private double x1;
   private double x2;
   private double y0;
   private double y1;
   private double y2;

   public Triangle () {

       x0=0;
       x1=0;
       x2=0;
       y0=0;
       y1=0;
       y2=0;

   }

   public Triangle(double x0, double y0, double x1, double y1, double x2, double y2){
       this.x0=x0;
       this.x1=x1;
       this.x2=x2;
       this.y0=y0;
       this.y1=y1;
       this.y2=y2;
   }

   public double perimeter() {
       double sidelength1 = Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
       double sidelength2 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
       double sidelength3 = Math.sqrt((x2 - x0) * (x2 - x0) + (y2 - y0) * (y2 - y0));

       double perimeter = sidelength1 + sidelength2 + sidelength3;

       return perimeter;
   }

   public double area() {
       double sidelength1 = Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
       double sidelength2 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
       double sidelength3 = Math.sqrt((x2 - x0) * (x2 - x0) + (y2 - y0) * (y2 - y0));

       double s = (sidelength1 + sidelength2 + sidelength3) / 2;
       double area = (Math.sqrt(s * ((s - sidelength1) * (s - sidelength2) * (s - sidelength3))));
       return area;

   }

   public void translateX(double value){
       this.x0 = this.x0 + value;
       this.x1 = this.x1 + value;
       this.x2 = this.x2 + value;
   }

   public void translateY(double value){
       this.y0 = this.y0 + value;
       this.y1 = this.y1 + value;
       this.y2 = this.y2 + value;
   }

    public double getx0() {
        return 0;

    }

    public double getx1() {
        return 0;
    }

    public double getx2() {
        return 0;
    }

    public double gety0() {
        return 0;
    }

    public double gety1() {
        return 0;
    }

    public double gety2() {
        return 0;
    }
}

