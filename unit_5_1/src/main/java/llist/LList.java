package llist;

import java.util.NoSuchElementException;

/**
 * Собственная реализация коллекции типа односвязный список (не generic)
 */
public class LList {

    /**
     * Добавление элемента в конец
     * @param val Добавляемое значение
     */
    public void add(Object val) {
        if (root == null) {
            root = new Node(val);
        } else {
            Node lastNode = lastNode();
            lastNode.next = new Node(val);
        }
        size+=1;
    }

    /**
     * Удаляет первый элемент (root)
     * @return Удалён или не удалён элемент
     */
    public boolean remove() {
        if(root == null) {
            return false;
        } else {
            root = root.next;
        }
        size-=1;
        return true;
    }

    /**
     * Получение элемента по индексу
     * @param index Индекс искомого элемента
     * @return Возвращает элемент по данному индексу
     */
    public Object get(int index) {
        checkIndexValid(index);
        Node node = root;
        for(int i = 0;i < index;i++) {
            node = node.next;
        }
        return node.val;
    }

    /**
     * @return Возвращает первый элемент (root)
     * @exception NoSuchElementException если коллекция пуста
     */
    public Object getFirst() {
        if(root == null) {
            throw new NoSuchElementException("Нет искомого значения. Коллекция пуста");
        } else {
            return root.val;
        }
    }

    /**
     * @return Возвращает последний элемент
     * @exception NoSuchElementException если коллекция пуста
     */
    public Object getLast() {
        if(root == null) {
            throw new NoSuchElementException("Нет искомого значения. Коллекция пуста");
        } else {
            Node lastNode = lastNode();
            return lastNode.val;
        }
    }

    /**
     * Очищает коллекцию
     */
    public void clear(){
        Node node = root;
        while(node != null) {
            Node next = node.next;
            node.val = null;
            node.next = null;
            node = next;
        }
        root = null;
        size = 0;
    }

    /**
     * @return Возвращает количество элементов коллекции
     */
    public int size() {
        return size;
    }

    private Node root;
    private int size = 0;

    private class Node {
        Node next;
        Object val;

        public Node(Object val){
            this.val = val;
        }
    }

    private void checkIndexValid(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException("Индекс больше размеров коллекции");
        } if(index < 0) {
            throw new IndexOutOfBoundsException("Индекс имеет значение меньше 0");
        }
    }

    private Node lastNode() {
        if(root == null){
            throw new NoSuchElementException("Коллекция пуста");
        } else {
            Node node = root;
            while(node.next != null) {
                node = node.next;
            }
            return node;
        }
    }
}
