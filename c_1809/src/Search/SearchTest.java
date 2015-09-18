package Search;

import static org.junit.Assert.assertEquals;

/**
 * Created by katya on 15.18.9.
 */
public class SearchTest extends Search
{

	@org.junit.Test
	public void testBinarySearch_1() throws Exception
	{
		int x = 2;
		int[] a = new int[]{2, 2, 2, 2, 2, 2, 2};
		int correctResult = 0;

		int result = Search.find(x, a);
		assertEquals(correctResult, result);
	}

	@org.junit.Test
	public void testBinarySearch_2() throws Exception
	{
		int x = 2;
		int[] a = new int[]{1, 2, 3, 4, 5, 6};
		int correctResult = 1;

		int result = Search.find(x, a);
		assertEquals(correctResult, result);
	}

	@org.junit.Test
	public void testBinarySearch_3() throws Exception
	{
		int x = 2;
		int[] a = new int[]{1, 3, 3, 4, 5, 6};
		int correctResult = -1;

		int result = Search.find(x, a);
		assertEquals(correctResult, result);
	}

}