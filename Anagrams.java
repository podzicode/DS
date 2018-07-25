package DS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abfec";
		String b="ghfa";
		
		Anagrams x= new Anagrams();
		int result=x.isAnagram(a, b);
		System.out.println(result);

	}
	public int isAnagram(String a, String b) {
		Map<Integer,Character> myMap= new HashMap();
		String x="";
		int minimumDeletions=0;
		for(int i=0;i<b.length();i++) {
			myMap.put(i, b.charAt(i));
		}
		for(int i=0;i<a.length();i++) {
			if(myMap.containsValue(a.charAt(i))) {
				
				x+=a.charAt(i);
				Object key= Anagrams.getKeyFromValue(myMap,a.charAt(i));
				myMap.remove(key);
			}
			else {
				continue;
			}
		}
		int lengthOfFirstString=a.length();
		int lengthOfSecongString=b.length();
		int lengthOfResultantString=x.length();
		if(lengthOfFirstString>lengthOfResultantString) {
			minimumDeletions+=(lengthOfFirstString-lengthOfResultantString);
		}
		if(lengthOfSecongString>lengthOfResultantString) {
			minimumDeletions+=(lengthOfSecongString-lengthOfResultantString);
		}
		return minimumDeletions;
		
	}
	public static Object getKeyFromValue(Map hm, Character value) {
		Set<Integer>a =hm.keySet();
        for (Object o : a) {
          if (hm.get(o).equals(value)) {
            return o;
          }
        }
        return null;
      }
	

}
