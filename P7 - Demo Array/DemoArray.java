public class DemoArray{

    public static void main(String[] args) {
        System.out.println("\ncontoh 1\n");
        String nama[] = new String[5];
        nama[0] = "Andi Novianto";
        nama[1] = "Zidna Aisya";
        System.out.println(nama[0]);
        System.out.println(nama[1]);
        System.out.println(nama[2]);

        System.out.println("\n\nContoh 2\n");
        int nilai[] = {75, 80, 90, 100};
        System.out.println("Cetak Nilai elemen 0 : "+nilai[0]);
        System.out.println("Cetak Nilai elemen 1 : "+nilai[1]);
        System.out.println("Cetak Nilai elemen 2 : "+nilai[2]);
        System.out.println("Cetak Nilai elemen 3 : "+nilai[3]);
        int jumlah = nilai[1] + nilai[2] + nilai[3];
        System.out.println("Jumlah Nilai elemen (1+2+3) : "+jumlah);
    }
}