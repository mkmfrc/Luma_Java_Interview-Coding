package practice.Coding;

public class SwapTheNumber {

	public static void main(String[] args) {
		
		int x = 100;
		int y = 200;
		
		System.out.println("early x :" + x);
		System.out.println("early y :" + y);
		
	//without any third variable how can you swap the number?
		//we have to storing 
		y= x+y;
		
		x= y-x;
		y=y-x;
		
		System.out.println("now x :" + x);
		System.out.println("now y :" + y);
	}

}
