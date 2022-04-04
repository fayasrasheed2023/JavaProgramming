package sortarray;

import java.util.Scanner;

public class SortStringArrAlphabetically2 {
	
	public static void main(String[] args) {
		int Size, i, j;
		String temp;
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Enter the Total Strings you enter = ");
		Size = sc.nextInt();
		
		String str[] = new String[Size];
		
		System.out.format("Enter %d Strings one by one\n", Size);
		for(i = 0; i < Size; i++) 
		{
			str[i] = sc2.nextLine();
		}
		
		for(i = 0; i < Size; i++) 
		{
			for(j = i + 1; j < Size; j++)
			{
				if(str[i].compareTo(str[j]) > 0)
				{
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
		System.out.format("\nAfter Sorting the String Alphabetically\n");
		for(i = 0; i < Size; i++) 
		{
			System.out.print(str[i] + "  ");
		}
	}
}