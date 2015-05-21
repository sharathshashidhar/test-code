package com.qubole.qa.offline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class SortByTimeStampFull {

	public static void main(String args[]) throws IOException {
		File directory = new File("C:\\Apps\\a_IOD\\wsdls");

		System.out.println("The Enitre list of files from: " + directory.getCanonicalPath());
		System.out.println("--------------------------------------------------");
		List<File> fullFileList = (List<File>) FileUtils.listFiles(directory, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
		String fileToSort = null;
		for (File file : fullFileList) {
			if(file.getName().endsWith(".log")) {
				System.out.println("FileName: " + file.getCanonicalPath() + " TimeStamp: " + new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(
						new Date(file.lastModified()) ));
				fileToSort = file.getCanonicalPath();
			}
		}
		System.out.println(fileToSort);
		String outputFile = "output.txt";
		FileReader fileReader = new FileReader(fileToSort);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String inputLine;
		List<String> lineList = new ArrayList<String>();
		while ((inputLine = bufferedReader.readLine()) != null) {
			lineList.add(inputLine);
		}
		fileReader.close();
		Collections.sort(lineList);
		FileWriter fileWriter = new FileWriter(outputFile);
		PrintWriter out = new PrintWriter(fileWriter);
		for (String outputLine : lineList) {
			out.println(outputLine);
		}
		out.flush();
		out.close();
		fileWriter.close();
	}
}
