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
public class IftbScheduleAction {

  private long isaId;
  private String isaBusinessObj;
  private String isaModuleId;
  private String isaItemId;
  private String isaScheduleDate;
  private String isaScheduleType;
  private String isaScheduleMessage;
  private String isaStatus;
  private String isaCreatedate;
  private String isaCreateuser;
  private String isaUpdatedate;
  private String isaUpdateuser;
  private String imaId;

}
