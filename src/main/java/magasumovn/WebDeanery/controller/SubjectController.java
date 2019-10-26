package magasumovn.WebDeanery.controller;

import magasumovn.WebDeanery.domain.Subject;
import magasumovn.WebDeanery.repo.SubjectRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("subject")
public class SubjectController {
    private final SubjectRepo subjectRepo;

    @Autowired
    public SubjectController(SubjectRepo subjectRepo) {
        this.subjectRepo = subjectRepo;
    }

    @GetMapping
    public List<Subject> list() {
        return subjectRepo.findAll();
    }

    @GetMapping("{id}")
    public Subject getOne(@PathVariable("id") Subject subject) {
        return subject;
    }

    @PostMapping
    public Subject create(@RequestBody Subject subject) {
        return subjectRepo.save(subject);
    }

    @PutMapping("{id}")
    public Subject update(
            @PathVariable("id") Subject subjectFromDb,
            @RequestBody Subject subject) {
        BeanUtils.copyProperties(subject, subjectFromDb, "subjectID");
        return subjectRepo.save(subjectFromDb);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Subject subject) {
        subjectRepo.delete(subject);
    }
}
