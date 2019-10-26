package magasumovn.WebDeanery.controller;

import magasumovn.WebDeanery.domain.Group;
import magasumovn.WebDeanery.repo.GroupRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("group")
public class GroupController {
    private final GroupRepo groupRepo;

    @Autowired
    public GroupController(GroupRepo groupRepo) {
        this.groupRepo = groupRepo;
    }

    @GetMapping
    public List<Group> list() {
        return groupRepo.findAll();
    }

    @GetMapping("{id}")
    public Group getOne(@PathVariable("id") Group group) {
        return group;
    }

    @PostMapping
    public Group create(@RequestBody Group group) {
        return groupRepo.save(group);
    }

    @PutMapping("{id}")
    public Group update(
            @PathVariable("id") Group groupFromDB,
            @RequestBody Group group) {
        BeanUtils.copyProperties(group, groupFromDB, "groupNumber");
        return groupRepo.save(groupFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Group group) {
        groupRepo.delete(group);
    }
}
