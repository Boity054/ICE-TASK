/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginsystem;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class LoginSystem {

    public static void main(String[] args) {
     //Declarations
    String username;
    String password;
    int count=0;
   
    
    //creating the object of our scanner
     Scanner input= new Scanner(System.in);
     
     //Looping Statements
     while(count<5){
         
      //Assigning Statements and prompt
    System.out.println("Enter Username:");
     username=input.next();
     
     System.out.println("Enter Password:");
     password=input.next();
     
     if (username.equals("Boity") && password.equals("Password") ){
     System.out.println("Login successful!");   
     }
     else{
     System.out.println("Incorrect username or password, try again.");
     
     count++;
     }
     
     if (count==5){
     System.out.println(" You have exceeded your limits!");
     }
    }
    }
}
    
