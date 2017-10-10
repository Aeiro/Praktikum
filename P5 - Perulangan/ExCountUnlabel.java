public class ExContinueUnlabel {

    public static void main(String[] args) {
        int count = 0;
        for (int i=0; i<names.lenght; i++){
            if ( !names[i].equals("beah") ){
                contine; //skip next statement
            }
            count++;
        }
        System.out.println("There are " + count + " Beahs in the list");
    }

}