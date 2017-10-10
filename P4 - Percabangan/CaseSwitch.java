public class CaseSwitch {
    public static void main (String[] args){
        String color = "blue";
        switch (color){
            case "blue":
                System.out.println("My Favorite color is blue");
                break;
            case "red":
                System.out.println("My Favorite color is red");
                break;
            case "green":
                System.out.println("My Favorite color is green");
                break;
            default:
                System.out.println("My Favorite color is black");
        }
    }
}