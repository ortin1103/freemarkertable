package com.nitro;


import org.springframework.stereotype.Component;

@Component
public class Column {
  public   int id;
    long time;
    long rand;

    public Column() {
    }

    public Column(int id, long time, long rand) {
        this.id = id;
        this.time = time;
        this.rand = rand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getRand() {
        return rand;
    }

    public void setRand(long rand) {
        this.rand = rand;
    }
}
