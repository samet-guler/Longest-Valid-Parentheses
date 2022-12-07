package longestvalidparantheses;

import java.util.Scanner;

public class LongestValidParentheses {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the desired amount of parentheses.");

        String parentheses = input.nextLine();//

        String parentheses2 = parentheses.replaceAll("[^()]", "");//kullanıcının parantez karakteri harici girdiği bütün karakterleri kaldırır.

        String[] arr = parentheses2.split("");//İnputu arraye çevirir ve tek bir karakter olmaktan çıkarır

        short counter = 0;
        short counter1 = 0;
        String x = "()";
        String empty = "";

        for (String w : arr) {

            if (w.equals("(")) {
                counter++;

            } else if (w.equals(")")) {
                counter1++;
            }
        }
        if (counter1 > 0 && counter > 0) {

            int minValue = Math.min(counter1, counter);

            for (int i = 0; i < minValue; i++) {

                empty += x;
            }
            System.out.println("Output: " + empty.length());
            System.out.println("The longest valid parentheses substring is " + "\"" + empty + "\".");

        } else if (counter1 == 1 || counter == 1) {
            System.out.println("The number of parentheses is not enough.");
        } else if (counter == 0 && counter1 == 0) {
            if (parentheses.equals("")) {
                System.out.println("Output: " + 0);
            } else {
                System.out.println("There is no parentheses");
            }
        } else if (counter == 0 && counter1 > 0) {
            System.out.println("There is just " + "\"" + ")" + "\"" + " symbol here.");
        } else if (counter > 0 && counter1 == 0) {
            System.out.println("There is just " + "\"" + "(" + "\"" + " symbol here.");
        }
    }
}
