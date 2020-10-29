package CH8.ReverseArrayChallenge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5,6};
        System.out.println("My array is " + Arrays.toString(myArray));
        reverse(myArray);
        System.out.println("Reversed array is " + Arrays.toString(myArray));

    }

    private static void reverse(int [] array){
        int temp;
        for(int i = 0; i < (array.length/2); i++){
            temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }
    }
}
