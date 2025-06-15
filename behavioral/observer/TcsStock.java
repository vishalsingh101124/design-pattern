public class TcsStock  extends Stock{

    private String name = "TCS";
    private double price;

    public void setPrice(double price) {
        this.price = price;
        System.out.println("\n[Market Update] " + name + " stock price changed to ₹" + price);
        notifyInvestors(name, price);
    }

    public double getPrice() {
        return price;
    }
}
