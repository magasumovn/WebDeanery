package magasumovn.WebDeanery.domain;

import javax.persistence.*;

@Entity
@Table
public class Subject{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long subjectID;

    private String subjectName;

    public Long getSubjectID() {
        return subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
