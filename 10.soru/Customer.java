import java.util.List;

public class Customer {     // Müşteri clasımız

    private  String name;  //Müşterinin ismi
    private  int age;       //müşterinin yaşı
    private Order order=new Order();
    private static int customerCounter =0; //Müşteri sayacı
    private static int nameCounter=0;      // istenilen isime ait müşteri sayısı
    private static int totalPrice=0;      // istenilen yaş aralığındaki toplam ürün maliyetini tutan değişken


    public Customer() {
        customerCounter++;            // kaç müşteri olduğunu buradan hesaplıyoruz
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Product product) {     // 1 ürün sipariş edilmek istendiğinde
        order.setProducts(product,name);
    }
    public void setOrder(Product product, Product product1) { // 2 ürün sipariş vermek istendiğinde
        order.setProducts(product,name);
        order.setProducts(product1,name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("Cem")){                    // ismi cem olan müşterilerin kaç ürün aldığının hesabı
            nameCounter+=order.getProducts().size();
        }

        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (name.equals("Cem")&& age<30&& age>25){        // ismi Cem olup yasi 30 dan kucuk 25 ten buyuk musterilerin toplam alisveris tutari
            for (int i=0; i<order.getProducts().size(); i++){
                totalPrice+=order.getProducts().get(i).getPrice();
            }
        }
        this.age = age;
    }
    public  static void numberOfCustomers(){
        System.out.println("Sistemde Bulunan Musteri Sayisi : "+ customerCounter);
    }

    public static void namIsCem(){

        System.out.println("ismi Cem olan musterilerin aldigi toplam urun sayisi : "+ nameCounter);
    }

    public  static void totalAmount(){

        System.out.println("ismi Cem olup yasi 30 dan kucuk 25 ten buyuk musterilerin toplam alisveris tutari : "+ totalPrice);
    }

}
