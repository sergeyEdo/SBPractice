package u_2_ex_4;

public class Author{
    String name;
    String sex;
    String email;

    public Author(String name, String sex, String email){
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
