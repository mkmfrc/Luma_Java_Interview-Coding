package javacoding.challenges;

import java.util.HashSet;
import java.util.Set;

public class SetPractices {

	public static void main(String[] args) {
		
		HashSet<Integer> hSet = new HashSet<Integer>();
		
		
		Set<Integer> inst1 = new HashSet<Integer>();

		inst1.add(100);
		inst1.add(200);
		inst1.add(200);
		inst1.add(null);
		inst1.add(null);
		
		System.out.println(inst1.contains(200));
		
		
		for (int i=0; i<inst1.size(); i++){
			
		}
		
	//	System.out.println(inst1.contains(200));  //Usining contain method
		
		
	}
	
}
