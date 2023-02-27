/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lingkaran;

/**
 *
 * @author user
 */
public class Lingkaran {
    public int radius = 14;
    public double calculateArea(){
        double area;
        area = Math.PI * this.radius * this.radius;
        return area;
    }
    
    public double calculatePerimeter(){
        double perimeter;
        perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran lingkaran = new Lingkaran();
        System.out.printf("Luas lingkaran adalah %.2f\n", lingkaran.calculateArea());
        System.out.printf("Keliling lingkaran adalah %.2f\n", lingkaran.calculatePerimeter());
    }
    
}
