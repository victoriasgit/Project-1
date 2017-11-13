package models;

public class User {

    public static final String SEX_MALE ="M";
    public static final String SEX_FEMALE = "F";

    private int userId;
    private String userFio;
    private String userSex;
    private String userCountry;

    public User(){

    }

    public User(int userId, String userFio, String userSex, String userCountry){
        this.userId = userId;
        this.userFio = userFio;
        this.userSex = userSex;
        this.userCountry = userCountry;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserFio() {
        return userFio;
    }

    public void setUserFio(String userFio) {
        this.userFio = userFio;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (userFio != null ? !userFio.equals(user.userFio) : user.userFio != null) return false;
        if (userSex != null ? !userSex.equals(user.userSex) : user.userSex != null) return false;
        return userCountry != null ? userCountry.equals(user.userCountry) : user.userCountry == null;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userFio != null ? userFio.hashCode() : 0);
        result = 31 * result + (userSex != null ? userSex.hashCode() : 0);
        result = 31 * result + (userCountry != null ? userCountry.hashCode() : 0);
        return result;
    }
}