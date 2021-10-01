import java.util.Scanner;

public class main {
    SuperMarket market = new SuperMarket();
    public static void main(String[] args) {

        main main = new main();
        main.showMenu();
    }

    void showMenu() {

        Scanner scanner = new Scanner(System.in);
        String userType = "";
        do {
            System.out.println("Welcome to the Supermarket, please choose your type of user:\n " +
                    "1.Buyer \n" +
                    "2.Sales representative \n " +
                    "3.Owner \n " +
                    "Enter Quit to end program ... ");

            userType = scanner.nextLine();
            switch (userType) {
                case "Quit":
                    System.out.println("Exiting application....");
                    break;
                case "1":
                    Buyer();
                    break;
                case "2":
                    SalesRepresentative();
                    break;
                case "3":
                    Owner();
                default:
                    break;


            }


        }
        while (!userType.equalsIgnoreCase("Quit"));
        return;

    }

    void SalesRepresentative() {
        String SalesReprInput = "";
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        do {
            System.out.println("Chose operation : \n " +
                    "1. Add product \n " +
                    "2.Show all products");
            SalesReprInput = scanner.nextLine();
            switch (SalesReprInput) {
                case "Quit":
                    System.out.println("Exiting application....");
                    break;
                case "1":
                    int Product_id;
                    String Product_name;
                    int Product_price;
                    int buying_price;
                    int amount_of_product;
                    System.out.println("Enter product id : ");
                    Product_id = intScanner.nextInt();
                    System.out.println("Enter product name : ");
                    Product_name = scanner.nextLine();
                    System.out.println("Enter product buying price : ");
                    buying_price = intScanner.nextInt();
                    System.out.println("Enter product  Price : ");
                    Product_price = intScanner.nextInt();
                    System.out.println("Enter amount of product : ");
                    amount_of_product = intScanner.nextInt();
                    Product product = new Product(Product_id, Product_name, Product_price, buying_price, amount_of_product);
                    market.addProduct(product);
                    product.buyProduct(buying_price,amount_of_product);
                    break;
                case "2":
                    for (Product product1 : market.getProducts()) {
                        System.out.println("   Product id :  " + product1.getId() + "  Product name: " +
                                product1.getProductName() + "  Product buying price:    " + product1.getBuyingPrice()
                                + "  Product price:    " + product1.getPrice() + "  Product amount :   " + product1.getAmountOfProduct());
                    }
                        break;
                default:
                    break;


            }
        }
        while (!SalesReprInput.equalsIgnoreCase("Quit"));
        showMenu();
        return;
    }

    void Owner() {
        String OwnerInput = "";
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        do {
            System.out.println("Chose operation : \n " +
                    "1. Add buyers \n " +
                    "2.Show all buyers \n " +
                    "3. Profit \n " +
                    "4. Loss \n " +
                    "5.Balance \n "+
                    "6.Get sales history");
            OwnerInput = scanner.nextLine();
            switch (OwnerInput) {
                case "Quit":
                    System.out.println("Exiting application....");
                    break;
                case "1":
                    int User_id;
                    String User_name;
                    String User_password;
                    String User_email;
                    int User_money;
                    System.out.println("Enter user id : ");
                    User_id = intScanner.nextInt();
                    System.out.println("Enter user name : ");
                    User_name = scanner.nextLine();
                    System.out.println("Enter user email : ");
                    User_email = scanner.nextLine();
                    System.out.println("Enter user password : ");
                    User_password = scanner.nextLine();
                    System.out.println("Enter user available money  : ");
                    User_money = intScanner.nextInt();
                    User user = new User(User_id, User_name, User_password, User_email, User_money);
                    market.addUsers(user);
                    break;
                case "2":
                    for (User user1 : market.getUsers()) {
                        System.out.println("   User id :  " + user1.getId() + "  User name: " +
                                user1.getName() + "  User email:    " + user1.getEmail()
                                + "  User password :   " + user1.getPassword() + "  User available money:    " + user1.getUserMoney());
                    }
                    break;
                case "3":
                    System.out.println("Total money earned:  " + market.getTotalMoneyEarned());
                    break;
                case "4":
                    System.out.println("Total money spent:  " + market.getTotalMoneySpent());
                    break;
                case "5":
                    System.out.println("Balance: " + market.getBalance());
                    break;
                case "6":
                    if (market.getSoldProducts() == null) {
                    System.out.println("No history to show");
                } else {
                    for (Product product1 : market.getSoldProducts()) {
                        System.out.println("   Product id :  " + product1.getId() + "  Product name: " +
                                product1.getProductName() + "  Product buying price:    " + product1.getBuyingPrice()
                                + "  Product price:    " + product1.getPrice() + "  Product amount :   " + product1.getAmountOfProduct());
                    }}
                    break;
                default:
                    break;
            }
        }
        while (!OwnerInput.equalsIgnoreCase("Quit"));
        showMenu();
        return;
    }

