import java.util.Arrays;
import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        char arr1[]=A.toCharArray();
        char arr2[]=B.toCharArray();
        char temp;
        if(A.length() != B.length())
        {
        	System.out.println("Not Anagram");
        }
        else
        {
        	for(int i=0; i<A.length(); i++)
        	{
        		for(int j=i+1; j<A.length(); j++)
        		{
        			if(arr1[i]>arr1[j])
        			{
        			temp=arr1[i];
        			arr1[i]=arr1[j];
        			arr1[j]=temp;
        			}
        		}
        	}
        }
        A=new String(arr1);
        Arrays.sort(arr2);
        B=new String(arr2);
        System.out.println(A);
        System.out.println(B);
	}

}

