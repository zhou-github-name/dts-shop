package com.qiguliuxing.dts.core.util;

import java.util.Map;

/**
 * @author DELL
 */
public class SystemInfoPrinter {
	public static final String CREATE_PART_COPPER = "XOXOXOXOX";

	private static int maxSize = 0;

	public static void printInfo(String title, Map<String, String> infos) {
		setMaxSize(infos);

		printHeader(title);

		for (Map.Entry<String, String> entry : infos.entrySet()) {
			printLine(entry.getKey(), entry.getValue());
		}

		printEnd();
	}

	private static void setMaxSize(Map<String, String> infos) {
		for (Map.Entry<String, String> entry : infos.entrySet()) {
			if (entry.getValue() == null) {
				continue;
			}
			int size = entry.getKey().length() + entry.getValue().length() - 80;

			if (size > maxSize) {
				maxSize = size;
			}
		}

		//maxSize = maxSize + 10;
	}

	private static void printHeader(String title) {
		System.out.println(getLineCopper());
		System.out.println("        " + title);
	}

	private static void printEnd() {
		System.out.println("\n"+getLineCopper());
	}

	private static String getLineCopper() {
		StringBuilder copper = new StringBuilder();
		for (int i = 0; i < maxSize; i++) {
			copper.append("=");
		}

		return copper.toString();
	}

	private static void printLine(String head, String line) {
		if (line == null) {
			return;
		}
		if (head.startsWith(CREATE_PART_COPPER)) {
			System.out.println("\n"+"    [[  " + line + "  ]]"+"\n");
		} else {
			//head = formatString(head,15," ");
			System.out.println("    " + head + "->        " + line);
		}
	}

	public static String formatString(String str, int length, String slot){
		StringBuilder sb = new StringBuilder();
		sb.append(str);

		int count = length - str.length();

		while(count > 0){
			sb.append(slot);
			count --;
		}

		return sb.toString();
	}
}
