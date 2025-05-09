package assignment7;

import java.util.*;

class ass_7_q1 {
    static class Node {
        char ch;
        int freq;
        Node left, right;

        Node(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        Node(int freq, Node left, Node right) {
            this.freq = freq;
            this.left = left;
            this.right = right;
        }
    }

    static class FrequencyComparator implements Comparator<Node> {
        public int compare(Node a, Node b) {
            return a.freq - b.freq;
        }
    }

    public static void printCodes(Node root, String code) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            System.out.println(root.ch + ": " + code);
            return;
        }

        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }

    public static void huffmanCoding(char[] chars, int[] freqs) {
        PriorityQueue<Node> pq = new PriorityQueue<>(new FrequencyComparator());

        for (int i = 0; i < chars.length; i++) {
            pq.add(new Node(chars[i], freqs[i]));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();

            Node parent = new Node(left.freq + right.freq, left, right);
            pq.add(parent);
        }

        Node root = pq.peek();
        printCodes(root, "");
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] freqs = { 5, 9, 12, 13, 16, 45 };

        System.out.println("Huffman Codes:");
        huffmanCoding(chars, freqs);
    }
}
