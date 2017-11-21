class Bentukwajah{
    /*Membuat sebuah method respons pada class induk
    dimana mengembalikan sebuah nilai String*/
    public String respons(){
        return("Perhatikan reaksi wajah saya\n");
    }
}

    /*Membuat class-class lain dengan turunan
    dari class BentukWajah*/
class Senyum extends Bentukwajah{
    public String respons(){
        return("Senyum karena senang\n");
    }
}

class Tertawa extends Bentukwajah{
    public String respons(){
        return("Tertawa karena Gembira\n");
    }
}

class Marah extends Bentukwajah{
    public String respons(){
        return("Kemarahan disebabkan bertangkar\n");
    }
}

class Sedih extends Bentukwajah{
    public String respons(){
        return("Sedih disebabkan cemburu\n");
    }
}

//program utama
public class PolimorphisBentukWajah{
    /**Main method */
    public static void main (String []args){
        System.out.println("\n Program Polimorphis");
        System.out.println("========================");
        //membuat objek-objek raut (ekspresi) dari wajah
        Bentukwajah objbentuk = new Bentukwajah();
        Senyum objsenyum = new Senyum();
        Tertawa objtertawa = new Tertawa();
        Marah objmarah = new Marah();
        Sedih objsedih = new Sedih();
        //polimorphis dari bentuk wajah ada 5 dimulai dari 0-4
        Bentukwajah [] Bentuk = new Bentukwajah[5];
        Bentuk[0] = objbentuk;
        Bentuk[1] = objsenyum;
        Bentuk[2] = objtertawa;
        Bentuk[3] = objmarah;
        Bentuk[4] = objsedih;
        System.out.println("Bentuk[0] : " + Bentuk[0].respons());
        System.out.println("Bentuk[1] : " + Bentuk[1].respons());
        System.out.println("Bentuk[2] : " + Bentuk[2].respons());
        System.out.println("Bentuk[3] : " + Bentuk[3].respons());
        System.out.println("Bentuk[4] : " + Bentuk[4].respons());

    }
}