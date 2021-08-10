package lesson5;

import java.util.ArrayList;

public class Backpack {
    int maxWeight;
    int bestPrice;
    ArrayList<thing> allThings = new ArrayList<>();
    ArrayList<thing> topPick = new ArrayList<>();

    public static void main(String[] args) {
        Backpack backpack = new Backpack(11);
        backpack.allThings.add(new thing("a", 1, 1));
        backpack.allThings.add(new thing("b", 3, 8));
        backpack.allThings.add(new thing("c", 5, 18));
        backpack.allThings.add(new thing("d", 6, 22));
        backpack.allThings.add(new thing("e", 7, 28));
        backpack.getSets(backpack.allThings);
        for (int i = 0; i < backpack.topPick.size(); i++) {
            System.out.println(backpack.topPick.get(i).toString());
        }
    }

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

//    Рекурсивно перебираем все варианты, удаляя по одному
    public void getSets(ArrayList<thing> allThings) throws NullPointerException{
        if (allThings == null) {
            throw new NullPointerException();
        } if (allThings.size() > 0) {
            check(allThings);
        }
        for (int i = 0; i < allThings.size(); i++) {
            ArrayList<thing> list = (ArrayList<thing>) allThings.clone();
            list.remove(i);
            getSets(list);
        }
    }

    public int getPickWeight(ArrayList<thing> list) {
        int weight = 0;
        for (int i = 0; i < list.size(); i++) {
            weight += list.get(i).weight;
        }
        return weight;
    }

    public int getPickPrice(ArrayList<thing> list) {
        int price = 0;
        for (int i = 0; i < list.size(); i++) {
            price += list.get(i).price;
        }
        return price;
    }

// Проверка на соответствие условиям
    public void check(ArrayList<thing> list) {
        if (topPick == null) {
            if (getPickWeight(list) <= maxWeight) {
                topPick = list;
                bestPrice = getPickPrice(list);
            }
        } else if (getPickWeight(list) <= maxWeight && getPickPrice(list) > bestPrice) {
            topPick = list;
            bestPrice = getPickPrice(list);
        }
    }

    public static class thing {
        String name;
        int weight;
        int price;

        public thing (String name, int weight, int price) {
            this.name = name;
            this.weight = weight;
            this.price = price;
        }

        @Override
        public String toString() {
            return "thing{" +
                    "name='" + name + '\'' +
                    ", weight=" + weight +
                    ", price=" + price +
                    '}';
        }
    }
}
