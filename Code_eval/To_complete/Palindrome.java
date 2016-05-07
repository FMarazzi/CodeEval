//INCOMPLETE TESTING
import java.io.*;
import java.util.ArrayList;
public class Palindrome {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            char[] arr = line.toCharArray();
            int[] num = new int[arr.length];
            int number = 0;
            
            for (int i = 0; i < arr.length; i++){
                num[i] = arr[i] - '0';
            }
            int loop=0;
            
            while(!TestPal(num)){
            	TestPal(ToInt(num)+ToInt(Turnit(num)))
            	loop++;
            	if(loop > 100) break;
            }
            
            System.out.print(loop);
            System.out.print(" ");
            System.out.println(ToInt(number));
        }
    }
    
    private static int[] Turnit(int[] num){    	
    	int[] numnow = new int[num.length];
    	
    	for(int i=(num.length-1);i>=0;i--){
    		numnow[i] = num[num.length-i-1];
    	}
		return numnow;
    }
    
    private static int ToInt(int[] arr){
    	int num = 0;
    	for(int i=0;i<arr.length;i++){
    		num += arr[i]*Math.pow(10, i);
    	}
    	return num;
    }
    
    private static ArrayList<Integer> ToList(int num){
    	int temp = num;
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	do{
    	    array.add(temp % 10);
    	    temp /= 10;
    	} while  (temp > 0);
    	return array;
    }
    
    private static boolean TestPal(int[] num){
    	int j=0;
    	int k=num.length-1;
    	while(j<k){
    		if(num[j++] != num[k--]){
    			return false;
    		}   		
    	}
		return true;
    }
    
}
