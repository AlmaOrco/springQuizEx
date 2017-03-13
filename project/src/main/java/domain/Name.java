package domain;

import java.io.Serializable;

import domain.Trabajo;

public class Name implements Serializable {
    private static final long serialVersionUID = 5658716793957904104L;
    private String name;
    private Trabajo trabajo;
    
    public Name() {
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Trabajo getTrabajo() {
        return this.trabajo;
    }
    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }
}
