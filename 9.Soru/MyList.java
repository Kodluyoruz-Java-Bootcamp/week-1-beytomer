public class MyList {
    public String [] myList1;
    private int size=0; // myList dizimizin boyutunu bu değişken ile bulacağız

    private int initialCapacity; // myListimizin baştaki kapasitesi

    private static final int DEFAULT_CAPACITY=5; // default olarak kapasitemizi 5 belirliyoruz bu değişkeni değiştirilemez tanımlıyoruz.

    public MyList(){
        this.initialCapacity=DEFAULT_CAPACITY; // initialCapacity e DEFAULT_CAPACITY i eşitliyoruz
        myList1=new String[DEFAULT_CAPACITY]; // myList1 i tanımlıyoruz ve boyutunu başta belirlediğimiz boyut olarak veriyoruz
    }

    public void add(String value1){  // bu fonksiyon ile listemize Sadece string eleman ekleyebiliyoruz.

        if(size==initialCapacity){   // eğer dizimizin kapasitesi dolu ise resize fonksiyonunu çağırarak dizimizi genişletiyoruz.
            resize();
        }

        if(value1.startsWith("C")){ // Sadece "C" harfi ile başlayan elemanları dizimize ekliyoruz.
            myList1[size]=value1;
            size++;      // size ı herseferinde arttırarak dizimizde kaç eleman olduğunu sizeda tutuyoruz.(indis değerinin 1 fazlası)
        }

    }

    public void print(){       // for each ile dizimizdeki elemanları yazdırıyoruz
        for (String i:myList1
             ) {
            System.out.println(i);
        }
    }
    private void resize(){   // bu fonksiyon ile dizimizin boyutunu istenilen şekilde genişletiyoruz
        String[]newMyList=new String[initialCapacity+7]; // yeni liste oluşturup kapasitesini isteğimiz doğrultusunda belirliyoruz.
        for (int i=0; i<initialCapacity; i++){
            newMyList[i]=myList1[i];  // yeni istediğimiz kapasiteye sahip dizimize mylist1 dizimizdeki elemanları atıyoruz.
        }
        myList1=newMyList; // en sonunda myList1 e yeni oluşan dizimizi gösteriyoruz.

        this.initialCapacity=initialCapacity+7; // initialCapacity mizi yeni elirlediğimiz kapasite yapıyoruz.
    }
    public int size() { // size ı buluyoruz
        return this.size;
    }
}
