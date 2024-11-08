// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int sum= Integer.parseInt(args[3]);
		double pay=Math.ceil( sum / 3.0 );
		System.out.println("Dear "+name1+", "+name2+", and "+name3+": pay "+pay+" Shekels each.");
		}
}
