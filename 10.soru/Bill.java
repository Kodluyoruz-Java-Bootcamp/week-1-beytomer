public class Bill {             //fatura clasımız
    private int price;          //fatura ücreti

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price+this.price;
    }

}
