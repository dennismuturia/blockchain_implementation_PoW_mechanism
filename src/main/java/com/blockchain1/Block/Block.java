package com.blockchain1.Block;

import java.util.Date;

public class Block{
    public long timestamp;
    public int index;
    public String data;
    public String prev_hash;
    public String hash;

    //Constructor for the block class
    public Block(int index, String data, String prev_hash){
        this.index = index;
        this.data = data;
        this.timestamp = new Date().getTime();
        this.prev_hash = prev_hash;
        this.hash = getHash();//To be done in a few
    }
}
