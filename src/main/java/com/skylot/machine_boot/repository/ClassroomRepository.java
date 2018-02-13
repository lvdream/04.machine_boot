package com.skylot.machine_boot.repository;

import com.skylot.machine_boot.base.BaseRepository;
import com.skylot.machine_boot.model.Classroom;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClassroomRepository extends BaseRepository<Classroom, Integer>, JpaSpecificationExecutor<Classroom> {
}
