package com.skylot.machine_boot;

import com.skylot.machine_boot.base.*;
import com.skylot.machine_boot.model.database.TstbMathineParkingLog;
import com.skylot.machine_boot.repository.ClassroomRepository;
import com.skylot.machine_boot.repository.TstbMathineParkingLogRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MachineBootApplicationTests {
    @Autowired
    private ClassroomRepository classroomRepository;
    @Autowired
    private TstbMathineParkingLogRepository tstbMathineParkingLogRepository;
//    @Autowired
//    private Constant constant;
    @Autowired
    private Timer timer;
    @Value("${skylot.machine.id}")
    private String machineID;

    @Test
    public void contextLoads() {
        log.warn(machineID);
        classroomRepository.findAll(
                new SimpleSpecificationBuilder("id", ">", 4)
                        .addOr("name", ":", "a").add("name", "=", "3")
                        .generateSpecification(), SimplePageBuilder.generate(0, SimpleSortBuilder.generateSort("name")));
        TstbMathineParkingLog tstbMathineParkingLog = TstbMathineParkingLog.builder().build();
        tstbMathineParkingLog.setTmplCar("粤B12345");
//        tstbMathineParkingLog.setTmplCreatedate(DateFormatUtils.format(new Date(), constant.getSTR_DATE_PATTERN()));
//        tstbMathineParkingLogRepository.save(tstbMathineParkingLog);
    }

}
