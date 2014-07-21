package nz.ac.auckland.grades.controller;

import nz.ac.auckland.grades.domain.Grade;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StudentGradesController {

    private List<Grade> grades = new ArrayList<>();

    @RequestMapping(method=RequestMethod.GET)
    public List<Grade> getGrades() {
        return grades;
    }

    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public List<Grade> getGrades(@PathVariable("id") int studentId) {
        return grades.stream().filter(grade -> grade.getStudentId() == studentId).collect(Collectors.toList());
    }

    @RequestMapping(method=RequestMethod.POST)
    public void saveGrade(@RequestBody Grade grade) {
        grades.add(grade);
    }

    /**
     * Initially use an in-memory list of grades
     */
    public StudentGradesController() {
        Grade grade1 = new Grade(123,"PHYSICS101","A");
        Grade grade2 = new Grade(321,"MATH101","B");
        grades.add(grade1);
        grades.add(grade2);
    }
}