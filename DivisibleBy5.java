import java.util.*;

class DivisibleBy5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of binary numbers you want to input (must by positive)");
		int n = sc.nextInt();

		if(n < 0)
		{
			System.out.println("The input number should be positive");
			return;
		}
		int binaryArr[] = new int[n];

		System.out.println("Enter " + n + " binary numbers");
		for(int i=0; i<n; i++)
		{
			binaryArr[i] = sc.nextInt();
		}
    
        System.out.println("Here are the binary number(s) divisible by 5");

		for(int i=0; i<n; i++)
		{
			if(binaryToDecimal(binaryArr[i]) % 5 == 0)
			{
				System.out.println(binaryArr[i]);
			}
		}
	}


	public static int binaryToDecimal(int binary)
	{
		int power=0, decimal=0;

		while(binary != 0)
		{
			int lastDigit = binary % 10;
			binary = binary / 10;

			decimal = decimal + lastDigit * (int)(Math.pow(2, power));
			power++;
		}

		return decimal;
	}
}