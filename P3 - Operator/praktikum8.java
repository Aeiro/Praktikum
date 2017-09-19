public class DemoMath{
	
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		double x = 2.24;
		double y = 7.49;
		double z = 7.50;

		//Max dan Min
		System.out.println("Max int : " + Math.max(a,b));
		System.out.println("Min double : " Math.min(y,z));

		//Nilai x
		System.out.println("Ceil x : " + Math.ceil(x));
		System.out.println("Floor x : " + Math.floor(x));
		System.out.println("Round x : " + Math.round(x));

		//Nilai y
		System.out.println("Ceil y : " + Math.ceil(y));
		System.out.println("Floor y : " + Math.floor(y));
		System.out.println("Round y : " + Math.round(y));

		//Nilai z
		System.out.println("Ceil z : " + Math.ceil(z));
		System.out.println("Floor z : " + Math.floor(z));
		System.out.println("Round z : " + Math.round(z));

		//Nilai random, pangkat
		System.out.println("Random-1  : " + Math.random());
		System.out.println("Random-2  : " + Math.random());
		System.out.println("Random-3  : " + Math.random());
		System.out.println("Pangkat b,c  : " + Math.pow(b,c));

	}
}