import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product washingMachine =new Product();
        washingMachine.setCategory("whiteAppliances");        //1.ürünümüz
        washingMachine.setPrice(3200);
        washingMachine.setStockInformation(5);

        Product dishWasher = new Product();
        dishWasher.setCategory("whiteAppliances");            //2.ürünümüz
        dishWasher.setPrice(2000);
        dishWasher.setStockInformation(3);

        Product armchair=new Product();
        armchair.setCategory("sittingSet");                  //3.ürünümüz
        armchair.setPrice(2250);
        armchair.setStockInformation(12);

        Product plate=new Product();
        plate.setCategory("dinnerService");                  //4.ürünümüz
        plate.setPrice(335);
        plate.setStockInformation(17);

        Product shirt=new Product();
        shirt.setCategory("dress");                           //5.ürünümüz
        shirt.setPrice(340);
        shirt.setStockInformation(23);

        Customer customer1=new Customer();
        customer1.setName("Cem");
        customer1.setOrder(washingMachine,dishWasher);        //1.müşterimizin kişisel bilgileri ve siparişleri
        customer1.setAge(26);
        customer1.getOrder().getBill();

        Customer customer2=new Customer();
        customer2.setName("Cem");
        customer2.setOrder(armchair,plate);                    //2.müşterimizin kişisel bilgileri ve siparişleri
        customer2.setAge(27);
        customer2.getOrder().getBill();

        Customer customer3=new Customer();
        customer3.setName("Beytullah");
        customer3.setOrder(shirt,dishWasher);                   //3.müşterimizin kişisel bilgileri ve siparişleri
        customer3.setAge(28);
        customer3.getOrder().getBill();


        Customer.numberOfCustomers();  // Sistemde bulunan müşteri sayısını bulan fonksiyon.
        Customer.namIsCem();           // ismi Cem olan musterilerin aldigi toplam urun sayisi
        Customer.totalAmount();        // ismi Cem olup yasi 30 dan kucuk 25 ten buyuk musterilerin toplam alisveris tutari
        Order.printInvoice();         //Sistemdeki 1500 TL üzerindeki faturaları listeleyin










    }
}
