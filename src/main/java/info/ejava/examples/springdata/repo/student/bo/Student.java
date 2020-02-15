package info.ejava.examples.springdata.repo.student.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    @Column(length=32)
    private String name;
    
    public Student(){}
    
    @Builder
    public Student(String name) {
        this.name = name;
    }
}
