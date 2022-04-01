/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

public class Student {
    int m1,m2,m3;
    String name;
    Student(String n, int a, int b, int c)
    {
        m1=a;
        m2=b;
        m3=c;
        name=n;
    }
    public void Sum()
    {
        int sum=m1+m2+m3;
        System.out.println("Student Name:"+name);
         System.out.println("Student  Total Mark:"+sum);
    }
    public void Percentage()
    {
        int s=m1+m2+m3;
        float per=(s/300)*100;
        
        System.out.println("Student Name:"+name);
         System.out.println("Student  Mark Percentage:"+per);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student S1=new Student("Fayas",50,60,45);
       Student S2=new Student("Amal",50,65,85);
       S1.Sum();
       S1.Percentage();
       S2.Sum();
       S2.Percentage();
    }
    
}
