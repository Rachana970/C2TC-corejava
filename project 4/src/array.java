import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Element is found");
				break;
	}

}
}
}