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
public class OftbSyncLog {

  private long oslId;
  private String oslType;
  private long oslCount;
  private String oslStatus;
  private String oslCreatedate;
  private String oslCreateuser;
  private String oslUpdatedate;
  private String oslUpdateuser;


}
