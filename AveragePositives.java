/**
 * Programming Assignment 6
 *
 * @author Natalie Young
 * @since 2021-11-09
 */

class AveragePositives
{
	/**
	 * Prints average of command-line args strictly greater than 0
	 * when parsed as doubles; produces 0 if no greater numbers
	 */
	public static void main(String[] args)
	{
		double sum = 0.0;
		int totalArgs = 0;
		double strValue = 0.0;
		double mean = 0.0;

		for (String arg : args)
		{
			strValue = Double.valueOf(arg);
			
			if (strValue > 0.0)
			{
				sum += strValue;

				totalArgs += 1;

				mean = sum / totalArgs;
			}
		}

		System.out.println(mean);
	}
}
