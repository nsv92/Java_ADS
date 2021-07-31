package lesson3.deque;

public class DequeueImpl<E> implements Deque<E> {

    public static final int HEAD_DEFAULT = 0;
    public static final int TAIL_DEFAULT = -1;
    protected final E[] data;
    protected int size;

    protected int tail;
    protected int head;

    public DequeueImpl(int maxSize) {
        this.data = (E[]) new Object [maxSize];
        this.head = HEAD_DEFAULT;
        this.tail = TAIL_DEFAULT;
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }
        data[head] = value;
        if (--head < 0) {
            head = size -1;
        }
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        if (isFull()) {
            return false;
        } if (++tail == size) {
            tail = 0;
        }
        data[tail] = value;
        return true;
    }

    @Override
    public E removeLeft() {
        if (isEmpty()) {
            return null;
        } if (++head == size) {
            head = 0;
        }
        E value = data[head];
        return value;
    }

    @Override
    public E removeRight() {
        if (isEmpty()){
            return null;
        }
        E i = data[tail];
        if (--tail > 0) {
            tail = size - 1;
        }
        return i;
    }

    @Override
    public boolean insert(E value) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peekFront() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return data.length == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {

    }
}
