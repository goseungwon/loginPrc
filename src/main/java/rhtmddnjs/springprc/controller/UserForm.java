package rhtmddnjs.springprc.controller;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class UserForm {

    @NotEmpty (message = "이름을 입력하세요.")
    private String name;

    @NotEmpty (message = "비밀번호를 입력하세요.")
    private String password;

    @NotEmpty (message = "비밀번호확인을 입력하세요.")
    private String checkPassword;


    @NotEmpty (message = "전화번호를 입력하세요.")
    private int firstPhoneNum;

    @NotEmpty (message = "전화번호를 입력하세요.")
    private int secondPhoneNum;

    @NotEmpty (message = "전화번호를 입력하세요.")
    private int lastPhoneNum;
}
