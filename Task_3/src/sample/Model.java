package sample;

import java.util.LinkedList;
import java.util.List;

public class Model {

    public int[] createArray () {
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (200 + 1)) - 100;
        }
        return array;
    }

    public String foundNumbers (int[] array) {
        List<Integer> arrayNumbers = new LinkedList<>();
        for (int number: array) {
            if (number != 0 && number % 3 == 0) {
                arrayNumbers.add(number);
            }
        }

        return arrayNumbers.toString().replaceAll("^\\[|\\]$", "");
    }

}
