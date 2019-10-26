package magasumovn.WebDeanery.domain;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentID;

    private String studentName;

    @ManyToOne()
    @JoinColumn(name = "groupNumber")
    private Group group;

    public Long getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Group getGroup() {
        return group;
    }
}
