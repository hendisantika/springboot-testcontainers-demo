package com.hendisantika.repository;

import com.hendisantika.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-testcontainers-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/03/22
 * Time: 06.43
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
