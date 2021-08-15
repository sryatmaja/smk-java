package kk3;

public class Lingkaran_Maja {

    static final double PI = Math.PI;

    float r;
    
    void luas(double r)
    {
        double a = PI * r * r;
  
        System.out.println("Luas Lingkaran: " + a);
    }
  

    void luas(float r)
    {
        double a = PI * r * r;
  
        System.out.println("Luas Lingkaran: " + a);
    }

    void kll(double r){
        double a = 2 * PI * r;
  
        System.out.println("Keliling Lingkaran: " + a);
    }

    void kll(float r){
        double a = 2 * PI * r;
  
        System.out.println("Keliling Lingkaran: " + a);
        System.out.println("-------------------------------");
    }

}