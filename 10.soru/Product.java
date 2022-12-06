import java.util.List;

public class Product {          // ürün clasımız
    private String category;   // ürünün kategorisi
    private int price;          // ürünün fiyatı
    private int stockInformation;   // ürünün stok miktarı


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockInformation() {
        return stockInformation;
    }

    public void setStockInformation(int stockInformation) {
        this.stockInformation = stockInformation;
    }
}
