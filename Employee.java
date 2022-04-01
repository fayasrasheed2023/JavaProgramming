package employee;

public class Employee {

   int emp_id;
   String ename;
   float salary;
  
 Employee(int a,String b,float c)
 {
    emp_id=a; 
    ename=b;
    salary=c;
    
 }
 public void salary()
 {
    float tsalary =salary +(salary*20)/100;
    System.out.println("Total Salary is "+tsalary);
     
     
 }
 
    public static void main(String[] args) {
     Employee e=new Employee(100,"fayas",30000);
     e.salary();
        
    }
    
}
