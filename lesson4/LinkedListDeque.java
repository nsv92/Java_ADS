package lesson4;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class LinkedListDeque<E> implements Deque<E> {
    private final TwoSideLinkedList<E> twoSideLinkedList;

    public LinkedListDeque() {
        this.twoSideLinkedList = new TwoSideLinkedListImpl<>();
    }

    public String toString() {
        return twoSideLinkedList.toString();
    }

    @Override
    public void addFirst(E e) {
        twoSideLinkedList.insertFirst(e);
    }

    @Override
    public void addLast(E e) {
        twoSideLinkedList.insertLast(e);
    }

    @Override
    public boolean offerFirst(E e) {
        return false;
    }

    @Override
    public boolean offerLast(E e) {
        return false;
    }

    @Override
    public E removeFirst() {
        return twoSideLinkedList.removeFirst();
    }

    @Override
    public E removeLast() {
        return twoSideLinkedList.removeLast();
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return twoSideLinkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return twoSideLinkedList.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return twoSideLinkedList.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }
}
