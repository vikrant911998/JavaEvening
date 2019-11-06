package com.bmpl.los.utils;

import java.util.Scanner;

public class Utility implements StageConstants{
	
	public static int SERIAL_COUNTER = 1;
	public static Scanner scanner = new Scanner(System.in);
	
	public static String getStageName(int stage) {
		
		switch(stage) {
			case SOURCING:
				return "Sourcing";
			case QDE:
				return "Qde";
			case DEDUPE:
				return "Dedupe";
			case SCORING:
				return "Scoring";
			case APPROVAL:
				return "Approval";
			default:
				return "NO STAGE FOUND";
		}
	}
}
