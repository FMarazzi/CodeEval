import java.io.*;
public class Unique_el {
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] strArray = line.split(",");
            int[] intArray = new int[strArray.length];
            for(int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            Check(intArray);
        }
    }
	
	public static void Check(int[] Array){
		int[] Uniques = new int[Array.length];
		Uniques[0] = Array[0];
		int i;
		int last=0;
		for(i=1;i<Array.length;i++){
			if(Uniques[last] != Array[i]){
				Uniques[++last] = Array[i];
			}
		}
		
		for(i=0;i<last;i++){
			System.out.print(Uniques[i]+",");
		}
		System.out.println(Uniques[last]);
	}
}