public class TestTabungan {

    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan (5000);
        System.out.println("Saldo Awal : "+tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil : 2300");
        System.out.println("Saldo Sekarang : "+ tabungan.saldo);
    }
}