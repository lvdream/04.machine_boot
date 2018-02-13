package com.skylot.machine_boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MyController {
    @RequestMapping("/thing")
    public Map thing() {
        Map a = new HashMap();
        a.put("2", "2");
        a.put(1, "1");
        a.put("3", "2");
        return a;
    }
}
