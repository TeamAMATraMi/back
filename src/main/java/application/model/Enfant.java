package application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Enfant {

    @Id
    @GeneratedValue
    private int id;

    private int idApprenant;
    private int age;

    public Enfant(int id, int idApprenant, int age) {
        this.id = id;
        this.idApprenant = idApprenant;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getIdApprenant() {
        return idApprenant;
    }

    public int getAge() {
        return age;
    }

    public void setIdApprenant(int idApprenant) {
        this.idApprenant = idApprenant;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
