package cesc.examples.java;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSandwich("abcbreaz"));		
	}
	
	public static boolean removeExtremes(String str) {
		if(str.length()>4) {
			return removeExtremes(str.substring(1, str.length()-1));
		}
		else {
			if (str.contains("XYZ")) return true;
			else return false;
		}
	}

	public static String getSandwitch(String str) {
		

		
		//int breadLength = 5;
		int indexOfBread = str.indexOf("bread");
		if(indexOfBread >= 0) {
			int indexOfSecondBread = str.substring(indexOfBread+5).indexOf("bread");
			String trimmed=str.substring(indexOfBread+5);
			if(indexOfSecondBread>0) {
				// Case there is 'something'
				String candidate=trimmed.substring(0,indexOfSecondBread);
				if( candidate.contains("bread")){ //startAllOverAgaiN }
					return getSandwitch(candidate);
				}
				else return candidate;
			} else if( trimmed.contains("bread")) {
				return getSandwitch(trimmed);				
			}
			else return "";
		}
		return "";
	}


	public static String getSandwich(String str) {
	
		if (str.contains("bread")) {
			// int breadLength = 5;
			int indexOfBread = str.indexOf("bread");
			String corredtedFirst = str;
			if (indexOfBread >= 0) {
				corredtedFirst = str.substring(indexOfBread);
			}
			int i = 0;
			while (!corredtedFirst.endsWith("bread")) {
				corredtedFirst = corredtedFirst.substring(0, corredtedFirst.length() - 1);
			}
			corredtedFirst=corredtedFirst.substring(5);
			
			if (corredtedFirst.contains("bread")){
				if( corredtedFirst.endsWith("bread")){
					corredtedFirst=corredtedFirst.substring(0,corredtedFirst.length()-5);
					//return getSandwich(corredtedFirst);
					return corredtedFirst;
				}
				else {
					return corredtedFirst;
				}
				//corredtedFirst=corredtedFirst.substring(0,str.length()-5);
				//corredtedFirst=corredtedFirst.substring(5);
				
			}
			else return corredtedFirst;			
			
		} else {
			return "";
		}



}
}
