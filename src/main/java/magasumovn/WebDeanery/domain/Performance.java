package magasumovn.WebDeanery.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@IdClass(PerformanceCK.class)
public class Performance implements Serializable{
    @Id
    @ManyToOne()
    @JoinColumn(name = "studentID")
    private Student student;

    @Id
    @ManyToOne()
    @JoinColumn(name = "subjectID")
    private Subject subject;

    @Id
    private int semesterNumber;

    private int mark;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getSemesterNumber() {
        return semesterNumber;
    }

    public void setSemesterNumber(int semesterNumber) {
        this.semesterNumber = semesterNumber;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
