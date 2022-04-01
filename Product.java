/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

public class Product {
  int pcode;
  String pname;
  float price;
  Product(int a,String b,float c)
  {
      pcode=a;
      pname=b;
      price=c; 
  }

    public static void main(String[] args) {
     
       Product p1= new Product(100,"book",50);
       Product p2= new Product(101,"pen",20);
       Product p3= new Product(102,"scale",10);
     
                if( p1.price <= p2.price && p1.price <= p3.price)
            System.out.println(p1.pname+ " has Lowest.");
        else if (p2.price <= p1.price && p2.price <= p3.price)
            System.out.println(p2.pname+ " has Lowest.");
        else
           System.out.println(p3.pname+ " has Lowest.");

    }
    
}
