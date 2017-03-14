package com.nitro;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

@Service
public class TableService {
    @Autowired
    Column column;

    public Column getColumn(int i) {
            column = new Column(i, new Date().getTime(), new Random().nextLong());
            return column;

    }
}
