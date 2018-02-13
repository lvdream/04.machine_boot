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
public class IftbItemCustomer {

  private long iicId;
  private long mcId;
  private long omiId;
  private String iiicStatus;
  private String iicStartdate;
  private String iicEnddate;
  private String iicCost;
  private String iicFormula;
  private String iicCreatedate;
  private String iicCreateuser;
  private String iicUpdatedate;
  private String iicUpdateuser;
  private String iccCarCode;

}
