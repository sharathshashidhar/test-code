package for_interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;


public class Read_File {
	
	public static void main(String args[]) throws IOException{
		 BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
		    try {
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();

		        while (line != null) {
		            sb.append(line);
		            sb.append(System.lineSeparator());
		            line = br.readLine();
		        }
		        System.out.println(sb.toString());
		    } finally {
		        br.close();
		    }
		    
		    FileInputStream inputStream = new FileInputStream("hello.txt");
		    try {
		        System.out.println(IOUtils.toString(inputStream));
		    } finally {
		        inputStream.close();
		    }
		    System.out.println();
		    
		    for(String line: FileUtils.readLines(new File("hello.txt"),Charsets.UTF_8))
		        System.out.println(line);
		    
		    System.out.println();
		    LineIterator it = FileUtils.lineIterator(new File("hello.txt"), "UTF-8");
		    try {
		        while (it.hasNext()) {
		            System.out.println(it.nextLine());
		            // do something with line
		        }
		    } finally {
		        LineIterator.closeQuietly(it);
		    }
	}

}
