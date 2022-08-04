package rhtmddnjs.springprc.controller;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class UserForm {

    @NotEmpty (message = "이름을 입력하세요.")
    //NotEmpty는 오직 String에게만 사용 가능 Int는 NotNull
    private String name;

    @NotEmpty (message = "비밀번호를 입력하세요.")
    //숫자만 입력가능
    @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}",
            message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다.")
    private String password;

    @NotEmpty (message = "비밀번호확인을 입력하세요.")
    private String checkPassword;


    @NotNull (message = "전화번호를 입력하세요.")
    @Min(10)
    @Max(11)
   //@Pattern(regexp = "(?=.*[0-9]).{10,11}", message = "전화번호는 10자이상 11자 이하입니다.")
    private Integer PhoneNum;

}
