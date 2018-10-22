
package question6;

import java.util.Random;
import java.util.Scanner;


public class Question6 {
     public static void main(String[] args) {
          System.out.println("How many numbers?");
         Scanner Keyboard= new Scanner(System.in);
         int n;
      
         n=Keyboard.nextInt();
           for(int i=1;i<n;i++)
           {
         Random obj=new Random();
         int a= obj.nextInt(1000);
           if(a%2==0)
                   {
                       System.out.println(a+" is even");
                   }
           else
           {
               System.out.println(a+" is odd");
           }
         
           }
     }
    
}
