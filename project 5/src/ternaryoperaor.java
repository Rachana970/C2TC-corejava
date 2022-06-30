
public class ternaryoperaor {

	public static void main(String[] args) {
		int year = 1900;
		String str=((year%4 == 0 && year%100 != 0) || year%400 == 0) ? "Leap year" : "Not Leap year";
		System.out.println(str);
		
	}

}
