public class ItInvestor  implements Investor{

    private String name;

    public ItInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("IT Investor " + name + " notified: " +
                stockName + " stock is now ₹" + stockPrice);
    }
}
