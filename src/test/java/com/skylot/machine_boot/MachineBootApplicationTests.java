package com.skylot.machine_boot;

import com.skylot.machine_boot.repository.ClassroomRepository;
import com.skylot.machine_boot.base.SimplePageBuilder;
import com.skylot.machine_boot.base.SimpleSortBuilder;
import com.skylot.machine_boot.base.SimpleSpecificationBuilder;
import com.skylot.machine_boot.base.Timer;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MachineBootApplicationTests {
    @Autowired
    private ClassroomRepository classroomRepository;
    @Autowired
    private Timer timer;
    @Value("${skylot.machine.id}")
    private String machineID;

    @Test
    public void contextLoads() {
        try {
            timer.doTask1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.warn(machineID);
        classroomRepository.findAll(
                new SimpleSpecificationBuilder("id", ">", 4)
                        .addOr("name", ":", "a").add("name","=","3")
                        .generateSpecification(), SimplePageBuilder.generate(0, SimpleSortBuilder.generateSort("name")));

    }

}
