package academy.belhard.entitiy;

public class User extends Person{
    private String email;
    private String password = "1234";

    public User(String firstName, String lastName, String email, String password) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getFullInfo(){
        return "Имя: " + this.getFullName() + "\n" + "E-mail: " + this.email;
    }

    public boolean isPasswordCorrect(String password){
        return this.password.equals(password);
    }

}
