package generics;
import java.util.*;

public class swap {
public static void main(String args[])
{
	int[] arr= {1,3,5,7,9,2};
	
	Swap(arr,1,2);
	System.out.println(Arrays.toString(arr));
}

private static<T> void Swap(int[] arr, int i, int j) {
	// TODO Auto-generated method stub
	int t=arr[i];
	arr[i]=arr[j];
	arr[j]=t;
}
}
