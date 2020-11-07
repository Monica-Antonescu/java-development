package src.main.java.homework1;

public class NumbersSum {

    public static void main(String[] args) {
        //Calculate the sum of the first 100 numbers higher than 0
        int sum = 0;

        for (int i = 1; i <= 100; ++i) {
            sum += i;
        }

        System.out.println("Sum of first 100 numbers is: " + sum);
    }

}