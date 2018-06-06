package var2;

/**
 * The task: Enter from the console n integers. On the console output:
 **/

public class RunNumbers {

	public static void main(String[] args) {

		Integer[] nums = new Integer[args.length];
		int index = 0;
		for (String x : args) {
			nums[index] = (Integer) Integer.parseInt(x);
			index++;
		}

		NumbersMethods.showResult(nums);

		// 1. Even and odd numbers.
		System.out.println("\nEven numbers: ");
		Integer[] evenNums = NumbersMethods.findEvenNumber(nums);
		NumbersMethods.showResult(evenNums);

		System.out.println("\nOdd numbers: ");
		Integer[] oddNums = NumbersMethods.findOddNumber(nums);
		NumbersMethods.showResult(oddNums);

		// 2. The largest and the smallest number.
		System.out.println("\nMax number: ");
		int max = NumbersMethods.findMaxNumber(nums);
		NumbersMethods.showResult(max);

		System.out.println("\nMin number:  ");
		int min = NumbersMethods.findMinNumber(nums);
		NumbersMethods.showResult(min);

		// 3. Numbers that are divisible by 3 or 9.
		System.out.println("\nDivided by 3 or 9: ");
		Integer[] div3 = NumbersMethods.findDividedThreeAndNineNumber(nums);
		NumbersMethods.showResult(div3);

		// 4. Numbers that are divided into 5 and 7.
		System.out.println("\nDivided by 5 or 7: ");
		Integer[] div5 = NumbersMethods.findDividedFiveAndSevenNumber(nums);
		NumbersMethods.showResult(div5);

		// 5. Elements arranged by bubble method in descending order.
		System.out.println("\nElements after bubble sorting: ");
		NumbersMethods.bubbleSort(nums);
		NumbersMethods.showResult(nums);

		// 6. All three-digit numbers, in the decimal notation of which there
		// are no identical digits.
		System.out.println("\nThree-digit numbers consist of unik elements: ");
		Integer[] elem = NumbersMethods.findThreeDigitNumbersUnikElem(nums);
		NumbersMethods.showResult(elem);

		// 7. The greatest common divisor and the least common multiple of these
		// numbers.
		System.out.println("\nGCD is: ");
		long gcd = NumbersMethods.findGCD(nums);
		NumbersMethods.showResult(gcd);

		System.out.println("\nLCM is: ");
		long lcm = NumbersMethods.findLCM(nums);
		NumbersMethods.showResult(lcm);

		// 8. Prime numbers
		System.out.println("\nPrime numbers: ");
		Integer[] prime = NumbersMethods.findPrimeNumbers(nums);
		NumbersMethods.showResult(prime);

		// 9. Sorted numbers in ascending and descending order ..
		System.out.println("\nIncreasing sorting: ");
		NumbersMethods.sortAscNum(nums);
		NumbersMethods.showResult(nums);

		System.out.println("\nDecreasing sorting: ");
		NumbersMethods.sortWanNum(nums);
		NumbersMethods.showResult(nums);

		// 10. Numbers in descending order of frequency of occurrence of
		// numbers.
		System.out.println("\nSorting of decreasing repeating numbers: ");
		Integer[] freq = NumbersMethods.sortFreqNumbers(nums);
		NumbersMethods.showResult(freq);

		// 11. Happy numbers
		System.out.println("\nHappy numbers: ");
		Integer[] huppy = NumbersMethods.findHappyNumbers(nums);
		NumbersMethods.showResult(huppy);

		// 12. Fibonacci numbers: f0 = f1 = 1, f (n) = f (n-1) + f (n-2).
		System.out.println("\nFibonacci numbers: ");
		Integer[] fib = NumbersMethods.findFibonacciNumbers(nums);
		NumbersMethods.showResult(fib);

		// 13. Number-palindromes, whose values in the forward and reverse order
		// are the same.
		System.out.println("\nPalindrom numbers: ");
		Integer[] pal = NumbersMethods.findPalindromNumbers(nums);
		NumbersMethods.showResult(pal);

		// 14. Elements that are equal to the half-sum of neighboring elements.
		System.out.println("\nNumbers equal half of neighbors' sum: ");
		Integer[] halfSum = NumbersMethods.findHalfSumNumbers(nums);
		NumbersMethods.showResult(halfSum);

		// 15. The period of the decimal fraction p = m / n for the first two
		// positive integer numbers n and m consecutive.
		System.out.println("\nThe period of division the first and the second positive integers: ");
		NumbersMethods.findPeriodForTwoFirstPositiveNumbersInARow(nums);

		// 16. Construct a Pascal triangle for the first positive number.
		System.out.println("\nThe Pascal rectangular for the first positive number: ");
		NumbersMethods.rectPascalNumber(nums);

	}
}
