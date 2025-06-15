public class Driver {
    public static void main(String[] args) {
        TcsStock tcsStock = new TcsStock();

        Investor investor1 = new ItInvestor("Vishal");
        tcsStock.registerInvestor(investor1);
        tcsStock.setPrice(1200.0);

        tcsStock.setPrice(1250.0);

    }
}
