package cc1.ch1;

import cc1.BaseCCI;

public class S1_5 extends BaseCCI
{

	public static void main(String[] args)
	{
		print(replaceSpace("   ddd  ddd ass  dd"));
	}

	public static String replaceSpace(String str)
	{
		if (str == null || str.isEmpty())
		{
			return str;
		}
		char[] strChars = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strChars.length; i++)
		{
			if (strChars[i] == 32)
			{
				sb.append("%20");
			} else
			{
				sb.append(strChars[i]);
			}
		}
		return sb.toString();
	}
}
