package var2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The class conteins methods which perform operations with numbers necessary
 * for the task
 **/

public class NumbersMethods {

	public static Integer[] findEvenNumber(Integer[] num) {
		Integer[] res = new Integer[25];
		int ind = 0;
		for (Integer x : num) {
			if (x % 2 == 0)
				res[ind] = x;
			ind++;
		}
		return res;
	}

	public static Integer[] findOddNumber(Integer[] num) {
		Integer[] res = new Integer[25];
		int ind = 0;
		for (int x : num) {
			if (x % 2 != 0)
				res[ind] = x;
			ind++;
		}
		return res;
	}

	public static int findMaxNumber(Integer[] num) {
		int max = -100000;
		for (int x : num) {
			if (max < x)
				max = x;
		}
		return max;
	}

	public static int findMinNumber(Integer[] num) {
		int min = 100000;
		for (int x : num) {
			if (min > x)
				min = x;
		}
		return min;
	}

	public static Integer[] findDividedThreeAndNineNumber(Integer[] num) {
		Integer[] res = new Integer[25];
		int ind = 0;
		for (int x : num) {
			if ((x % 3 == 0) || (x % 9 == 0))
				res[ind] = x;
			ind++;
		}
		return res;
	}

	public static Integer[] findDividedFiveAndSevenNumber(Integer[] num) {
		Integer[] res = new Integer[25];
		int ind = 0;
		for (int x : num) {
			if ((x % 5 == 0) || (x % 7 == 0))
				res[ind] = x;
			ind++;
		}
		return res;
	}

