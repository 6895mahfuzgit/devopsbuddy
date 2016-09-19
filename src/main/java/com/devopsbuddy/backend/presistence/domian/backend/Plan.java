package com.devopsbuddy.backend.presistence.domian.backend;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by MahfuzCSE'11 on 19-Sep-16.
 */
@Entity
public class Plan implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int id;
    private String name;


    public Plan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
