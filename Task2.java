package Lesson2;

public class Task2 {

    public static void main(String[] args) {

        int[] arr = new int[8];
        System.out.print("Полученный массив: ");


        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(" " + arr[i]);
        }
    }
}
