/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coba;

/**
 *
 * @author user
 */
public class Coba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square persegi = new Square();
        System.out.println("Luas persegi adalah "+persegi.calculateArea());
        System.out.println("Keliling persegi adalah "+persegi.calculatePerimeter());
        persegi.calculateArea();
        persegi.calculatePerimeter();
    }
    
}
