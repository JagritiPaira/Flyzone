package com.example.flyzone;

public class UserHelper {
    String tname, temail, tphone,  tpassword ;

    public UserHelper() {

    }

    public UserHelper(String tname, String temail, String tphone, String tpassword) {
        this.tname = tname;
        this.temail = temail;
        this.tphone = tphone;
        this.tpassword = tpassword;
    }


    public String getName() {
        return tname;
    }

    public void setName(String tname) {
        this.tname = tname;
    }

    public String getEmail() {
        return temail;
    }

    public void setEmail(String temail) {
        this.temail = temail;
    }

    public String getPhone() {
        return tphone;
    }

    public void setPhone(String tphone) {
        this.tphone = tphone;
    }

    public String getPassword() {
        return tpassword;
    }

    public void setPassword(String tpassword) {
        this.tpassword = tpassword;
    }
}
