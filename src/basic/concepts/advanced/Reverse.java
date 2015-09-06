package basic.concepts.advanced;
public class Reverse {
    public static void main(String args[])
	{
		Integer s=0,a = 2112211;
		
		String strDigit = a.toString(); 		
		char[] arr = strDigit.toCharArray();
		char[] revarr = strDigit.toCharArray() ;		
		for(int index=arr.length-1, revindex=0; index>=0; index--, revindex++) {
			revarr[revindex] = arr[index];
		}
		
		int revNum = Integer.parseInt(new String(revarr));
		int num = Integer.parseInt(new String(arr));
		System.out.println(revNum);
		System.out.println(num);
		if(num == revNum) 
			System.out.println("Palindromic Number ");
		else
			System.out.println("Not Palindromic Number");
        }
    
    
    
}
