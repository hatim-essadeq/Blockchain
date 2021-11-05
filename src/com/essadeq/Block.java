package com.essadeq;

import java.util.Arrays;

public class Block {
    private int hash;
    private String[] transactions;
    private int previousHash;

    public Block(String[] transactions, int previousHash) {
        this.transactions = transactions;
        this.previousHash = previousHash;

        // Generate Hash from previous block Data ana Hash
        Object[] previousBlock = {transactions, previousHash};
        this.hash = Arrays.hashCode(previousBlock);

    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    @Override
    public String toString() {
        return "Block{" +
                "hash=" + hash +
                ", transactions=" + Arrays.toString(transactions) +
                ", previousHash=" + previousHash +
                '}';
    }
}
