package kk3;

public class Main {
    public static void main(String[] args) {
        
        BangunDatar_Maja bangunDatar = new BangunDatar_Maja();
        
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
             
        PersegiPanjang_Maja persegiPanjang = new PersegiPanjang_Maja();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        Segitiga_Maja mSegitiga = new Segitiga_Maja();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;              

        Lingkaran_Maja mLingkaran = new Lingkaran_Maja();
        int r = 9;

        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
              
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mLingkaran.luas(r);
        mLingkaran.kll(r);

        mSegitiga.luas();


    }
}
