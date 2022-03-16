package com.hendisantika.repository;

import com.hendisantika.entity.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-testcontainers-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/03/22
 * Time: 06.51
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    // JUnit for save student operation - BDD style
    @Test
    public void givenStudentObject_whenSave_thenReturnSavedStudent() {

        // given - setup or precondition
        Student student = Student.builder().firstName("Uzumaki")
                .lastName("Naruto").email("naruto@gmail.com").build();

        // when - action or the testing
        Student savedStudent = studentRepository.save(student);

        // then - very output
        Assertions.assertNotNull(savedStudent);
        Assertions.assertNotNull(savedStudent.getId());

    }

    // JUnit for save student operation - BDD style
    @Test
    public void givenStudentId_whenFindbyId_thenReturnSavedStudent() {

        // given - setup or precondition
        Student student = Student.builder().firstName("Uzumaki")
                .lastName("Naruto").email("naruto@gmail.com").build();
        Student savedStudent = studentRepository.save(student);

        // when - action or the testing
        Student studentDB = studentRepository.findById(student.getId()).get();

        // then - very output
        Assertions.assertNotNull(studentDB);
    }
}
