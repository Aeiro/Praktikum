public class AutoNim {
    
    public static void main(String[] args) {
        // NIM : Tahun Masuk + Kode Prodi + Nomor Urut Registrasi
        String ta = "2016";
        String kd_prodi = "153";
        String no_reg = "0005";
        String nim;

        nim = ta.substring(2, 4)+ kd_prodi+no_reg;

        System.out.println("NIM : "+nim);
    }
}