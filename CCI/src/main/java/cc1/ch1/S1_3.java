package cc1.ch1;

import java.util.HashMap;
import java.util.Map;

import cc1.BaseCCI;

public class S1_3 extends BaseCCI
{

	public static void main(String[] args)
	{
		print(removeDuplicatedChar("adfdeddaasdff"));
	}

	public static String removeDuplicatedChar(String str)
	{
		if (str == null || str.length() < 2)
			return str;
		Map<Integer, Boolean> map = new HashMap<>();
		char[] strChars = str.toCharArray();
		map.put((int) strChars[0], true);
		int tail = 1;
		for (int i = 1; i < strChars.length; i++)
		{
			if (map.get((int) strChars[i]) == null)
			{
				strChars[tail++] = strChars[i];
				map.put((int) strChars[i], true);
			}
		}
		return new String(strChars, 0, tail);
	}
}
