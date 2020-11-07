package homework;

public class SmallestNumber {

    public static void main(String[] args) {
        //Display the smallest number from an array of number

        int[] numbers = {23,33,72,23,91,123,1};
        int smallest = Integer.MAX_VALUE;

        for(int i =0;i<numbers.length;i++) {
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest number in array is : " +smallest);
    }
}