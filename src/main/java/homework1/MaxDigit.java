package src.main.java.homework1;

public class MaxDigit {

    public static void main(String[] args) {
        //Display the max digit from a number
        int number = 98738;
        int digit = 0;

        while (number != 0) {
            if (number % 10 > digit) {
                digit = number % 10;
            }
            number = number / 10;
        }
        System.out.println("Max digit = " + digit);
    }
}
