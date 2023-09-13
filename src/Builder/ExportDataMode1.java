package Builder;

public class ExportDataMode1 {
    private String productId;
    private double price;
    private double amount;

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }
}
