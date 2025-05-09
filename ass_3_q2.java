package assignment3;

class ass_3_q2 {
    private int[] hashTable;
    private int size;

    public ass_3_q2(int size) {
        this.size = size;
        hashTable = new int[size];
        for (int i = 0; i < size; i++) hashTable[i] = -1;
    }

    public void insert(int key) {
        int index = key % size;
        int i = 0;
        while (hashTable[(index + i * i) % size] != -1) {
            i++;
        }
        hashTable[(index + i * i) % size] = key;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " --> " + hashTable[i]);
        }
    }

    public static void main(String[] args) {
        ass_3_q2 ht = new ass_3_q2(10);
        int[] keys = {23, 43, 13, 27};
        for (int key : keys) ht.insert(key);
        ht.display();
    }
}
