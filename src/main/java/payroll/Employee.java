package payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data //Lombok annotation to create getters, setters, equals, toString, hash,...
@Entity //JPA annotation (to make it ready for storage)

public class Employee {
    private @Id @GeneratedValue Long id; //further JPA annotations to mark it as primary key
    private String name;
    private String role;

    public Employee() {
    }

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
