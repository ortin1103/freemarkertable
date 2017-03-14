package com.nitro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/")
public class TableController {
    @Autowired
    TableService tableService;


    @RequestMapping(value = "table",method = RequestMethod.GET)
    public String getTable(Map<String,Object> model ){
        for (int i =1 ; i<100 ; i++) {
            model.put("table ", tableService.getColumn(i));
        }
        return "table";

    }


}
