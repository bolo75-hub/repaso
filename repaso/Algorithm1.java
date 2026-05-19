package repaso;

import java.util.Scanner;

public class Algorithm1 {
    public static void main(String[] args) {
        //inputs: three numbers, can be represented by three variables
        int a, b, c;
        //create a scanner object to establish communication between our app and the console
        Scanner sc = new Scanner(System.in);
        //read three numbers from the console respectively
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        Long startTime = System.nanoTime();

        System.out.println("the result is: " + combineDigits(a,b,c));
        Long endTime = System.nanoTime();
        System.out.println("the time consumed " + (endTime - startTime));
        sc.close();
    }

    private static int combineDigits(int a, int b, int c) {
        //logical operator: or ||, and &&, not !
        if(a > 9 || a < 0 || b > 9 || b < 0 || c > 9 || c < 0) {
            System.out.println("your number should be single digit and non negative");
            //throw new InvalidArgsException()
            return 0;
        }
        //implementation of the algorithm
        //a = a * 100;
        a *= 100;
        b *= 10;
        //output
        return a + b + c;
    }
}
