package signupPro.bean;

import lombok.Data;

@Data
public class MemberBean {
    private String id;
    private String pwd;
    private String name;
    private String gender;
    private String email;
    private String birth;
    private String zipcode;
    private String address;
    private String hobby;
    private String job;
}
