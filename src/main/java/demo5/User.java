package demo5;

public class User {
    private String noe = "20160940";
    private String name = "Tan_wang";
    private String sex = "man";
    private int age = 1;

    public User(){}

    public User(int age){
        this.setAge(age);
    }

    public String getNoe() {
        return noe;
    }

    public void setNoe(String noe) {
        this.noe = noe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
