package com.blockchain1.Chain;

import com.blockchain1.Block.Block;

import java.util.ArrayList;

public class BlockChain {
    //Th e blockchain is implemented as an arraylist of blocks
    public static ArrayList<Block> blockChain = new ArrayList<>();
    public static ArrayList<String> data = new ArrayList<>();

    //Create the first block called the genesis block]
    public static Block createGenesisBlock(){
        return new Block(0, "\"Note that this is the beginning of the block\"", "0");
    }
}
