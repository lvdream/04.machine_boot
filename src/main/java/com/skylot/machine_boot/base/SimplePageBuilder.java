package com.skylot.machine_boot.base;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class SimplePageBuilder {
    public static final int size = 15;

    public static Pageable generate(int page, int size, Sort sort) {
        if (sort == null) return new PageRequest(page, size);
        return new PageRequest(page, size, sort);
    }

    public static Pageable generate(int page) {
        return generate(page, size, null);
    }

    public static Pageable generate(int page, Sort sort) {
        return generate(page, size, sort);
    }
}
