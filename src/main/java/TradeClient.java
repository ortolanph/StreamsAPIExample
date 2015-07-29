import java.util.ArrayList;
import java.util.List;

public class TradeClient {

    public List<Trade> filterTrades(ITrade tradeLambda, List<Trade> trades) {
        List<Trade> newTrades = new ArrayList<>();

        for (Trade trade : trades) {
            if (tradeLambda.check(trade)) {
                newTrades.add(trade);
            }
        }
        return newTrades;
    }
}
