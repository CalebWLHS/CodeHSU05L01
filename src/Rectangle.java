/**
 * @file Rectangle.java
 * @date 2/2/2023
 * @author Mr.Smith
 *
 * @description Creates a rectangle with a width and length with a side length.
 * The user can also calculate the perimeter and area of
 * the rectangle and print information about the Rectangle
 */

import java.text.DecimalFormat;
public class Rectangle { //make public for CS A

    //instance variables
    private double width;
    private double length;
    private double area;
    private double perimeter;

    //default constructor (make public for CS A)
    public Rectangle(){

        width = 1.0 ;
        length = 1.0;
    }


    //overloaded constructor (with parameters)

    /**
     * Creates a Rectangle object with width and length
     * @param w width of the rectangle
     * @param l length of the rectangle
     */
    public Rectangle(double w, double l){
        width = 1.0;
        length = 1.0;
        if (w > 0){
            width = w;
        }
        if (l>0){
            length = l;
        }
    }
    public Rectangle(double width){
        this.width = width;
    }
    //accessors
    /**
     *
     * @return the width of the rectangle
     */
    public double getWidth(){
        return width;
    }

    /**
     *
     * @return the length of the rectangle
     */
    public double getLength(){
        return length;
    }

    //mutators
    /**
     * Allows the user to change the width of the rectangle
     * @param width desired width
     */
    public void setWidth(double width){
        this.width = width;
    }

    /**
     * Allows the user to change the width of the rectangle
     * @param length desired length
     */
    public void setLength(double length){
        this.width = width;

    }

    /**
     * Calculates the area of rectangle
     * @return area of rectangle
     */
    public double calculateArea(){
        area = length*width;
        return area;
    }

    /**
     * Calculates the perimeter of rectangle
     * @return perimeter of rectangle
     */
    public double calculatePerimeter(){
        perimeter = 2(width+length);
        return perimeter;
    }
    /**
     * Prints the length and the width of the rectangle to 2 decimal places
     */
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return "The height of the rectangle is " +df.format(length) + "and the width is " +df.format(width) + ".";
    }
    //other methods




    //toString method

}