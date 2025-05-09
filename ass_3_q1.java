package assignment3;

class ass_3_q1 {
    private int[] hashTable;
    private int size;

    public ass_3_q1(int size) {
        this.size = size;
        hashTable = new int[size];
        for (int i = 0; i < size; i++) hashTable[i] = -1;
    }

    public void insert(int key) {
        int index = key % size;
        while (hashTable[index] != -1) {
            index = (index + 1) % size;
        }
        hashTable[index] = key;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " --> " + hashTable[i]);
        }
    }

    public static void main(String[] args) {
        ass_3_q1 ht = new ass_3_q1(10);
        int[] keys = {23, 43, 13, 27};
        for (int key : keys) ht.insert(key);
        ht.display();
    }
}

