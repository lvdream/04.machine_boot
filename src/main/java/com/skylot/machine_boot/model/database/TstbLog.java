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
public class TstbLog {

  private long tlId;
  private String tlCreatedate;
  private String tlCreateThread;
  private String tlLevel;
  private String tlMessage;


}
