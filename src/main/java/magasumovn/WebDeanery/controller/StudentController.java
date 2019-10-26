package magasumovn.WebDeanery.controller;

import magasumovn.WebDeanery.domain.Student;
import magasumovn.WebDeanery.repo.StudentRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @GetMapping
    public List<Student> list() {
        return studentRepo.findAll();
    }

    @GetMapping("{id}")
    public Student getOne(@PathVariable("id") Student student) {
        return student;
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @PutMapping("{id}")
    public Student update(
            @PathVariable("id") Student studentFromDB,
            @RequestBody Student student) {
        BeanUtils.copyProperties(student, studentFromDB, "studentID");
        return studentRepo.save(studentFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Student student) {
        studentRepo.delete(student);
    }
}
