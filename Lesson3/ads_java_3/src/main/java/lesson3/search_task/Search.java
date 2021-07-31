package lesson3.search_task;

import java.util.Arrays;

public class Search {
    public static int search(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int base = (start + end) / 2;
            if (arr[base] != base + 1) {
                if (arr[base - 1] == base || base == 0) {
                    return base + 1;
                }
                end = base - 1;
            } else {
                start = base + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int lostNum = 25;
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            if (arr[i] >= lostNum) {
                arr[i] = i + 2;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr));
    }
}

