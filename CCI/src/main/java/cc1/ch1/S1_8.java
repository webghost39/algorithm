package cc1.ch1;

import cc1.BaseCCI;
//Assume you have a method isSubstring which checks if one word is a
//substring of another. Given two strings, s1 and s2, write code to check if s2 is
//a rotation of s1 using only one call to isSubstring (e.g.,"waterbottle"is a rota-
//tion of "erbottlewat").

public class S1_8 extends BaseCCI
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public static boolean isRotation(String s1, String s2)
	{
		if (s1 == null && s2 == null)
		{
			return true;
		}
		else if ((s1 == null && s2 != null) || (s1 != null && s2 == null))
		{
			return false;
		}
		else if (s1.length() != s2.length())
		{
			return false;
		}
		else
		{
			char[] s1Chars = s1.toCharArray();
			char[] s2Chars = s2.toCharArray();
			int start = 0;
			int i = start;
			int j = 0;
			while (i < s1.length() && j < s2.length())
			{
				if (s1Chars[i] == s2Chars[j])
				{
					i++;
					j++;
				}
				else
				{
					i = ++start;
					j = 0;
				}
			}
			return (j == s2.length() || (isSubString(s1.substring(0, start),
					s2.substring(j))));
		}

	}

	private static boolean isSubString(String substring, String substring2)
	{
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean isRotation2(String s1, String s2)
	{

		int len = s1.length();
		/* check that si and s2 are equal length and not empty */
		if (len == s2.length() && len > 0)
		{
			/* concatenate si and si within new buffer */

			String s1s1 = s1 + s1;
			return isSubString(s1s1, s2);

		}
		return false;
	}
}
