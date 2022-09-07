
package com.mycompany.hexadecimal;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meshack
 */
public class HexadecimalConversion {

    int num;
    int myArray[] = new int[10];

    public HexadecimalConversion() {

    }

    public HexadecimalConversion(int num) {
        this.num = num;
    }

    public int getNum() {
        if (num > 0 && num <= 10000) {
            return num;
        } else {
            throw new IllegalArgumentException("Number should be in range of 0 to 10000");
        }
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int change() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        num = input.nextInt();

        int rem;
        // For storing result
        String str2 = "";

        // Digits in hexadecimal number system
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (num > 0) {
            rem = num % 16;
            str2 = hex[rem] + str2;
            num = num / 16;
        }
        System.out.println("Decimal to hexadecimal: " + str2);

        return num;

    }

    public void addSecondToTenth() {
        int sumOfSecondToTenth = 0; // initialize sum

        //add values to the array
        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);

            System.out.println("Decimal to hexadecimal: " + i + ": ");
            num = input.nextInt();

            //add values to the array
            myArray[i] = num;

        }
        //display array
        System.out.println("Array values: " + Arrays.toString((myArray)));

        // add values from 2nd to last
        for (int i = 1; i < myArray.length; i++) {

            //add all values from 2nd to 10th
            sumOfSecondToTenth += myArray[i];
        }
        //display results
        System.out.println("Sum of values from 2nd tothe 10th: " + sumOfSecondToTenth);
    }

}
