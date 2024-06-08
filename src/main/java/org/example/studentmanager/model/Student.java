package org.example.studentmanager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "Students")
public class Student {
  // entités
    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("firstName")
    private String firstName;

    @Field("specialities")
    private List<String> specialities;

    // Constructors vide
    public Student() {
    }
// constructeur
    public Student(String name, String firstName, List<String> specialities) {
        this.name = name;
        this.firstName = firstName;
        this.specialities = specialities;
    }

    // Getters and Setters
   /*public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<String> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(List<String> specialities) {
        this.specialities = specialities;
    }
}
