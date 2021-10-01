public class User {

    private int id;
    private String name;
    private String password;
    public String email;
    private int userMoney;
    User (int id, String name, String password, String email, int userMoney )
    {

        this.id = id;
        this.name = name;
        this.password=password;
        this.email=email;
        this.userMoney=userMoney;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getUserMoney() {
        return userMoney;
    }


    public void payForProduct(int price_to_pay){

        this.userMoney -= price_to_pay;
    }

}
