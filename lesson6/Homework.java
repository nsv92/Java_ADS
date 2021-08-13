package lesson6;

public class Homework {
    public static void main(String[] args) {
        int balancedTrees = 0;
        int unbalancesTrees = 0;
        for (int i = 0; i < 250; i++) {
            TreeImpl<Integer> tree = new TreeImpl<>(6);
            for (int j = 0; j < 12; j++) {
                int n = (int) (Math.random()*(200+1)) - 100;
                tree.add(n);
            }
//            tree.display();
            if (Node.isBalanced(tree.getRoot())) {
                balancedTrees++;
            } else unbalancesTrees++;
        }
        System.out.println("Кол-во сбалансированных деревьев: " + balancedTrees);
        System.out.println("Кол-во несбалансированных деревьев: " + unbalancesTrees);
        double p = ((double) unbalancesTrees/((double) balancedTrees + (double) unbalancesTrees)) * 100.0;
        System.out.println("Процент несбалансированных дереьев: " + p + "%");
    }
}
