import java.util.ArrayList;
import java.util.List;

public class Order {                //sipariş clasımız
    private List<Product>products=new ArrayList<>();    //siparişlerimizde bulunan ürünleri tuttuğumuz liste
    private static List<Integer>invoice=new ArrayList<>();  //faturaların tutulduğu liste
    private static List<String>invoiceName=new ArrayList<>();
    private Bill bill=new Bill();
    private String name;  // Siparişin sahibi

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(Product products,String name1) {
        this.name=name1;
        this.products.add(products);
    }

    public Bill getBill() {                  // fatura tutarını hesaplayan fonksiyonumuz
        int price=0;
        for (Product pr:products
             ) {
            price+=pr.getPrice();
        }
        bill.setPrice(price);
        if (this.bill.getPrice()>1500){     // fatura ücretleri 1500 den fazla olanları invoice listesine ekliyoruz
            invoice.add(bill.getPrice());
            invoiceName.add(name);
        }
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
    public static void printInvoice(){
        System.out.println("Sistemdeki 1500 TL uzerindeki faturalar asagidadir");   // 1500 tl üzerindeki faturaları ekrana yazdıran fonksiyon
        for (int i = 0; i < invoice.size(); i++) {
            System.out.println(invoiceName.get(i)+" faturasi : "+ invoice.get(i));
        }
    }
}
