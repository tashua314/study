package labo.isoroot.kwkb.task001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class compareListPerformance {

	private static int SIZE = 99999;

	private ArrayList<String> arrList;
	private LinkedList<String> linkedList;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new compareListPerformance().run();

	}

	private void run() {
		// データ作成
		createArrList();
		createLinkedList();
		// テスト
		testArrIndex();
		testLinkedIndex();
		testArrItelator();
		testLinkedItelator();

	}

	private void createLinkedList() {
		linkedList = new LinkedList<>();
		for (int i = 0; i < SIZE; i++) {
			linkedList.add("" + i);
		}
	}

	private void createArrList() {
		arrList = new ArrayList<>();
		for (int i = 0; i < SIZE; i++) {
			arrList.add("" + i);
		}
	}

	private void testLinkedItelator() {
		long start = System.currentTimeMillis();

		for (Iterator<String> it = linkedList.iterator(); it.hasNext();) {
			String tmp = it.next();
		}

		long end = System.currentTimeMillis();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		System.out.println(ste[1].getMethodName() + " : " + (end - start));
	}

	private void testArrItelator() {
		long start = System.currentTimeMillis();

		for (Iterator<String> it = arrList.iterator(); it.hasNext();) {
			String tmp = it.next();
		}

		long end = System.currentTimeMillis();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		System.out.println(ste[1].getMethodName() + " : " + (end - start));
	}

	private void testLinkedIndex() {
		long start = System.currentTimeMillis();

		for (int i = 0; i < SIZE; i++) {
			String tmp = linkedList.get(i);
		}

		long end = System.currentTimeMillis();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		System.out.println(ste[1].getMethodName() + " : " + (end - start));
	}

	private void testArrIndex() {
		long start = System.currentTimeMillis();

		for (int i = 0; i < SIZE; i++) {
			String tmp = arrList.get(i);
		}

		long end = System.currentTimeMillis();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		System.out.println(ste[1].getMethodName() + " : " + (end - start));
	}

}
