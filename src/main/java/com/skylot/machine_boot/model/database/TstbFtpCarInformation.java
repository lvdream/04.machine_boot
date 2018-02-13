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
public class TstbFtpCarInformation {

  private long tfcId;
  private String imaId;
  private String tfcCarCode;
  private long tfcStatus;
  private String tfcCreatetime;
  private String tfcCreateuser;
  private String tfcUpdatetime;
  private String tfcUpdateuser;


}
