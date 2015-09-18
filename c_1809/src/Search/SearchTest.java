package Search;

import static org.junit.Assert.assertEquals;

/**
 * Created by katya on 15.18.9.
 */
public class SearchTest extends Search
{

	/**
	 * test if search return lowest index
	 *
	 * @throws Exception
	 */
	@org.junit.Test
	public void testBinarySearch_1() throws Exception
	{
		int x = 2;
		int[] a = new int[]{1, 2, 2, 2, 2, 2, 2, 2};
		int correctResult = 1;

		int result = Search.find(x, a);
		assertEquals(correctResult, result);
	}

	/**
	 * tests if returns correct index
	 * @throws Exception
	 */
	@org.junit.Test
	public void testBinarySearch_2() throws Exception
	{
		int x = 2;
		int[] a = new int[]{1, 2, 3, 4, 5, 6};
		int correctResult = 1;

		int result = Search.find(x, a);
		assertEquals(correctResult, result);
	}

	/**
	 * tests if return -1 in case if x not found
	 * @throws Exception
	 */
	@org.junit.Test
	public void testBinarySearch_3() throws Exception
	{
		int x = 2;
		int[] a = new int[]{1, 3, 3, 4, 5, 6};
		int correctResult = -1;

		int result = Search.find(x, a);
		assertEquals(correctResult, result);
	}

	/**
	 * tests if works with negative numbers
	 *
	 * @throws Exception
	 */
	@org.junit.Test
	public void testBinarySearch_4() throws Exception
	{
		int x = -3;
		int[] a = new int[]{-10, -6, -4, -3, -3, 2};
		int correctResult = 3;

		int result = Search.find(x, a);
		assertEquals(correctResult, result);
	}

}