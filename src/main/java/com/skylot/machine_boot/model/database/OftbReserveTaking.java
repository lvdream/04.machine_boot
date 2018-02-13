package com.skylot.machine_boot.model.database;

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
public class OftbReserveTaking {

  private long ortId;
  private long mcId;
  private String imaId;
  private String ortPhysicalCode;
  private String ortReserveTime;
  private String ortStatus;
  private String ortCreatedate;
  private String ortCreateuser;
  private String ortUpdatedate;
  private String ortUpdateuser;


}
