package for_interview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Sort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("sort1.txt"));
        Map<String, String> map=new TreeMap<String, String>();
        String line="";
        while((line=reader.readLine())!=null){
        	map.put(line,line);
        }
        reader.close();
        FileWriter writer = new FileWriter("sorted.txt");
        for(String val : map.values()){
        	writer.write(val);	
        	writer.write('\n');
        }
        writer.close();
    }

    private static String getField(String line) {
    	return line.split(",")[1];//extract value you want to sort on
	}

}
