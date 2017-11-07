public class Tabungan{
    int saldo;

    //method constructor
    public Tabungan(int initsaldo){
        saldo = initsaldo;
    }
    
    //method void : tidak mengembalikan nilai
    void ambilUang(int jumlah){
        saldo = saldo - jumlah;
    }
}