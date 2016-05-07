import java.io.*;
public class Rightmost {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] Split = line.split(",");
            Check(Split[0].toCharArray(),Split[1].toCharArray());
        }
    }
    
    public static void Check(char[] word, char[] letter){
    	for(int i=(word.length-1);i>=0;i--){
    		if(word[i] == letter[0]){
    			System.out.println(i);
    			return;
    		}
    	}
    	System.out.println(-1);
    }
}
