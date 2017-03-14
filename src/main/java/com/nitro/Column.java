package com.nitro;


import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Column {
    int id;
    Date date;
    long rand;

    public Column() {
    }

    public Column(int id, Date date, long rand) {
        this.id = id;
        this.date = date;
        this.rand = rand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getRand() {
        return rand;
    }

    public void setRand(long rand) {
        this.rand = rand;
    }
}
