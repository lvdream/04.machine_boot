package com.skylot.machine_boot.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Component
public class Constant {
    @Value("${skylot.dateformater}")
    private String STR_DATE_PATTERN;
}
