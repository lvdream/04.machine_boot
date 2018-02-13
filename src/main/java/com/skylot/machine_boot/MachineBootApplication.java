package com.skylot.machine_boot;

import com.skylot.machine_boot.base.BaseRepositoryFactoryBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJpaRepositories(basePackages = {"com.skylot.machine_boot"},
        repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)


@SpringBootApplication
@EnableScheduling
@EnableAsync
@Slf4j
public class MachineBootApplication {


    public static void main(String[] args) {
        SpringApplication.run(MachineBootApplication.class, args);
    }
}
