package ADS_Lesson2;

public class BubbleSorting {
    public static void main(String[] args) {
        Notebook[] notebooks = new Notebook[5000];
        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = new Notebook();
        }
        long start = System.currentTimeMillis();
        boolean sorted = false;
        Notebook temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < notebooks.length - 1; i++) {
                int iBrand = notebooks[i].getBrand().ordinal();
                int nextBrand = notebooks[i + 1].getBrand().ordinal();
                if ((notebooks[i].getPrice() > notebooks[i + 1].getPrice()) ||
                        (notebooks[i].getPrice() == notebooks[i + 1].getPrice()
                                && notebooks[i].getMemory() > notebooks[i + 1].getMemory()) ||
                        (notebooks[i].getPrice() == notebooks[i + 1].getPrice()
                                && notebooks[i].getMemory() == notebooks[i + 1].getMemory() &&
                                iBrand > nextBrand)) {
                    temp = notebooks[i];
                    notebooks[i] = notebooks[i + 1];
                    notebooks[i + 1] = temp;
                    sorted = false;
                }
                if (notebooks[i].getPrice() == notebooks[i + 1].getPrice()
                        && notebooks[i].getMemory() > notebooks[i + 1].getMemory()) {
                }
            }
        }
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println("Bubble sorting:" + time + " milliseconds");
    }
}