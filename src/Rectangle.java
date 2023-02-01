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
        width = w;
        length = l;
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


    //other methods




    //toString method

}