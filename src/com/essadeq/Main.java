package com.essadeq;

public class Main {
    Blockchain blockchain = new Blockchain();

    Main() {
        String[] transaction1 = {"Hatim send 10 bitcoin to Houssam "};
        Block block1 = new Block(transaction1, 0);
        blockchain.add(block1);

        String[] transaction2 = {"Hatim send 10 bitcoin to Houssam", "Rida Send 1 bitcoin to Me"};
        Block block2 = new Block(transaction2, block1.getHash());
        blockchain.add(block2);

        blockchain.print();
    }


    public static void main(String[] args) {
        new Main();
    }
}
