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
public class OftbMathineItem {

  private String imaId;
  private long omiId;
  private String omiCode;
  private String omiPhysicalCode;
  private String omiName;
  private String omiRate;
  private String omiStartdate;
  private String omiEnddate;
  private String omiStatus;
  private String omiCreateuser;
  private String omiCreatedate;
  private String omiUpdateuser;
  private String omiUpdatedate;


}
