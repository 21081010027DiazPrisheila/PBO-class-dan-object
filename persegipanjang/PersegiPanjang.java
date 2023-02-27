/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persegipanjang;

/**
 *
 * @author user
 */
public class PersegiPanjang {
    public int width = 8;
    public int height = 5;
    public int calculateArea(){
        int area;
        area = this.width * this.height;
        return area;
    }
    
    public int calculatePerimeter(){
        int perimeter;
        perimeter = 2 * (this.width + this.height);
        return perimeter;
    } 
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Luas persegi panjang : "+pp.calculateArea());
        System.out.println("Keliling persegi panjang : "+pp.calculatePerimeter());
    }
}