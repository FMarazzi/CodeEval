import java.io.*;
import java.util.*;

public class Set_Intersection {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] Split = line.split(";");
            
            int[] Fint = Process(Split[0]);
            int[] Sint = Process(Split[1]);
            
            Check(Fint,Sint);
        }
    }
    
    public static int[] Process(String top){
    	String[] s = top.split(",");
    	int[] a = new int[s.length];
    	for(int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
    	return a;
    }
    
    public static void Check(int[] F, int[] S){   	
    	Set<Integer> a = HashCreate(F);
    	Set<Integer> b = HashCreate(S);
    	Set<Integer> r = new HashSet<Integer>(a);
    	
    	r.retainAll(b);
    	int[] fin = new int[r.size()];
    	int i=0;
    	
    	for (int num : r) {
    	    fin[i++]=num;
    	}
    	Printing(fin);
    }

    public static void Printing(int[] x){
    	Arrays.sort(x);
    	int len = x.length-1;
    	if(len < 0) {
    		System.out.print("\n");
    		return;
    	}
    	for(int i=0;i<len;i++){
			System.out.print(x[i]+",");
		}
		System.out.println(x[len]);
    }
    
    public static Set<Integer> HashCreate(int[] a){
    	Set<Integer> b = new HashSet<Integer>(); 
    	for(int i=0;i<a.length;i++){
    		b.add(a[i]);
    	}
    	return b;
    }
}
