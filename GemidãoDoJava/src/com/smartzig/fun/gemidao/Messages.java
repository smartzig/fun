package com.smartzig.fun.gemidao;

/**
 * 
 * @author Lucas Grabert 09/2017
 *  
 */
public class Messages {
	
	private static final String gem0 = "AAHNNN AHHHOOWWNWNN AAANNNNN HUUUUUUNNNN A¿¿¿¿¿¿¿¿`NNNNNNNN";
	
	private static final String gem1 = "AAAAAAAAAHNNN HUUUUUUNNNN AHHHOOWWNWNN AAANNNNN  A¿¿¿¿¿¿¿¿NNNNNNNN";
	private static final String gem2 = " AHHHOOWWNWNN AAANNNNN  A¿¿¿¿¿¿¿¿NNNNNNNN";
	
	private static final String gem3 = "AAHNNN AHHHOOWWNWNN AAANNNNN HUUUUUUNNNN A¿¿¿¿¿¿¿¿`NNNNNNNN";
	
	private static final String troll = "VocÍ caiu no Gemid„o do Java.";
	
	public static String getMessage(int num) {
		switch (num) {
		case 1:
			return gem0;
		case 2:
			return gem1;
		case 3:
			return gem2;
		case 4:
			return gem3;		
		}
		return null;
	}
	

	public static String getTroll() {
		return troll;
	}

}
