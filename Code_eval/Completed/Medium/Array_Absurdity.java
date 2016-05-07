package Medium;
import java.io.*;

public class Array_Absurdity {
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] Split = line.split(";");
            String[] Numbers = Split[1].split(",");
            int length = Integer.parseInt(Split[0]);
            Integer[] Test = new Integer[length];
            
            for(int i=0;i<length;i++){
            	int index = Integer.parseInt(Numbers[i]);
            	if(Test[index] == null) Test[index] = 1;
            	else{ 
            		System.out.println(index);
            		break;
            	}
            }
        } 
    }
}