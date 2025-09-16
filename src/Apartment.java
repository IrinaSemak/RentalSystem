public class Apartment {
    private int id;
    private String address;
    private double price;
    private double area;

    public Apartment(int id, String address, double price, double area) {
        this.id = id;
        this.address = address;
        this.price = price;
        this.area = area;
    }

    public double getPrice() { return price; }
    public int getId() { return id; }
    public String getAddress() { return address; }
    public double getArea() { return area; }

    @Override
    public String toString() {
        return "Apartment{id=" + id + ", address='" + address + "', price=" + price + ", area=" + area + "}";
    }
}
