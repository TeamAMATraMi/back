package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Enfant {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "idapprenantref")
    private int idApprenantRef;
    private int age;

    public Enfant() {
    }

    public Enfant(int id, int idApprenantRef, int age) {
        this.id = id;
        this.idApprenantRef = idApprenantRef;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdApprenantRef() {
        return idApprenantRef;
    }

    public void setIdApprenantRef(int idApprenantRef) {
        this.idApprenantRef = idApprenantRef;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
