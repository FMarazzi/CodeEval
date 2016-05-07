import java.io.*;
import java.util.*;

public class String_List {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] Split = line.split(",");
            BuildAndPrint(Integer.parseInt(Split[0]), BuildSet(Split[1]),"",false);
            System.out.println("");
        }
        buffer.close();
    }

    private static SortedSet<Character> BuildSet(String First){
		Set<Character> set = new HashSet<Character>();
		
		char temp;
    	for(int i=0;i<First.length();i++){
    		temp=First.charAt(i);
    		set.add(temp);
    	}
    	SortedSet<Character> Ordered = new TreeSet<Character>(set);
    	return Ordered;
    }
    
    private static void BuildAndPrint(int index, SortedSet<Character> set, String word,Boolean notlast){
    	if(index < 1){
    		System.out.print(word);
    		if(notlast) System.out.print(",");
    		return;
    	}
    	
    	Iterator<Character> iter = set.iterator();
    	int OrIndex = index;
    	String OrWord = word;
    	
    	while(iter.hasNext()){
    		word += iter.next();
    		BuildAndPrint(--index,set,word,iter.hasNext() || notlast);
    		word=OrWord;
    		index=OrIndex;
    	}
    }
}
