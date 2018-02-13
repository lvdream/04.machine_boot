package com.skylot.machine_boot.repository;

import com.skylot.machine_boot.base.BaseRepository;
import com.skylot.machine_boot.model.database.OftbMathineItem;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OftbMacthineItemRepository extends BaseRepository<OftbMathineItem, Integer>, JpaSpecificationExecutor<OftbMathineItem> {
}
