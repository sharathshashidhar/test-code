package com.qubole.qa.offline;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.TrueFileFilter;

/**
 * 
 * @author sshashid
 *
 */
public class SortByTimeStamp {
	
	public static void main(String args[]) throws IOException {
		File directory = new File("C:\\Apps\\a_IOD\\wsdls");
		
		System.out.println("The Enitre list of files from: " + directory.getCanonicalPath());
		System.out.println("--------------------------------------------------");
		List<File> fullFileList = (List<File>) FileUtils.listFiles(directory, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
		
		for (File file : fullFileList) {
			System.out.println("FileName: " + file.getCanonicalPath() + " TimeStamp: " + new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(
				    new Date(file.lastModified()) ));
		}
	}
	
	
	

}
