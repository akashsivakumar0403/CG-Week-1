// Create SumOfDigit Class to compute the sum of 4 digits random number 
class SumOfDigits {
   // Get a 4 digit random number
   public int get4DigitRandomNumber() {
      return (int) (Math.random() * 9000) + 1000;
   }

   // Find the count of digits in the number
   public int countDigits(int number) {
      int count = 0, temp = number;
      while (temp > 0) {
         count++;
         temp /= 10;
      }
      return count;
   }

   // Store the digits of the number in an array
   public int[] getDigits(int number, int count) {
      int[] digits = new int[count];
      int temp = number;
      for (int i = count - 1; i >= 0; i--) {
         digits[i] = temp % 10;
         temp /= 10;
      }
      return digits;
   }
   // Find the sum of the elements in an array
   public int sumArray(int[] array) {
      int sum = 0;
      for (int i = 0; i < array.length; i++) {
         sum += array[i];
      }
      return sum;
   }

   public static void main(String[] args) {
      // Get 4 digit random integer number
      SumOfDigits sumOfDigits = new SumOfDigits();
      int number = sumOfDigits.get4DigitRandomNumber();
      System.out.println("The Random Mumber is: " + number);

      // Get the count of digits
      int count = sumOfDigits.countDigits(number);	
      System.out.println("The count of digit is: " + count);

      // Get the array of digits from the number
      int[] digits = sumOfDigits.getDigits(number, count);

      // Find the sum of the digits of the number
      int sum = sumOfDigits.sumArray(digits);

      // Display the sum of the digits of the number
      System.out.println("\nSum of Digits: " + sum);
   }
}
