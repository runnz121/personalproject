package Domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class Member {


    @GeneratedValue
    @Column(name = "member_id")
    @Id
    private String id;
    private String pwd;
    private String name;


    public void member(String id, String pwd, String name){
        this.id = id;
        this.pwd = pwd;
        this.name = name;



    }
}
