import java.io.*;

public class Array_Absurdity {
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] Split = line.split(";");
            System.out.println(line);
            
        } 
    }
}
