package Model;

public class UserModel {
    public  int userid;
    public int passward;
    public String  usernName;

    public UserModel(int userid, int passward, String usernName) {
        this.userid = userid;
        this.passward = passward;
        this.usernName = usernName;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getPassward() {
        return passward;
    }

    public void setPassward(int passward) {
        this.passward = passward;
    }

    public String getUsernName() {
        return usernName;
    }

    public void setUsernName(String usernName) {
        this.usernName = usernName;
    }
}