    void Buyer() {
        String email;
        String password;
        String buyer_input = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email");
        email = scanner.nextLine();
        for (User user : market.getUsers()) {
            if (user.getEmail().equals(email)) {
                System.out.println("Enter your password");
                password = scanner.nextLine();
                    if (user.getPassword().equals(password)) {
                        System.out.println("Welcome to Supermarket! Please choose operation:\n  " +
                                            "1. View all products\n " +
                                            "2. Buy product ");
                                            buyer_input = scanner.nextLine();
                                            do {
                                                switch (buyer_input) {
                                                    case "Quit":
                                                        System.out.println("Exiting application....");
                                                        break;
                                                    case "1":
                                                        for (Product product1 : market.getProducts()) {
                                                            System.out.println("   Product id :  " + product1.getId() + "  Product name: " +
                                                                    product1.getProductName()  + "  Product price:    " + product1.getPrice()
                                                                    + "  Product amount :   " + product1.getAmountOfProduct());

                                                        }
                                                        showMenu();
                                                        break;
                                                    case "2":
                                                        String product_name;
                                                        int product_amount;
                                                        int price_to_pay;
                                                        Scanner intScanner = new Scanner(System.in);
                                                        System.out.println("Enter product name, which You want to buy");
                                                        product_name = scanner.nextLine();
                                                        for (Product product : market.getProducts()) {
                                                            if (product.getProductName().equals(product_name)) {
                                                                if (product.getAmountOfProduct() != 0) {
                                                                    System.out.println("Enter amount");
                                                                    product_amount = intScanner.nextInt();
                                                                     if (product_amount <= product.getAmountOfProduct()) {
                                                                        price_to_pay = product_amount * product.getPrice();
                                                                         if (user.getUserMoney() >= price_to_pay) {
                                                                            user.payForProduct(price_to_pay);
                                                                            product.sellProduct(product_amount, price_to_pay);
                                                                            Product soldProduct = new Product(product.getId(),product.getProductName(),
                                                                                    product.getPrice(),product.getBuyingPrice(),product_amount);
                                                                            market.addSoldProducts(soldProduct);
                                                                            System.out.println("Product is bought");

                                                                        showMenu();
                                                                        break;


                                                                    } else {
                                                                        System.out.println("Not enough money to buy product");
                                                                    }


                                                                } else {
                                                                    System.out.println("Specified amount is not available, please choose less" + product.getAmountOfProduct());
                                                                }
                                                            }
                                                                else {
                                                                    System.out.println("Product is sold out");
                                                                }
                                                            }
                                                            else {
                                                                System.out.println("No such product found! Please try again! ");
                                                            }

                                                        }
                                                    default:
                                                        break;


                                                }
                                            }
                                            while (!buyer_input.equalsIgnoreCase("Quit"));
                        showMenu();
                        return;
                    }
                    else {System.out.println("Password incorrect, please try again! ");}



                                          }
            else{
                    System.out.println("No user found with inserted email, please try again!  ");
                }
            }
        }



    }

