package com.skylot.machine_boot.base;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class SpecificationOperator {
    /**
     * 操作符的key，如查询时的name,id之类
     */
    private String key;
    /**
     * 操作符的value，具体要查询的值
     */
    private Object value;
    /**
     * 操作符，自己定义的一组操作符，用来方便查询
     */
    private String oper;
    /**
     * 连接的方式：and或者or
     */
    private String join;

}
