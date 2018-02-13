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
public class SchemaVersion {

  private long installedRank;
  private String version;
  private String description;
  private String type;
  private String script;
  private long checksum;
  private String installedBy;
  private java.sql.Timestamp installedOn;
  private long executionTime;
  private long success;


}
