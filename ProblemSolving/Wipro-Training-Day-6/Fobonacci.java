public class Fobonacci {
	public long getFibonacci (int input1) {
		//if (input1 == 0) return 0;
		//if (input1 == 1) return 1;
		
		long x = 0;
		long y = 1;
		long z;
		 
		for (int i = 1; i < input1; i++) {
			System.out.println(x);
			z = x + y;
			// 0+1
			x = y;
			y = z;
		}
		
		//System.out.println("input1: " + input1);
		//System.out.println("x: " + x + " y: " + y);
		return x;
	}
}
