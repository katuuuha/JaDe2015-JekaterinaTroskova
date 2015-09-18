package Search;

/**
 * Created by katya on 15.18.9.
 */
public class Search
{
	public static void main(String[] args)
	{
		int x = 11;
		int[] a = new int[]
				{
						1, 2, 5, 7, 9, 10, 11, 11, 11, 11, 34, 56, 77, 78, 88, 99
				};

		System.out.println(find(x, a));

	}

	/**
	 * Find the first occurrence of x in sorted array a.
	 *
	 * @param x value to find
	 * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
	 * @return lowest i such that a[i]==x, or -1 if x not found in a.
	 */
	public static int find(int x, int[] a)
	{
		return binarySearch(x, a, 0, a.length - 1);
	}

	/**
	 * @param x          value to find
	 * @param a          array
	 * @param startIndex begging of the range
	 * @param endIndex   end of the range
	 * @return x index in array
	 */
	public static int binarySearch(int x, int[] a, int startIndex, int endIndex)
	{
		if (startIndex > endIndex)
		{
			return -1;
		}

		int mid = (startIndex + endIndex) / 2;

		if (a[mid] == x)
		{
			return getLowestIndex(x,a,startIndex,mid);
		}
		else if (x > a[mid])
		{
			return binarySearch(x, a, mid + 1, endIndex);
		}
		else
		{
			return binarySearch(x, a, startIndex, mid - 1);
		}
	}

	/**
	 * Finds lowest index when value is found
	 *
	 * @param x          value to find
	 * @param a          array
	 * @param startIndex begging of the range
	 * @param endIndex   end of the range
	 */
	private static int getLowestIndex(int x, int[] a, int startIndex, int endIndex)
	{
		for (int i = endIndex; i >= startIndex; i--)
		{
			if (a[i] != x)
			{
				return i + 1;
			}
		}

		return startIndex;
	}
}
