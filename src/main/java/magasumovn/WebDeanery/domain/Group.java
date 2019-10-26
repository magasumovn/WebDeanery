package magasumovn.WebDeanery.domain;

import javax.persistence.*;

@Entity
@Table(name = "Groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long groupNumber;

    private String groupName;

    public Long getGroupNumber() {
        return groupNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
