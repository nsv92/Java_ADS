package ADS_Lesson2;

import java.util.Random;

public class Notebook {
    private int price;
    private int memory;
    private Brand brand;



//    public Notebook(int price, int memory, String brand) {
//        this.price = price;
//        this.memory = memory;
//        this.brand = brand;
//    }

    public Notebook() {
        int[] prices = {500, 600, 700, 800, 900, 1000};
        Random random = new Random();
        int randomPrice = prices[random.nextInt(prices.length)];
        int[] memories = {4, 8, 12};
        int randomMemory = memories[random.nextInt(memories.length)];
        Brand randomBrand = Brand.values()[random.nextInt(Brand.values().length)];
        this.price = randomPrice;
        this.memory = randomMemory;
        this.brand = randomBrand;
    }

//    public Notebook getRandomNotebook() {
//        int[] prices = {500, 600, 700, 800, 900, 1000};
//        Random random = new Random();
//        int randomPrice = prices[random.nextInt(prices.length)];
//        int[] memories = {4, 8, 12};
//        int randomMemory = memories[random.nextInt(memories.length)];
//        Brand randomBrand = Brand.values()[random.nextInt(Brand.values().length)];
//        return new Notebook(randomPrice, randomMemory, randomBrand.toString());
//    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }


}
