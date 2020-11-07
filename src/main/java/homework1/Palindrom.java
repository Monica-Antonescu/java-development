package src.main.java.homework1;

public class Palindrom {

    public static void main(String[] args) {
        //Check if a number is palindrom
        int number = 123321;
        int reversedNumber = 0;
        int aux = number;

        while (aux != 0) {
            reversedNumber = reversedNumber * 10 + aux % 10;
            aux = aux / 10;

        }
        if (reversedNumber == number) {
            System.out.println("Number is a palindrom, number = " + number);
        } else {
            System.out.println("Number is not a palindrom, number = " + number);
        }
    }
}
