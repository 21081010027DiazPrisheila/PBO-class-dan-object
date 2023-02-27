/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba;

/**
 *
 * @author user
 */
public class Square {
    public int lengthOfSide = 8;
    public int calculateArea(){
        int area;
        area = this.lengthOfSide * this.lengthOfSide;
        return area;
    }
    
    public int calculatePerimeter(){
        int perimeter;
        perimeter = this.lengthOfSide * 4;
        return perimeter;
    } 
    
}
