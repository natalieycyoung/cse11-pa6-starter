/**
 * Programming Assignment 6
 * https://ucsd-cse11-f21.github.io/assignments/pa6.html
 *
 * @author Natalie Young
 * @since 2021-11-09
 */

import tester.*;

class Pair
{
	int a;
	int b;

	Pair(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
}

class PairSelect
{
	static int[] getAs(Pair[] pairArray)
	{
		int[] As = new int[pairArray.length];

		for(int i = 0; i < pairArray.length; i++)
		{
			As[i] = pairArray[i].a;
		}

		return As;
	}
}

class ExamplePairs
{
	Pair pair1 = new Pair(0,3);
	Pair pair2 = new Pair(1,2);
	Pair pair3 = new Pair(2,1);
	Pair pair4 = new Pair(3,0);

	Pair[] pairArray1 = {pair1, pair2, pair3, pair4};
	Pair[] pairArray2 = {pair2, pair2};
	Pair[] pairArray3 = {pair3};
	Pair[] pairArray4 = {};

	int[] expected1 = {0, 1, 2, 3};
	int[] expected2 = {1, 1};
	int[] expected3 = {2};
	int[] expected4 = {};

	void testGetAs(Tester t)
	{
		t.checkExpect(PairSelect.getAs(pairArray1), expected1);
		t.checkExpect(PairSelect.getAs(pairArray2), expected2);
		t.checkExpect(PairSelect.getAs(pairArray3), expected3);
		t.checkExpect(PairSelect.getAs(pairArray4), expected4);
	}
}
