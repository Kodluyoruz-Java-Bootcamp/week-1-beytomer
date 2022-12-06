public class PalindromicNumbers {
    public static long getReverseNumber(long number){ // Parametre verilen sayının tersini alan metod
        long reverse =0;

        while (number !=0){    // Sayi sıfır olana kadar döngü devam ediyor
            reverse *=10;       // Döngü her döndüğünde basamağı arttırmak için 10 ile çarpıoruz
            reverse += number %10; // 10 a modunu alarak son basamaktaki sayıyı alıyoruz
            number /=10;       // integer bölmesi yapıyoruz
        }
        return reverse;
    }
    public static void calculateLongestChain() { // Palindrome sayı oluşabilmesi için en uzun zincirin boyutunu bulan metod

        long maxChain = 0;                       // Maksimum zincir
        for (long i = 10; i < 100; i++) {
            long chain = 0;                    //Bu döngüde istenilen aralıktaki sayıları kullanıyoruz
            long number = i;

            while (number != getReverseNumber(number)) { // number palindrome olana kadar döngü dönüyor
                number+=getReverseNumber(number);
                chain++;
            }
            if (maxChain < chain) {            //Eğer maksimum zincir sayısı oluşan zincir sayısından küçükse
                maxChain = chain;              // maksimum zincir sayısı oluşan zincir sayısına eşit.
            }
        }
        System.out.println("The size of the longest chain : " + maxChain);
    }
    public static long findMostChainedNumber() { // Palindrome sayı oluşabilmesi için en uzun zincire sahip olan sayıyı bulan metod

        long maxRepeatNumber = 0;
        long maxRepeat = 0;
        for (long i = 10; i < 100; i++) {       //Bu döngüde istenilen aralıktaki sayıları kullanıyoruz

            long repeat = 0;
            long number = i;
            while (number != getReverseNumber(number)) {    // number palindrome olana kadar döngü dönüyor
                number+=getReverseNumber(number);
                repeat++;
            }
            if (maxRepeat < repeat) {
                maxRepeatNumber = i;        //Palindrome sayı oluşabilmesi için en uzun zincire sahip olan sayı
                maxRepeat=repeat;
            }
        }
        return maxRepeatNumber;
    }
    public static void printLongestChain(){           // Palindrome sayı oluşabilmesi için en uzun zinciri ekrana yazdıran metod
        int i=1;
        long number = findMostChainedNumber();        // En uzun zincire sahip sayıyı buluyoruz
        while (number != getReverseNumber(number)) {
            long sum=number +getReverseNumber(number);
            System.out.println(i+".zincir : "+ number +" + "+ getReverseNumber(number)+" = "+ sum );
            number+=getReverseNumber(number);
            i++;
        }
    }

}

