//INCOMPLETE
//INCOMPLETE
//INCOMPLETE
import java.io.*;
 
public class mailval {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            char[] word = line.toCharArray();
            if(CharPres(word,'@') + CharPres(word,' ') > 0){
            	System.out.println("true");
            }
            System.out.println("false");
        }     
    }
        
    private static int CharPres(char[] word,char letter){
    	for(int i=0;i<word.length;i++){
    		if(word[i]==letter) return 1;
    	}
    	return 0;
    }
    
}
