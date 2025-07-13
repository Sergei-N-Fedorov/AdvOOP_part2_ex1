# AdvOOP_part2_ex1
Exercise 1 of Part 2 from Advanced course in OOP (Open university, UTU)
Exception processing

The program calculates the average of a non-empty integer array containing only non-negative numbers.

Exceptions are added for the following cases:
- the input array is null or empty;
- the input array contains negative values.
In the last case, the client catches the exception and gets all negative numbers from the array along with their indices. Then it prints this information.

In the normal case (the array is not empty and for all numbers x in it x >= 0), the program outputs the float value of the array's average.
