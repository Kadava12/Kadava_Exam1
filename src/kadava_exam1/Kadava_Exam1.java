/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kadava_exam1;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Kadava_Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        
         Scanner scn=new Scanner(System.in);
       System.out.println("[1] oneCode ; ");{
        System.out.println("[2] twocode ;");
         System.out.println("[3] threecode ;");
         System.out.println("[4] fourcode ;");
         System.out.println("[5] fivecode ;");
       
       int input = scn.nextInt();
       
        switch(input){
           case 1:
               one();
               break;  
           case 2:
                   two();
                   break;
                   
           case 3:
               three();
               break;
           case 4:
           four();
           break;
           case 5:
               five();
               break;
                
  
        
    }
    }
    }
    
    public static void one(){
        int size, i, j, temp;  
       int arr[] = new int[50];  
       Scanner scan = new Scanner(System.in);  
         
       System.out.print("Enter Array Size : ");  
       size = scan.nextInt();  
         
       System.out.print("Enter Array Elements : ");  
       for(i=0; i<size; i++)  
       {  
           arr[i] = scan.nextInt();  
       }  
         
       System.out.print(" tolat ..\n");  
       for(i=0; i<size; i++)  
       {  
           for(j=i+1; j<size; j++)  
           {  
               if(arr[i] > arr[j])  
               {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }  
           }  
       }  
         
       System.out.print("Now the Array  is :\n");  
       for(i=0; i<size; i++)  
       {  
           System.out.print(arr[i]+ "  ");  
       }  
   }  
     public static void two(){
         String[] arr={"banana","apple","lanzones","durian","rambotan","kiwi","mansanitas"};
       
     }    
      
     
     public static void three(){
         int[] myArray={1,2,3,4,5};
         System.out.println("The number of elements"+myArray.length);
     }
     
     public static void four(){
         int[] positive={2,3,4,5,6,7,8};
         
     }
     public static void five(){
        
         Scanner scan = new Scanner(System.in);  
         
       System.out.print("Enter Fibonacci size : ");
       int size = scan.nextInt(); 
       int i;
               for(i=0; i<size; i++)  
       {  
           System.out.print(fibonacci(i)+ "  "); 
       }
     }
     public static int fibonacci(int n){
          if(n==0){
              return 0;
          } else if(n == 1){
              return 1;
          }else {
                return fibonacci(n-1) + fibonacci(n-2);
    }
          

     }
}

    
        
     
    
     

