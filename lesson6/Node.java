package lesson6;

public class Node<T extends Comparable<? super T>> {
    private final T value;

    private Node<T> leftChild;
    private Node<T> rightChild;

    public Node(T value) {
        this.value = value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public T getValue() {
        return value;
    }

    public boolean isLeftChild(T value) {
        return value.compareTo(getValue()) < 0;
    }

    public boolean isLeaf() {
        return leftChild == null && rightChild == null;
    }

    public boolean hasOnlyOneChild() {
//        return (leftChild != null && rightChild == null) || (leftChild == null && rightChild != null);
        return leftChild != null ^ rightChild != null;
    }

    private static int height(Node node) {
        return node == null ? 0 : 1 + Math.max(height(node.leftChild), height(node.rightChild));
    }

    public static boolean isBalanced(Node node) {
        return (node == null) ||
                isBalanced(node.leftChild) &&
                        isBalanced(node.rightChild) &&
                        Math.abs(height(node.leftChild) - height(node.rightChild)) <= 1;
    }
}
