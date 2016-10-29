package cc1.ch1;

public class S1_1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(isUniqueChars("aaaadsdaa"));
	}

	public static boolean isUniqueChars2(String str)
	{
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++)
		{
			int val = str.charAt(i);
			if (!char_set[val] && i != 0)
				return false;
			char_set[val] = true;
		}
		return true;
	}

	public static boolean isUniqueChars(String str)
	{
		int checker = str.charAt(0) - 'a';
		for (int i = 1; i < str.length(); i++)
		{
			int val = str.charAt(i) - 'a';
			if ((checker ^ val) > 0)
				return false;
		}
		return true;
	}
}
