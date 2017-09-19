public class DemoLogika {

	public static void main(String [] args) {
		//beberapa nilai
		int i = 37;
		int j = 42;
		int k = 42;
		System.out.println("Nilai Variabel...");
		System.out.println("Nilai i : " + i);
		System.out.println("Nilai j : " + j);
		System.out.println("Nilai k : " + k);
		//lebih besar dari
		System.out.println("Lebih besar dari...");
		System.out.println("Nilai i > j : " + (i > j)); //false
		System.out.println("Nilai j > i : " + (j > i)); // true
		System.out.println("Nilai k > j : " + (k > j)); // false
		//lebih besar atau sama dengan
		System.out.println("Lebih besar atau sama dengan...");
		System.out.println("Nilai i >= j : " + (i >= j)); //false
		System.out.println("Nilai j >= i : " + (j >= i)); //true
		System.out.println("Nilai k >= j : " + (k >= j)); //true
		//lebih kecil atau sama dengan
		System.out.println("Lebih kecil atau sama dengan...");
		System.out.println("Nilai i <= j : " + (i <= j)); //true
		System.out.println("Nilai j <= i : " + (j <= i)); //false
		System.out.println("Nilai k <= j : " + (k <= j)); //true
		//sama dengan
		System.out.println("Sama dengan...");
		System.out.println("Nilai i == j : " + (i == j)); //false
		System.out.println("Nilai k == j : " + (k == j)); //true
		//tidak sama dengan
		System.out.println("Tidak sama dengan...");
		System.out.println("Nilai i != j : " + (i != j)); //true
		System.out.println("Nilai k != j : " + (k != j)); //false

	}
}