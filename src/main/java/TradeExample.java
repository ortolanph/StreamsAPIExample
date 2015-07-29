import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 27975700819 on 29/07/15.
 */
public class TradeExample {

    public static void main(String[] args) {
        ITrade newTradeChecker = (t) -> t.getStatus().equals("NEW");

        // Lambda for big trade
        ITrade bigTradeLambda = (t) -> t.getQuantity() > 10000000;

        // Lambda that checks if the trade is a new large google trade
        ITrade issuerBigNewTradeLambda = (t) -> {
            return t.getIssuer().equals("GOOG") &&
                    t.getQuantity() > 10000000 &&
                    t.getStatus().equals("NEW");
        };


        TradeClient client = new TradeClient();

        List<Trade> trades = Arrays.asList(
                new Trade("NEW", 3000, "GOOG"),
                new Trade("OLD", 10000001, "GOOG"),
                new Trade("NEW", 3000, "MSFT"),
                new Trade("NEW", 5000, "DOWJ"),
                new Trade("NEW", 3000, "BOSP"),
                new Trade("NEW", 30000001, "GOOG"),
                new Trade("NEW", 2000, "ABCD"),
                new Trade("OLD", 2000, "EFGH"),
                new Trade("NEW", 1000, "IJKL"),
                new Trade("OLD", 3000, "MNOP"),
                new Trade("NEW", 56000, "QRST"),
                new Trade("NEW", 3000, "UVWX"),
                new Trade("OLD", 356000, "1234"),
                new Trade("NEW", 33000, "5678"),
                new Trade("NEW", 3000, "KSHW"),
                new Trade("NEW", 33322000, "QSII"),
                new Trade("OLD", 333000, "AZWE"),
                new Trade("NEW", 545000, "ALKW"),
                new Trade("OLD", 54000, "PHO1"),
                new Trade("NEW", 2000, "ARBO")
        );

        System.out.println("New trades");
        client.filterTrades(newTradeChecker, trades).stream().forEach(System.out::println);
        System.out.println("\nBig Trades");
        client.filterTrades(bigTradeLambda, trades).stream().forEach(System.out::println);
        System.out.println("\nGOOG issuer, quantity > 10000000, status NEW");
        client.filterTrades(issuerBigNewTradeLambda, trades).stream().forEach(System.out::println);

    }

}
