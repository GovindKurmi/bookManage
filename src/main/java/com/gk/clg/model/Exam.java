package com.gk.clg.model;

import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class Exam {
    private int id;
    private String name;
    private double salary;

}
