/*
 * Just getting to grips with github
 * 
 * 
 */
package javaapplication2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Steven Barnes
 */
public class JavaApplication2 {

    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("What is you favourite number?");
        int number = 0;
        
        try{
            number = scan.nextInt();
            scan.close();
        }
        catch(InputMismatchException e){
            number = 7;
            System.out.println("I'll choose for you then if you don't know what numbers are.");
        }
        finally{
            System.out.println("Your favorite number is " + number);
        }
        
        
        
    }
    
}
