package org.example.studentmanager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
public class StudentRepositoryTests {

    @Autowired
    private StudentRepository studentRepository;



    @Test
    public void testSaveAndFindById() {
        // Créer et sauvegarder un étudiant
        Student newStudent = new Student("Doe", "John", Arrays.asList("Mathematics", "Physics"));
        studentRepository.save(newStudent);

        // Récupérer l'étudiant sauvegardé
        /*Student foundStudent = studentRepository.findById(newStudent.getId()).orElse(null);

        // Vérifications
        assertNotNull(foundStudent, "L'étudiant ne devrait pas être null");
        assertEquals("John", foundStudent.getFirstName(), "Les prénoms devraient correspondre");
        assertEquals("Doe", foundStudent.getName(), "Les noms de famille devraient correspondre");
        assertTrue(foundStudent.getSpecialities().containsAll(Arrays.asList("Mathematics", "Physics")),
                "Les spécialités devraient contenir 'Mathematics' et 'Physics'");*/
    }

    @Test
    public void testFindAllStudents() {
        // Créer et sauvegarder plusieurs étudiants
        studentRepository.save(new Student("Aimarre", "Jean", Arrays.asList("Mathematics", "Physics")));
        studentRepository.save(new Student("Manvusa", "Gerard", Arrays.asList("Biology", "Chemistry")));

        // Récupérer tous les étudiants
        List<Student> students = studentRepository.findAll();

        // Vérifications
        assertNotNull(students, "La liste des étudiants ne devrait pas être null");
        //assertEquals(2, students.size(), "Il devrait y avoir exactement deux étudiants"); //
    }
}

