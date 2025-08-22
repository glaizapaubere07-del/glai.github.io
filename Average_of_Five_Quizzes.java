/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package average_of_five_quizzes;

/**
 *
 * @author INT-PC12
 */import java.util.Scanner;
public class Average_of_Five_Quizzes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("===== Average of Five Quizzes =====");
        System.out.println();
        System.out.println("Enter Quiz No. 1: ");
        float a = scan.nextInt();
        System.out.println("Enter Quiz No. 2: ");
        float b = scan.nextInt();
        System.out.println("Enter Quiz No. 3: ");
        float c = scan.nextInt();
        System.out.println("Enter Quiz No. 4: ");
        float d = scan.nextInt();
        System.out.println("Enter Quiz No. 5: ");
        float e = scan.nextInt();
        float sum = (a+b+c+d+e);
        float quotient = (sum/5);
        System.out.println();
        System.out.println("The sum of " + a + " and " + b + " and " + c +" and " + d + " and " + e +" is " + sum + " .");
        System.out.println();
        System.out.println("The average is " + quotient + ".");
        System.out.println("\n\n");
        System.out.println("=====END OF PROGRAM=====");
        System.out.println();
    }
}