	public static void bubbleSort(Integer[] num) {
		boolean isSorted = false;
		int buf = 0;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < num.length - 1; i++) {
				if (Math.abs(num[i]) < Math.abs(num[i + 1])) {
					isSorted = false;
					buf = num[i];
					num[i] = num[i + 1];
					num[i + 1] = buf;
				}
			}
		}
	}

	public static Integer[] findThreeDigitNumbersUnikElem(Integer[] num) {
		Integer[] res = new Integer[25];
		int ind = 0;
		for (int x : num) {
			if (Math.abs(x) >= 100 && Math.abs(x) <= 999) {
				String s = String.valueOf(x);
				if (s.charAt(0) != s.charAt(1) && s.charAt(0) != s.charAt(2) && s.charAt(1) != s.charAt(2))
					res[ind] = x;
				ind++;
			}
		}
		return res;
	}

	private static long findGCD(long a, long b) {
		while (b > 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static long findGCD(Integer[] nums) {
		long res = nums[0];
		for (int i = 1; i < nums.length; i++)
			res = findGCD(res, nums[i]);
		return res;
	}

	private static long findLCM(long a, long b) {
		return a * (b / (findGCD(a, b)));
	}

	public static long findLCM(Integer[] nums) {
		long res = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if ((nums[i] == 0 || nums[0] == 0) || (nums[i] < 0 || nums[0] < 0)) {
				break;
			}
			res = findLCM(res, nums[i]);
		}
		return res;
	}

	private static boolean isPrimeNum(int n) {
		boolean prime = true;
		for (long i = 3; i <= Math.sqrt(n); i += 2) {
			if (n <= 1)
				return false;
			if (n == 2)
				return true;
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		return ((n % 2 != 0) && prime && n > 2) || n == 2;
	}

	public static Integer[] findPrimeNumbers(Integer[] nums) {
		Integer[] res = new Integer[25];
		int ind = 0;
		for (Integer x : nums) {
			if (isPrimeNum(x)) {
				res[ind] = x;
				ind++;
			}
		}
		return res;
	}

	public static void sortAscNum(Integer[] nums) {
		Arrays.sort(nums);
	}

	public static void sortWanNum(Integer[] nums) {
		Arrays.sort(nums, Collections.reverseOrder());
	}

	public static Integer[] sortFreqNumbers(Integer[] nums) {
		List<Integer> alist = (List<Integer>) Arrays.asList(nums);
		Collections.sort(alist, new Comparator<Integer>() {
			public int compare(Integer ln, Integer rn) {
				int compareFreq = Collections.frequency(alist, rn) - Collections.frequency(alist, ln);
				return compareFreq != 0 ? compareFreq : rn - ln;
			}
		});
		return (Integer[]) alist.toArray();
	}

	public static Integer[] findHappyNumbers(Integer[] nums) {
		Integer[] res = new Integer[25];
		int ind = 0;
		for (Integer x : nums) {
			int n1 = x % 10;
			int n2 = (x / 10) % 10;
			int n3 = (x / 100) % 10;
			int n4 = (x / 1000) % 10;
			if ((n1 + n2) == (n3 + n4)) {
				res[ind] = x;
				ind++;
			}
		}
		return res;
	}

	public static Integer[] findFibonacciNumbers(Integer[] nums) {
		Integer[] res = new Integer[25];
		int ind = 0;
		for (int i = 0; i <= nums.length - 3; i++) {
			if (nums.length < 3)
				break;
			else if (nums[i + 2] == nums[i] + nums[i + 1]) {
				if (ind != 0 && (nums[i] == res[ind - 2]) && (nums[i + 1] == res[ind - 1])) {
					res[ind] = nums[i + 2];
					ind++;
				} else {
					res[ind] = nums[i];
					ind++;
					res[ind] = nums[i + 1];
					ind++;
					res[ind] = nums[i + 2];
					ind++;
				}
			}
		}
		return res;
	}

	public static Integer[] findPalindromNumbers(Integer[] nums) {
		Integer[] res = new Integer[25];
		int ind = 0;
		for (Integer x : nums) {
			StringBuilder s = new StringBuilder(x.toString());
			if (s.toString().equals(s.reverse().toString())) {
				res[ind] = x;
				ind++;
			}
		}
		return res;
	}

	public static Integer[] findHalfSumNumbers(Integer[] nums) {
		Integer[] halfSum = new Integer[25];
		int ind = 0;
		for (int i = 1; i <= nums.length - 2; i++) {
			if (nums.length < 3)
				break;
			if (nums[i] == (nums[i - 1] + nums[i + 1]) / 2) {
				halfSum[ind] = nums[i];
				ind++;
			}
		}
		return halfSum;
	}

	public static void findPeriodForTwoFirstPositiveNumbersInARow(
			// Algorithm @author is RodionGork
			Integer[] sourceNumbers) {
		long p, q, r, l, t, i;
		for (int n = 0; n < sourceNumbers.length - 1; n++) {
			if (sourceNumbers.length < 2) {
				break;
			} else if (sourceNumbers[n] >= 0 && sourceNumbers[n + 1] >= 0) {
				p = sourceNumbers[n];
				q = sourceNumbers[n + 1];
				r = p;
				for (i = 0; i < q; i++) {
					r = (r * 10) % q;
				}
				t = r;
				l = 0;
				do {
					r = (r * 10) % q;
					l++;
				} while (r != t);
				t = r = p;
				System.out.print("0.");
				for (i = 0; i < l; i++) {
					r = (r * 10) % q;
				}
				for (i = 0; r != t; i++) {
					System.out.print(t * 10 / q);
					r = (r * 10) % q;
					t = (t * 10) % q;
				}
				System.out.print('(');
				for (i = 0; i < l; i++) {
					System.out.print(t * 10 / q);
					t = (t * 10) % q;
				}
				System.out.println(')' + " = " + p + "/" + q);
				break;
			}
		}
	}

	public static void rectPascalNumber(Integer[] nums) {
		for (Integer x : nums) {
			if (x >= 0) {
				final int fp = x;
				for (int i = 0; i <= 10; i++) {
					int y = fp;
					for (int j = 0; j <= 10 - i; j++) {
						System.out.print(" ");
					}
					for (int k = 0; k <= i; k++) {
						System.out.print(" " + y + " ");
						y = y * (i - k) / (k + 1);
					}
					System.out.println();
				}
			}
			break;
		}
	}

	public static void showResult(Integer[] nums) {
		for (Integer x : nums) {
			if (x != null)
				System.out.print(x + "; ");
		}
	}

	public static void showResult(long num) {
		System.out.print(num);
	}

}
