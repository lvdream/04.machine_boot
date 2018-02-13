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
public class IftbMachineAction {

  private String imaId;
  private long mmId;
  private String maId;
  private String imaCode;
  private String imaName;
  private String imaAddress;
  private String imaPort;
  private String imaStatus;
  private String imaCreatetime;
  private String imaCreateuser;
  private String imaUpdatetime;
  private String imaUpdateuser;

}
