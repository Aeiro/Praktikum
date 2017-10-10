public class DemoContinueLoop {

    public static void main(String[] args) {
        int a, b;
        for (b=0;b<3;b++) {
            if (b==1)
                continue;
            System.out.println("a=" + a + " ; b=" + b);
        }
    }
}