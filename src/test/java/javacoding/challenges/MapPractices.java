package javacoding.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapPractices {

	public static void main(String[] args) {
		
	//	HashMap map = new HashMap();
		
		Map<Integer, String> mapOne = new HashMap<Integer, String>();
		
		mapOne.put(2545, "Alam");
		mapOne.put(2551, "Alam");
		mapOne.put(2568, "Alam");
		mapOne.put(null, null);
		mapOne.put(2551, null);
		mapOne.put(2568, null);
	
		
		for (Entry newValue : mapOne.entrySet() ) {
			System.out.println(newValue.getKey()+ " " + newValue.getValue());
			
		}
	}
	
	
	
}
