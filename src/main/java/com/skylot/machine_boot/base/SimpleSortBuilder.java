package com.skylot.machine_boot.base;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import java.util.ArrayList;
import java.util.List;

public class SimpleSortBuilder {
    public static Sort generateSort(String... fields) {
        List<Order> orders = new ArrayList<Order>();
        for (String f : fields) {
            orders.add(generateOrder(f));
        }
        return new Sort(orders);
    }

    private static Sort.Order generateOrder(String f) {
        Sort.Order order = null;
        String[] ff = f.split("_");
        if (ff.length >= 2) {
            if (ff[1].equals("d")) {
                order = new Sort.Order(Sort.Direction.DESC, ff[0]);
            } else {
                order = new Sort.Order(Sort.Direction.ASC, ff[0]);
            }
            return order;
        }
        order = new Order(f);
        return order;
    }
}
