public class Product {

    private int id;
    private String ProductName;
    private int Price;
    private int BuyingPrice;
    private int amountOfProduct;



        Product (int id, String ProductName, int Price, int BuyingPrice, int amountOfProduct  )
        {

            this.id = id;
            this.ProductName = ProductName;
            this.Price=Price;
            this.BuyingPrice=BuyingPrice;
            this.amountOfProduct=amountOfProduct;

        }


    public int getId() {
        return id;
    }

    public String getProductName() {
        return ProductName;
    }

    public int getPrice() {
        return Price;
    }


    public int getBuyingPrice() {
        return BuyingPrice;
    }

    public int getAmountOfProduct() {
        return amountOfProduct;
    }

    public void sellProduct(int amountOfProduct,int price_to_pay){

        this.amountOfProduct -= amountOfProduct;
        SuperMarket.updateTotalMoneyEarned(price_to_pay,amountOfProduct);
    }

    public void buyProduct(int buying_price,int amountOfProduct){

         SuperMarket.updateTotalMoneySpent(buying_price,amountOfProduct);
    }

}