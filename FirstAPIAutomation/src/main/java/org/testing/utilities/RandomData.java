package org.testing.utilities;

import java.util.Random;

//purpose --to generate a random string value

public class RandomData 
{
	public static String generateRandomData()
	{
		Random r = new Random();
		Integer i = r.nextInt();
		return i.toString();
	}
}
