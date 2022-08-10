package fixed_point;

public class main {

	public static void main(String[] args) {
		FixedPoint FixedPoint1 = new FixedPoint();
		
		int[] A1 = {-10,-5,0,3,7};
		int[] A2 = {0,2,5,8,17};
		int[] A3 = {-10,-5,3,4,7,9};
		
		int output = FixedPoint1.FixedPoint(A1);
		System.out.println(output);

	}

}
