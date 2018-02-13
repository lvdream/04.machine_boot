package com.skylot.machine_boot.repository;

import com.skylot.machine_boot.base.BaseRepository;
import com.skylot.machine_boot.model.Classroom;
import com.skylot.machine_boot.model.database.IftbScheduleAction;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IftbScheduleActionRepository extends BaseRepository<IftbScheduleAction, Integer>, JpaSpecificationExecutor<IftbScheduleAction> {
}
