import java.util.ArrayList;
import java.util.Collections;

public class CombinationOfIntegers {
	
	public static void main(String[] args) {
		 int value=6;
		
		ArrayList<Integer> list= new ArrayList();
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(4);
		
		Collections.sort(list,Collections.reverseOrder());
	
		outer:
		for(int element:list) {
			
			for(int j=list.indexOf(element)+1;j<list.size();j++) {
				if((element+list.get(j))==value) {
					System.out.println("The values are "+element+" and "+list.get(j));
					break outer;
					
				}
				else
					continue;
				
			}
		}
		
	}

}

