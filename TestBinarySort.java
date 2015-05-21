package com.qubole.qa.offline;

import org.testng.annotations.Test;

public class TestBinarySort {


	@Test
	public void test1() {
		SortBinary sb = new SortBinary();
		int[] a={1,0,1,1};
		sb.sort(a);
	}
	
	@Test
	public void test2() {
		SortBinary sb = new SortBinary();
		int[] a={1,0,1,1,0};
		sb.sort(a);
	}
	
	@Test
	public void test3() {
		SortBinary sb = new SortBinary();
		int[] a={7,0,2,1};
		sb.sort(a);
	}
	
	@Test
	public void test4() {
		SortBinary sb = new SortBinary();
		int[] a={1,0,1,1,0,1,0,1,0,0,1,1,1,0};
		sb.sort(a);
	}
}