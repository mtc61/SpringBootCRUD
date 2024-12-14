package com.talhacelik.repository;

import com.talhacelik.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// diamond karakter içinde ilkel karakter olmaz! long olamaz Long olmalıdır.
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
