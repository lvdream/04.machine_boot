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
public class OftbCodeInfo {

  private long ociId;
  private String imaId;
  private String ociPhysicalCode;
  private String ociCodeUrl;
  private String ociPassword;
  private String ociStatus;
  private String ociCreatedate;
  private String ociCreateuser;
  private String ociUpdatedate;
  private String ociUpdateuser;


}
