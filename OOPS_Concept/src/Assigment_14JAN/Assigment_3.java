package Assigment_14JAN;

import java.util.Arrays;

class Arry
{
    static void printOrder(int[] arr, int n)
    {
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++)
        {
            System.out.print(arr[i] + " ");
        }
        for (int j = n - 1; j >= n / 2; j--)
        {
            System.out.print(arr[j] + " ");
        }
    }
public class Assigment_3 {

	public static void main(String[] args) {
		int[] arr = {89,23,56,12,99};
        int n = arr.length;
        printOrder(arr, n);
	}
	
	
			
	}


}
