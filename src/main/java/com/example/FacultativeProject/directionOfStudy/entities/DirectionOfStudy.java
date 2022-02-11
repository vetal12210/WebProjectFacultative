package com.example.FacultativeProject.directionOfStudy.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * DirectionOfStudy entity
 *
 * @author V.Dulsky
 */

@Getter
@Setter
@NoArgsConstructor
@ToString
public class DirectionOfStudy implements Serializable {

    private int id;
    private String name;
    private int price;
    private int users_id;
    private int statuses_id;

    public DirectionOfStudy(int id, String name, int price, int users_id, int statuses_id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.users_id = users_id;
        this.statuses_id = statuses_id;
    }
}
