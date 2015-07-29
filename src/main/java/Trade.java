/**
 * Created by 27975700819 on 29/07/15.
 */
public class Trade {
    private String status;
    private int quantity;
    private String issuer;

    public Trade(String status, int quantity, String issuer) {
        this.status = status;
        this.quantity = quantity;
        this.issuer = issuer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    public String toString() {
        return String.format("Trade={status=%s, quantity=%d, issuer=%s}", status, quantity, issuer);
    }
}