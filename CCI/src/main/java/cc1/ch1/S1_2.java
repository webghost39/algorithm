package cc1.ch1;

public class S1_2
{

	public static void main(String[] args)
	{
		System.out.println(reverse("abcdefg"));
	}

	public static String reverse(String str)
	{
		if (str != null && str.length() > 0)
		{
			char[] chars = str.toCharArray();
			int i = 0, j = str.length() - 1;
			char temp;
			while (i < j)
			{
				temp = chars[i];
				chars[i] = chars[j];
				chars[j] = temp;
				i++;
				j--;
			}
			return new String(chars);
		}
		return str;

	}

}
