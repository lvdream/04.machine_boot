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
public class MstbCustomer {

  private long mcId;
  private String mcCode;
  private String mcPass;
  private String mcNameCn;
  private String mcMobile;
  private String mcType;
  private String mcStatus;
  private String mcVerifyCode;
  private String mcCreatedate;
  private String mcCreateuser;
  private String mcUpdatedate;
  private String mcUpdateuser;


}
