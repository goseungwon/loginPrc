package rhtmddnjs.springprc.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity  //테이블과 1대1 매칭을 뜻함
@Getter @Setter
public class User {

    @Id // PK
    @GeneratedValue //sequence값 할당 방법
    @Column(name="user_id") //DB속성 이름
    private Long id;

    private String name;

    private String password;

    private Long phoneNum;

}
