/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

public class Rectangle {

    float length,breadth,peri,area;
    Rectangle()
    {
        length=40;
        breadth=20;
        
    }
    
    public void perimeter()
    {
    peri= 2*(length+ breadth);
    System.out.println("Perimeter of the rectangle="+peri);
    }
    public void area()
    {
     area=length*breadth;   
     System.out.println("Area of the rectangle="+area);
    }
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangle R=new Rectangle();
        R.perimeter();
        R.area();
    }
    
}
