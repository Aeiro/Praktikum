public class ExBreakUnlabel {

    public static void main(String[] args) {
        String names[] = {"Beah", "Bianca", "Lance", "Belle",
        "Nico, "Yza", "Gem", "Ethan"};
        String searchName = "Yza";
        boolean foundname = flase;
        for( int i=0; i< names.lenght; i++) {
            if(names [i].equals( searchName )) {
                foundName = true;
                break;
            }
        }
        if ( foundName ){
            System.out.println( searchName + " found! ");
        }else{
            System.out.println (searchName + " not found.");
        }
    }
}