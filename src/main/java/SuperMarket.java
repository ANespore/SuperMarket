import java.util.ArrayList;

public class SuperMarket {

    private ArrayList<Product> products;
    private ArrayList<User> users;
    private ArrayList <Product> SoldProducts;
    public static int totalMoneyEarned;
    public static int totalMoneySpent;

    SuperMarket() {
        products = new ArrayList<>();
        users = new ArrayList<>();
        SoldProducts = new ArrayList<>();

    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Product> getSoldProducts() {
        return SoldProducts;
    }

    public void addProduct(Product product)
    {
        this.products.add(product);
    }


    public void addUsers(User users) {
        this.users.add(users);
    }

    public void addSoldProducts(Product SoldProducts) {
        this.SoldProducts.add(SoldProducts);
    }

    public static void updateTotalMoneyEarned(int moneyEarned, int amountOfProduct)
    {
        totalMoneyEarned +=  moneyEarned;


    }

    public static void updateTotalMoneySpent(int MoneySpent, int amountOfProduct){
        totalMoneySpent += MoneySpent*amountOfProduct;

    }

    public  int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public  int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public int getBalance()
    {
        int market_Balance;
        market_Balance = SuperMarket.totalMoneyEarned - SuperMarket.totalMoneySpent;
        return market_Balance;
    }

}
