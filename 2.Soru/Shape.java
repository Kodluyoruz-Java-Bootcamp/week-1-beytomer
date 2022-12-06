public class Shape {
    public static void drawLeftAligned(int param){ // sırasıyla 1 tane * 4 tane " ", 2 tane * 3 tane " ", 3 tane * 2 tane " "
                                                   // 4 tane * 1 tane " ", 5 tane * 0 tane " " çizen metod
        for (int i = 0; i <param ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k <param-i-1; k++) {
                System.out.print(" ");
            }
            System.out.println();               // 1 satır atlamamızı sağlıyor
        }
    }
    
    public static void drawRightAligned(int param){ // sırasıyla 4 tane " " 1 tane *, 3 tane " " 2 tane *, 2 tane " " 3 tane *
                                                    // 1 tane " " 4 tane *, 0 tane " " 5 tane * çizen metod

        for (int i = 0; i <param ; i++) {
            for (int j = 0; j < param-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();               // 1 satır atlamamızı sağlıyor
        }
    }
}
