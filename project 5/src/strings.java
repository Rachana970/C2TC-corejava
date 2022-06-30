
public class strings {

	public static void main(String[] args) {
		String S = "Great" , t = "";
		String u = S.concat(t);
		if(u == S)
			System.out.println("same");
			else
				System.out.println("Not same");
		String e=S+t;
		if(e==S)
			System.out.println("same");
		else
			System.out.println("Not same");	
	}

}
