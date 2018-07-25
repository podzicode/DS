package DS;
import java.util.*;
public class Ransome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Integer,String> myMap= new HashMap<>();
		String[] a= {"give","me","one","grand","today","night"};
		String[] b= {"give","One","grand","today"};
		Ransome r1= new Ransome();
		System.out.println(r1.isRansome(a, b));
		
		

	}
	public String isRansome(String[]a, String[]b) {
		Map<Integer,String> myMap= new HashMap<>();
		boolean canRansome=true;
		if(a.length==0 || b.length==0) {
			return "No";
		}
		for(int i=0;i<a.length;i++) {
			myMap.put(i, a[i]);
		}
		for(String s:b) {
			if(myMap.containsValue(s)) {
				int key=Ransome.keyfromValue(myMap, s);
				myMap.remove(key);
				
			}
			else {
				canRansome=false;
			}
		}
		if(canRansome) {
			return "Yes";
		}
		else {
			return "No";
		}
	}
	
	public static int keyfromValue(Map m,String value) {
		Set<Integer> keysSet=m.keySet();
		for(Integer i:keysSet) {
			if(m.get(i).equals(value)) {
				return i;
			}
		}
		return 0;
	}

}
