/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume;
import java.util.Scanner;
/**
 *
 * @author sammyview80
 */
public class Volume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //1. Print name, rollno and address on the screen
        System.out.println("Name: Saman Shrestha. \n Roll-No:018-331 \n Address: Changu Narayan");
        
        
//      //2. Display sum of two integers
        Scanner input = new Scanner (System.in);
        System.out.println("Please Enter two number:");
        int a = input.nextInt();
        int b = input.nextInt();
        
        // Sum
        int sum = a+b;
        // Product
        int product = a*b;
        // Difference 
        int difference = a-b;
        // Modulus
        int modulus = a%b;
        System.out.println("Sum of number: " + sum);
        System.out.println("Product of number: " + product);
        System.out.println("Difference of number: " + difference);
        System.out.println("Modulus of number: " + modulus);
        
        
        // 3. Simple intrest
        Scanner input2 = new Scanner (System.in);
        System.out.println("Please enter principle, time, rate: ");
        double principle = input2.nextDouble();
        double time = input2.nextDouble();
        double rate = input2.nextFloat();
        double sIntrest = principle*time*rate / 100;
        System.out.println("Simple Intrest: " + sIntrest);
        
        
        // 4. Calculate area of circle
        Scanner input3 = new Scanner (System.in);
        System.out.println("Please enter the radius:");
        double radius = input3.nextDouble();
        double areaCircle = 2*3.14*radius*radius;
        System.out.println("Area of circle: " + areaCircle);
        
        // 5. Min and max
        Scanner input4 = new Scanner (System.in);
        System.out.println("Please enter two number a & b: ");
        double no1 = input4.nextDouble();
        double no2 = input4.nextDouble();
        if(no1> no2){
            System.out.println(no1 + ">" + no2);
        }
        else if(no1== no2){
            System.out.println(no1 + "=" + no2);
        }
        else{
            System.out.println(no1 + "<" + no2);
        }
        
        
        // 
    }
    
}
