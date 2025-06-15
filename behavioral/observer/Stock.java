import java.util.ArrayList;
import java.util.List;

public abstract class Stock {
    //observable
    private final List<Investor> investors = new ArrayList<>();

    public void registerInvestor(Investor investor) {
        investors.add(investor);
    }

    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    public void notifyInvestors(String stockName, double price) {
        for (Investor investor : investors) {
            investor.update(stockName, price);
        }
    }
}
