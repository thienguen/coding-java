// Thien Nguyen 4/4/2022
// Java program to print a given number in words. The
// program handles numbers from 0 to 9999
class number_in_word {

    public static void main(String[] args)
    {
        System.out.println();
        convert_to_words("9923".toCharArray());
        convert_to_words("523".toCharArray());
        convert_to_words("89".toCharArray());
        convert_to_words("8".toCharArray());
        convert_to_words("11".toCharArray());
        convert_to_words("20".toCharArray());
        convert_to_words("201".toCharArray());
        convert_to_words("5528".toCharArray());
        System.out.println();
        convert_to_words("12376".toCharArray());
        
        char[] a = new char[5];
        
        a[0] = '2';
        a[1] = '1';
        a[2] = '1';
        a[3] = '1';
        a[4] = '1';
    }

    // A function that prints
    // given number in words
    static void convert_to_words(char[] num)
    {
        // Get number of digits
        // in given number
        int size = num.length;

        // account for base cases.
        if (size == 0)  { System.out.println("empty string"); return; }
        if (size >  4)  { System.out.println("Length more than 4 is not supported"); return; }

        /* The first string is not used, it is to make
            array indexing simple */
        String[] single_digits = new String[] 
        {
            "zero", "one", "two",   "three", "four",
            "five", "six", "seven", "eight", "nine"
        };

        /* The first string is not used, it is to make
            array indexing simple */
        String[] two_digits = new String[] 
        {
            "",          "ten",      "eleven",  "twelve",
            "thirteen",  "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
        };

        /* The first two string are not used, they are to
         * make array indexing simple*/
        String[] tens_multiple = new String[] 
        {
            "",      "",      "twenty",  "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        String[] tens_power = new String[] { "hundred", "thousand" };

        /* Used for debugging purpose only */
        System.out.print(String.valueOf(num) + ": ");

        /* For single digit number */
        if (size == 1) { System.out.println(single_digits[num[0] - '0']); return; }

        /* Iterate while num is not '\0' */
        int n = 0;
        while (n < num.length) 
        {   /* Code path for first 2 digits */
            if (size >= 3) 
            {
                if (num[n] - '0' != 0) 
                {
                    System.out.print(single_digits[num[n] - '0'] + " ");
                    System.out.print(tens_power[size - 3] + " ");
                    // here size can be 3 or 4
                }
                --size;
            }
            else    /* Code path for last 2 digits */
            {
                /* Need to explicitly handle 10-19 */
                if (num[n] - '0' == 1)  { int sum = num[n] - '0' + num[n + 1] - '0'; System.out.println(two_digits[sum]); return; }

                /* Need to explicitly handle 20 */
                else if (num[n] - '0' == 2 && num[n + 1] - '0' == 0) { System.out.println("twenty"); return; }

                /* Rest of the two digit
                numbers i.e., 21 to 99 and 0-9*/
                else {
                    int i = (num[n] - '0');
                    // multiple of 10 from 21 to 99 (eg, 20, 30, 40, etc.)
                    if (i > 0) System.out.print(tens_multiple[i] + " ");
                    
                    // increment our index
                    ++n;

                    // take account for single digit
                    if (num[n] - '0' != 0) System.out.println(single_digits[num[n] - '0']);
                }
            }
            ++n;
        }
    }
}