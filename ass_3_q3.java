package assignment3;


import java.util.*;

class ass_3_q3 {
    private LinkedList<Integer>[] hashTable;
    private int size;

    @SuppressWarnings("unchecked")
    public ass_3_q3(int size) {
        this.size = size;
        hashTable = new LinkedList[size];
        for (int i = 0; i < size; i++) hashTable[i] = new LinkedList<>();
    }

    public void insert(int key) {
        int index = key % size;
        hashTable[index].add(key);
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + " --> ");
            for (int key : hashTable[i]) {
                System.out.print(key + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ass_3_q3 ht = new ass_3_q3(10);
        int[] keys = {23, 43, 13, 27};
        for (int key : keys) ht.insert(key);
        ht.display();
    }
}
