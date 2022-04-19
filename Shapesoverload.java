package shapesoverload;


public class Shapesoverload {
    void area(double x,double y)
    {
        System.out.println("Area of rectangle="+(x*y));
            
    }
    void area(int a)
    {
        System.out.println("Area of Square="+(a*a));
            
    }
   
     void area(double r)
    {
        double pi=3.14;
        
       System.out.println("Area of Circle="+(pi*r*r));
            
    }
     void area(int x,int y,int z) {
       double s=(x+y+z)/2;
       double triArea;
       triArea=Math.sqrt(s*(s-x)*(s-y)*(s-z));
       System.out.println("Area of triangle is ="+triArea);
   }

    public static void main(String[] args) {
        
        Shapesoverload ar=new Shapesoverload();
       
        ar.area(5,4); 
        ar.area(5);
        ar.area(5.5);
        ar.area(5,6,7);
        
        
    }
    
}
