package com.skylot.machine_boot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@Table(name = "t_classroom")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String grade;
}
