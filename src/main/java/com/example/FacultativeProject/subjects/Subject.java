package com.example.FacultativeProject.subjects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Subject entity
 *
 * @author V.Dulsky
 */

@Getter
@Setter
@ToString
public class Subject implements Serializable {

    private int id;
    private String sname;
    private int categories_id;

    public Subject(int id, String sname, int categories_id) {
        this.id = id;
        this.sname = sname;
        this.categories_id = categories_id;
    }

    public Subject(String sname, int categories_id) {
        this.sname = sname;
        this.categories_id = categories_id;
    }

    public Subject() {

    }

}
