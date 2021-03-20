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
        
        
        // 6. Write a program to input temperature in Celsius & to print its Fahrenheit equivalent.
        Scanner input5 = new Scanner (System.in);
        System.out.println("Enter temperature in celsius: ");
        int celsius = input5.nextInt();
        float fahrenheit = ((celsius * (float)9/5) + 32);
        System.out.println("The temperature in fahrenheit is : " + fahrenheit);
        
        
        //7. Write a program to read base & altitude of a triangle & print its area:
        System.out.println("Enter the base of a triangle: ");
        int base = input.nextInt();
        System.out.println("Enter the altitude of a triangle");
        int altitude = scanner.nextInt();
        float area = (float) 1/2 * (base * altitude);
        System.out.println("The area of triangle is: " + area);
        
        // 8. Write a program to calculate simple interest amount for deposit amount (P) kept in bank for (n) years at the rate of (r) simple interest per annum.
        System.out.println("Enter the deposit amount in bank: ");
        int p = input.nextInt();
        System.out.println("Enter the time(in years) for which the amount is kept: ");
        int n = input.nextInt();
        System.out.println("Enter the rate: ");
        float r = input.nextFloat();

        float SI = (float) p * n * r;
        System.out.println("The simple interest is: " + SI);
        
        // 9. Write a program to input four numbers and print percentages of each numbers on their sum.
        System.out.println("Enter four numbers");
        int a1 = input.nextInt();
        int b1 = input.nextInt();
        int c1 = input.nextInt();
        int d1 = input.nextInt();
        int sum1 = a1 + b1 + c1 + d1;
        System.out.println("Percentage of a in sum: " + (float)a1/sum1 *100 );
        System.out.println("Percentage of b in sum: " + (float)b1/sum1 *100 );
        System.out.println("Percentage of c in sum: " + (float)c1/sum1 *100 );
        System.out.println("Percentage of d in sum: " + (float)d1/sum1 *100 );
        
        // 10.	Write a program to evaluate the expression
        // (i) a + b (ii) a – b (iii) a x b (iv) a/b (v) Remainder of a/b.
        System.out.println("Enter two numbers a and b: ");
        int a2 = input.nextInt();
        int b2 = input.nextInt();
        int sum2 = a2+b2;
        int diff2 = a2-b2;
        int mul2 = a2*b2;
        int division2 = a2/b2;
        int remainder2 = a2%b2;
        System.out.println("(i) a + b = " + sum2 +
                "\n (ii) a – b = " + diff2 +
                "\n (iii) a x b = " + mul2 +
                "\n (iv) a/b = " + division2 +
                "\n (v) Remainder of a/b = " + remainder2);
        
        // 11. Write a program to input 5 digit integer number and print sum of digits in it.
        System.out.println("Enter 5 digit number: ");
        int num = input.nextInt();
        int sum3 = 0;
        while(num!=0){
            int rem = num%10;
            sum3+=rem;
            num = num/10;
        }
        System.out.println("The sum is: " + sum3);
        
        // 12. Given a 5 digit integer number. Write a program to print it in reverse order
        // (e.g. 92674  47629)
        System.out.println("Enter 5 digit number: ");
        int num1 = input.nextInt();
        int rev = 0;
        while(num1!=0){
            int rem = num1%10;
            rev = (rev*10) + rem;
            num1 = num1/10;
        }
        System.out.println("Reverse number is: " + rev);
        
        
        //  * 13.	Write a program to compute:
        // 2.9678 x 10e-27 + 0.876 x 10e-38
        // F = 7.025 x 10e16 – 9.75 x 10e12
        float numerator = (float) ((float) (2.967 * Math.pow(10,-27)) + (0.876*Math.pow(10,-38)));
        float denominator = (float) ((7.025*Math.pow(10,16)) - (9.75*Math.pow(10,12)));
        float F = numerator / denominator;
        System.out.println(" The value of F is : " + F);
    }
            
}
