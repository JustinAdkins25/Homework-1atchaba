public class Clothing {

    public double price;
    public String type;
    public String size;
    public Clothing() {
        price = 29.9;
        type = "T-shirt";
        size = "Medium";
    }

    public Clothing(double price, String type, String size) {
        this.price = price;
        this.type = type;
        this.size = size;
    }

    public void increasePrice() {
        price += 5;
    }

    public void increasePrice(double x) {
        price += x;
    }

    public void details() {
        System.out.println("Item: " + type);
        System.out.println("Size: " + size);
        System.out.println("Price: $" + price);
        System.out.println();
    }

}