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
public class TstbMathineParking {

  private long tmpId;
  private String imaId;
  private String tmpCode;
  private String tmpPhysicalCode;
  private String tmpCarCode;
  private String tmpStatus;
  private String tmpCreatedate;
  private String tmpCreateuser;
  private String tmpUpdateuser;
  private String tmpUpdatedate;


}
