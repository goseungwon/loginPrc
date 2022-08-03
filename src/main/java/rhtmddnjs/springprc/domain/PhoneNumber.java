package rhtmddnjs.springprc.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable //세 값을 하나의 컬럼으로 집어넣기
@Getter //setter는 신중하게
public class PhoneNumber {

    private int firstPhoneNum;
    private int secondPhoneNum;
    private int lastPhoneNum;

    protected PhoneNumber() {

    }

    public PhoneNumber(Integer firstPhoneNum, Integer secondPhoneNum, Integer lastPhoneNum){
        this.firstPhoneNum=firstPhoneNum;
        this.secondPhoneNum=secondPhoneNum;
        this.lastPhoneNum=lastPhoneNum;
    }

}
