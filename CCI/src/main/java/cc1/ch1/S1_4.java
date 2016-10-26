package cc1.ch1;

import java.util.HashMap;
import java.util.Map;

import cc1.BaseCCI;

public class S1_4 extends BaseCCI
{
	public static void main(String[] arg)
	{
		print(isAnagrams("2223", "2332"));
	}

	public static boolean isAnagrams(String str1, String str2)
	{
		if (str1 == null && str2 == null)
		{
			return true;
		}
		else if ((str1 == null && str2 != null)
				|| (str1 != null && str2 == null))
		{
			return false;
		}
		else
		{
			if (str1.length() != str2.length())
			{
				return false;
			}
			char[] str1Chars = str1.toCharArray();
			char[] str2Chars = str2.toCharArray();

			Map<Character, Integer> map = new HashMap<>();
			for (char c : str1Chars)
			{
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
			for (char c : str2Chars)
			{
				if (map.get(c) == null || map.get(c) <= 0)
				{
					return false;
				}
				else
				{
					map.put(c, map.get(c) - 1);
				}
			}
			return true;
		}
	}
}
