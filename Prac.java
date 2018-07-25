package DS;

public class Prac {

	public static void main(String[] args) {
		int A=1;
		
		String x= Integer.toString(A);
		String y="";
		int i=0;
		int j=x.length()-1;
		if(x.length()==1){
		System.out.println(A);
		}
		if((x.length()%2)!=0 && x.length()>1)
		{
		while(j>i) {
			if(i!=j) {
				y+=x.charAt(i);
				y+=x.charAt(j);
				i++;
				j--;
			}
			if(i==j) {
				y+=x.charAt(i);
			}
			
		}
		}
		else {
			while(j>i) {
				y+=x.charAt(i);
				y+=x.charAt(j);
				i++;
				j--;
			}
		}
		A=Integer.parseInt(y);
		System.out.println(A);
		// TODO Auto-generated method stub

	}
	

}
