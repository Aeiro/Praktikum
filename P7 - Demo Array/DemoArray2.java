public class DemoArray2 {

    public static void main(String args[]) {
        //contoh program pencarian

        String names[] = {"Adi", "Aji", "Abbi", "Abdul", "Hasif"};
        String searchName = "Abbi";
        boolean foundName = false;
        for( int i=0; i< names.length; i++){
            if( names[i].equals( searchName )){
                foundName = true;
                break;
            }
        }
        if( foundName ){
            System.out.println( searchName + " found! ");
        }else{
            System.out.println( searchName + " not found. ");
        }
    }
}