/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ellipse;

/**
 *
 * @author user
 */
public class Ellipse {
    public double a = 3;
    public double b = 5;
    public double calculateArea(){
        double area;
        area = Math.PI * this.a * this.b;
        return area;
    }
    
    public double calculatePerimeter(){
        double perimeter;
        perimeter = Math.PI * (3 * (this.a + this.b) - Math.sqrt((3 * this.a + this.b) * (this.a + 3 * this.b)));
        return perimeter;
    } 

    public static void main(String[] args) {
        Ellipse oval = new Ellipse();
        System.out.printf("Luas Ellipse adalah %.2f\n", oval.calculateArea());
        System.out.printf("Keliling Ellipse adalah %.2f\n", oval.calculatePerimeter());
    }
}