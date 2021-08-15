import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Enter {
    static void enter(){
        System.out.print("Ketik \"Enter\" untuk kembali");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        App.main(new String[0]);
    }  
}
public class App {
        public static void main(String[] args) {
        Queue<String> makanan = new LinkedList<>();
        Stack<String> minuman = new Stack<>();

        makanan.add("Sate Ayam");
        makanan.add("Sate Sapi");
        makanan.add("Sate Kelinci");
        makanan.add("Bakso");

        minuman.push("Es Teh Panas");
        minuman.push("Es Jeruk Anget");
        minuman.push("Kuah Soto");
        minuman.push("Dawet");

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String mainMenu = ("Setting Menu\n" 
        + "-------------------------\n" 
        + "1 - Show Makanan & Minuman\n" 
        + "2 - Show Makanan\n"
        + "3 - Show Minuman\n" 
        + "4 - Add Makanan\n"
        + "5 - Add Minuman\n" 
        + "6 - Hapus Menu Makanan\n" 
        + "7 - Hapus Menu Minuman\n" 
        + "8 - Cari Makanan\n" 
        + "9 - Check First Line Menu\n" 
        + "0. Exit\n"
        + "-------------------------\n"
        + "Pilih Menu : ");
        System.out.print(mainMenu);

        String menu1 = ("-------------------------\n"
        + "Daftar Makanan : " + makanan + "\n"
        + "Daftar Minuman : " + minuman + "\n");

        String menu2 = ("-------------------------\n"
        + "Daftar Makanan : " + makanan + "\n");

        String menu3 = ("-------------------------\n"
        + "Daftar Makanan : " + minuman + "\n");

        String menu4 = ("-------------------------\n"
        + "Masukan Menu Makanan Untuk Ditambahkan \n");

        String menu5 = ("-------------------------\n"
        + "Masukan Menu Minuman Untuk Ditambahkan \n");

        String menu6 = ("-------------------------\n"
        + "Menu Makanan \n"
        + makanan + "\n"
        + "Pilih menu yang akan dihapus : ");

        String menu7 = ("-------------------------\n"
        + "Menu Minuman \n"
        + minuman + "\n"
        + "Pilih menu yang akan dihapus : ");

        String menu8 = ("-------------------------\n"
        + "Cari Makanan & Minuman dari Menu : \n");

        String menu9 = ("-------------------------\n"
        + "Makanan yang berada di antrian pertama adalah "
        + makanan.peek() + "\n"
        + "Minuman yang berada di antrian pertama adalah "
        + minuman.peek());

        int x = input.nextInt();
        if (x==1) {
            System.out.println(menu1);
            Enter.enter();
        } 
        else if (x==2){
            System.out.println(menu2);
            Enter.enter();
        } else if (x==3){
            System.out.println(menu3);
            Enter.enter();
        } else if (x==4){
            System.out.print(menu4);
            String y = input2.nextLine();
            makanan.add(y);
            System.out.println("Menu Berhasil Ditambahkan");
            System.out.println(makanan);
            Enter.enter();
        } else if (x==5){
            System.out.println(menu5);
            String y = input2.nextLine();
            minuman.push(y);
            System.out.println("Menu Berhasil Ditambahkan");
            System.out.println(minuman);
            Enter.enter();
        } else if (x==6) {
            System.out.println(menu6);
            String y = input2.nextLine();
            makanan.remove(y);
            System.out.println("Menu Berhasil Dihapus");
            System.out.println(makanan);
            Enter.enter();
        } else if (x==7) {
            System.out.println(menu7);
            String y = input2.nextLine();
            minuman.remove(y);
            System.out.println("Menu Berhasil Dihapus");
            System.out.println(minuman);
            Enter.enter();
        } else if (x==8) {
            System.out.println(menu8);
            String y = input2.nextLine();
            if (makanan.contains(y)) {
                System.out.println("Available");
            } else if (minuman.contains(y)){
                System.out.println("Available");
            } else {
                System.out.println("n/a");                
            }           
            Enter.enter(); 
        } else if (x==9){
            System.out.println(menu9);
            Enter.enter();
        }
        else {
        System.exit(0);             
        }
        // switch (x) {
        //     case 1:
        //         System.out.println(menu1);
        //         System.out.print("Ketik \"Enter\" untuk kembali");
        //         Scanner scanner = new Scanner(System.in);
        //         scanner.nextLine();
        //         main(new String[0]);           
        //         break;     
        //     case 2:
        //         // Perform "encrypt number" case.
        //         break;
        //     case 3:
        //         // Perform "decrypt number" case.
        //         break;
        //     case 0:
        //         System.exit(0); 
        //         break;
        //     default:
        //         // The user input an unexpected choice.
        // }
    }
}
