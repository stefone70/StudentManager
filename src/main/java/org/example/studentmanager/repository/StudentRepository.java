package org.example.studentmanager.repository;

import org.example.studentmanager.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
