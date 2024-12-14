package com.talhacelik.controller;


import com.talhacelik.model.Student;
import com.talhacelik.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;

    // GET - SELECT WHERE
    // http://localhost:8090/api/v1/student/1

    @GetMapping("/student/{id}")// süslü parantez ile esneklik oluşturulur. {id}
    public String getStudent(@PathVariable(name = "id") Long id) {
        return "Gelen ID: " + id;
    }

    // GET - SELECT ALL
    // http://localhost:8090/api/v1/students

    @GetMapping("/students")
    public List<Student> getStudents() {
        //"Birden fazla öğrenciyi getir.";

        return studentService.getAllStudent();
    }


    // POST - INSERT
    // http://localhost:8090/api/v1/student/1
    @PostMapping("/student")
    public String addStudent(Student student) {
        // student kaydedilecek
        return "Ekleme başarılı.";
    }

    // PUT - UPDATE
    // http://localhost:8090/api/v1/student/1
    @PutMapping("/student")
    public String updateStudent() {
        return "Sadece 1 öğrenciyi güncelle.";
    }

    // DELETE
    // http://localhost:8090/api/v1/student/1
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id) {

        return "Sadece 1 öğrenciyi sil.";
    }

}


















/*
package com.talhacelik.controller;

import com.talhacelik.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;

    // GET - SELECT WHERE: Tek bir öğrenci getirme
    // /api/v1/student/{id} yolu için GET isteği
    @GetMapping("/student/{id}")
    public String getStudent(@PathVariable("id") Long id) {
        return "Öğrenci ID: " + id + " bilgileri getirildi.";
    }

    // GET - SELECT: Tüm öğrencileri getirme
    // /api/v1/students yolu için GET isteği
    @GetMapping("/students")
    public String getStudents() {
        return "Tüm öğrenciler getirildi.";
    }

    // POST - ADD - INSERT: Tek bir öğrenci ekleme
    // /api/v1/student yolu için POST isteği
    @PostMapping("/student")
    public String addStudent(@RequestBody String student) {
        return "Yeni öğrenci eklendi: " + student;
    }

    // POST - ADD - INSERT: Birden fazla öğrenci ekleme
    // /api/v1/students yolu için POST isteği
    @PostMapping("/students")
    public String addStudents(@RequestBody String students) {
        return "Birden fazla öğrenci eklendi: " + students;
    }

    // PUT - UPDATE: Tek bir öğrenci güncelleme
    // /api/v1/student yolu için PUT isteği
    @PutMapping("/student")
    public String updateStudent(@RequestBody String student) {
        return "Öğrenci güncellendi: " + student;
    }

    // PUT - UPDATE: Birden fazla öğrenci güncelleme
    // /api/v1/students yolu için PUT isteği
    @PutMapping("/students")
    public String updateStudents(@RequestBody String students) {
        return "Birden fazla öğrenci güncellendi: " + students;
    }

    // DELETE - DELETE: Tek bir öğrenci silme
    // /api/v1/student/{id} yolu için DELETE isteği
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {
        return "Öğrenci ID: " + id + " silindi.";
    }

    // DELETE - DELETE: Birden fazla öğrenci silme
    // /api/v1/students yolu için DELETE isteği
    @DeleteMapping("/students")
    public String deleteStudents(@RequestBody String students) {
        return "Birden fazla öğrenci silindi: " + students;
    }
}

 */
