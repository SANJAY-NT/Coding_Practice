Write a query identifying the type of each record in the TRIANGLES table using its three side lengths. Output one of the following statements for each record in the table:

Equilateral: It's a triangle with  sides of equal length.
Isosceles: It's a triangle with  sides of equal length.
Scalene: It's a triangle with  sides of differing lengths.
Not A Triangle: The given values of A, B, and C don't form a triangle.
Input Format

The TRIANGLES table is described as follows:



Each row in the table denotes the lengths of each of a triangle's three sides.

Sample Input



Sample Output

Isosceles
Equilateral
Scalene
Not A Triangle
Explanation

Values in the tuple  form an Isosceles triangle, because .
Values in the tuple  form an Equilateral triangle, because . Values in the tuple  form a Scalene triangle, because .
Values in the tuple  cannot form a triangle because the combined value of sides  and  is not larger than that of side .
________________________________________________________________________________
select case 
when A + B > C then case 
when A = B and B = C then 'Equilateral' 
when A = C or C = B or B=A then 'Isosceles' 
when A != B and B != C and A!= C then 'Scalene' 
END 
else 'Not A Triangle' 
end 
from triangles;
