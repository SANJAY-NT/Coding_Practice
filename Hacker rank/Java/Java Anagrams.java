Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Language
Java 7

More
1234567891011121314151617181920212223242526272829303132333435
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String s1, String s2) {
        // Complete the function
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        if(s1.length()==s2.length())

Line: 3 Col: 24

Submit Code

Run Code

Upload Code as File

Test against custom input
Java
You have earned 10.00 points!
You are now 87 points away from the gold level for your java badge.
13%163/250
Congratulations
You solved this challenge. Would you like to challenge your friends?Share on FacebookShare on TwitterShare on LinkedIn
Next Challenge

Test case 0

Test case 1

Test case 2

Test case 3

Test case 4

Test case 5

Test case 6

Test case 7

Test case 8

Test case 9

Test case 10

Test case 11

Test case 12

Test case 13

Test case 14

Test case 15

Test case 16
Compiler Message
Success
Input (stdin)

Download
anagram
margana
Expected Output

Download
Anagrams
Contest CalendarBlogScoring
  _________________________________________________________________________
  
  import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String s1, String s2) {
        // Complete the function
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        if(s1.length()==s2.length())

        {
            int[] a = new int[256];
            int[] b = new int[256];
            for (int i = 0; i < s1.length(); i++) {
                a[(int) s1.charAt(i)] += 1;
                b[(int) s2.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (a[i] != b[i])
                    return false;

            }
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
