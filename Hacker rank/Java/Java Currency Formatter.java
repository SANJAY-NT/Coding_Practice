Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where  is  formatted according to the appropriate Locale's currency.

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

Input Format

A single double-precision number denoting .

Constraints

Output Format

On the first line, print US: u where  is  formatted for US currency.
On the second line, print India: i where  is  formatted for Indian currency.
On the third line, print China: c where  is  formatted for Chinese currency.
On the fourth line, print France: f, where  is  formatted for French currency.

Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
Explanation

Each line contains the value of  formatted according to the four countries' respective currencies.

Language
Java 7

More
12345678910111213141516171819202122232425262728293031
import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
…}
Line: 31 Col: 2

Submit Code

Run Code

Upload Code as File

Test against custom input
Java
You have earned 15.00 points!
You are now 97 points away from the gold level for your java badge.
3%153/250
Congratulations
Share on FacebookShare on TwitterShare on LinkedIn
You solved this challenge. Would you like to challenge your friends?
Next Challenge
Earn a certificate in Java
Kudos on your progress! Take the HackerRank Skills Certification test and enrich your profile

Get Certified

Test case 0

Test case 1

Test case 2

Test case 3

Test case 4

Test case 5

Test case 6

Test case 7
Compiler Message
Success
Input (stdin)

Download
12324.134
Expected Output

Download
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
_____________________________________________________________________________________
  import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        
        // Write your code here.
        Locale indiaLocale = new Locale("en", "IN");

        /* Create NumberFormats using Locales */
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /* Print output */        
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
        // System.out.println("US: " + us);
        // System.out.println("India: " + india);
        // System.out.println("China: " + china);
        // System.out.println("France: " + france);
    }
}
