package com.skylot.machine_boot.repository;

import com.skylot.machine_boot.base.BaseRepository;
import com.skylot.machine_boot.model.Classroom;
import com.skylot.machine_boot.model.database.IftbMachineAction;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IftbMachineActionRepository extends BaseRepository<IftbMachineAction, String>, JpaSpecificationExecutor<IftbMachineAction> {
}
