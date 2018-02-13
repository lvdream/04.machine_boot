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
public class TstbMathineParkingLog {

  private long tmplId;
  private String imaId;
  private String tmplCar;
  private String tmplPhysicalCode;
  private String tmplCustomer;
  private String tmplType;
  private String tmplStatus;
  private String tmplCreatedate;
  private String tmplCreateuser;
  private String tmplUpdatedate;
  private String tmplUpdateuser;
  private String tmplDiectionCode;
  private String tmplOperationDuriationTotal;
  private String tmplOperationDuriationRouting;
  private String tmplOperationDuriationManually;
  private String tmplOperationDownCode;
  private String tmplOperationDuriationWeighting;
  private String tmplOperationEnergyCost;
  private String tmplOperationWeightingCode;


}
