public class koin {
    public static void main(String[] args) { 
        System.out.println("Bakti Surya Atmaja");
        System.out.println("XI RPL 6 / 08");
        System.out.println("==============================");
        String x,y;
        double a,b;
        a = 0;
        b = 0;
        x = "Gambar ";        
        y = "Angka ";
        int lemparan = 24;       
        for (int i = 1; i <= lemparan ; i++){  
            if (Math.random() < 0.5) {                
                System.out.println(i+". "+x);
                a++;               
            } else {                
                System.out.println(i+". "+y);
                b++;
            }
        }
        System.out.println("==============================");
        System.out.println("Jumlah Lemparan : "+lemparan);
        System.out.println("Jumlah Gambar : " + a);
        System.out.println("Jumlah Angka  : " + b);
        System.out.println("");
        System.out.println("=Menghitung Frekuensi Relatif=");
        System.out.println("Sisi Gambar = K / n = " + a + "/" + lemparan + " = " + a/2 + "/" +lemparan/2);
        System.out.println("Sisi Angka = K / n = " + b + "/" + lemparan + " = " + b/2 + "/" +lemparan/2);
    }
}
