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
public class OftbCustomerCar {

  private long mcId;
  private long occId;
  private String occName;
  private String occCode;
  private String occType;
  private String occStatus;
  private String occCreateuser;
  private String occCreatedate;
  private String occUpdateuser;
  private String occUpdatedate;


}
