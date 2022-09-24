public class Product {
    private String Name;
    private int Price;
    private int Quantity;
    private int Sum;

    public Product(String name, int price, int Quantity) {
        this.Name = name;
        this.Price = price;
        this.Quantity = Quantity;
        this.Sum = this.Price * this.Quantity;
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getName() {
        return Name;
    }

    public int getSum() {
        return Sum;
    }

    public int getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                ", Price=" + Price +
                ", Quantity=" + Quantity +
                ", Sum=" + Sum +
                '}';
    }
}
