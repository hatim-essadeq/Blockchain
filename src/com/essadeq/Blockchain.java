package com.essadeq;

import java.util.ArrayList;
import java.util.List;

public class Blockchain {

    private List<Block> blocks;

    public Blockchain() {
        this.blocks = new ArrayList<>();
    }

    public void add(Block block) {
        blocks.add(block);
    }

    public void print() {
        System.out.println(blocks);
    }
}
