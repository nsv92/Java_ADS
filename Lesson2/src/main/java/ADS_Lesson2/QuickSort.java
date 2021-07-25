package ADS_Lesson2;

public class QuickSort {

    public static void quickSort(Notebook[] arr, int low, int high) {
        if (arr.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        Notebook pivot = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while ((arr[i].getPrice() < pivot.getPrice()) ||
                    (arr[i].getPrice() == pivot.getPrice() && arr[i].getMemory() < pivot.getMemory()) ||
                    (arr[i].getPrice() == pivot.getPrice() && arr[i].getMemory() == pivot.getMemory() &&
                            arr[i].getBrand().ordinal() < pivot.getBrand().ordinal())) {
                i++;
            }
            while ((arr[j].getPrice() > pivot.getPrice()) ||
                    (arr[j].getPrice() == pivot.getPrice() && arr[j].getMemory() > pivot.getMemory()) ||
                    (arr[j].getPrice() == pivot.getPrice() && arr[j].getMemory() == pivot.getMemory() &&
                            arr[j].getBrand().ordinal() > pivot.getBrand().ordinal())) {
                j--;
            }
            if (i <= j) {
                Notebook temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }
    }

    public static void main(String[] args) {
        Notebook[] notebooks = new Notebook[5000];
        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = new Notebook();
        }
        long start = System.currentTimeMillis();
        int low = 0;
        int high = notebooks.length - 1;
        quickSort(notebooks, low, high);
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println("Quick sorting:" + time + " milliseconds");
    }
}
