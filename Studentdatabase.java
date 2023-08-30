
package studentdatabase;

import java.util.Scanner;


public class Studentdatabase {

   
    public static void main(String[] args) {
        
        int n;
        System.out.println("enetr the no of students:");
        Scanner obj1=new Scanner(System.in);
        n=obj1.nextInt();
        student s[]= new student[n];
         String name,dept;
         int m1=0 ;
         int m2=0 ;
         int m3=0 ;
         int m4=0 ;
         int m5=0;
         float tot=0;
         float avg=0;
         Scanner obj=new Scanner(System.in);
        int rollno;
        
        for(int i=0;i<s.length;i++)
        {
            System.out.println("enter the student name:");
            name = obj.next();
            System.out.println("enter the dept");
            dept = obj.next();
            System.out.println("enter rollno ");
            rollno = obj.nextInt();
            
       
            

            System.out.println("enter the 5 subject marks:");
             m1=obj.nextInt();
             m2=obj.nextInt();
             m3=obj.nextInt();
             m4=obj.nextInt();
             m5=obj.nextInt();
             tot=(m1+m2+m3+m4+m5);
             avg=(tot/5);
            s[i]=new student(name,dept,rollno, m1,  m2,  m3,  m4,  m5, tot, avg);
            System.out.println("name:" + name +  " dept: " + dept + " rollno: " + rollno + " total: " + tot + " avarage: " + avg);
        }
}
    
}
class student
{

    String name;
    String dept;
    int rollno;
    int m1,m2,m3,m4,m5;
    float tot,avg;
    
    public student(String name, String dept, int rollno, int m1, int m2, int m3, int m4, int m5,float tot, float avg) {
        this.name = name;
        this.dept = dept;
        this.rollno = rollno;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m5;
        this.m5 = m5;
        this.tot = tot;
        this.avg= avg;

    }

}          


    
    

