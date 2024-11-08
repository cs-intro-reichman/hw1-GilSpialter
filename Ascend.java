// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));

		//until now it was simple.
		//now i will add more integers to simplify the later caculations.
		int minAB=Math.min(a, b);
		int minAC=Math.min(a, c);
		int minBC=Math.min(b, c);
		//by pulling out the minimums of all pairs, i excluded the max integer.
		//if i find the remaining largest of all the minimums. that is the second largest of the original 3.
		///in this case- the median of the original three integers.
		int med = Math.max(minAB, Math.max(minAC, minBC));
		System.out.println(min+" "+med+" "+max);
		}
}
