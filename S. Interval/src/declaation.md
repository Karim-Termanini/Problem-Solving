S. Interval
time limit per test1 second
memory limit per test256 megabytes

Given a number X. Determine in which of the following intervals the number X belongs to:

[0,25], (25,50], (50,75], (75,100]

Note:

if X belongs to any of the above intervals print "Interval " followed by the interval.
if X does not belong to any of the above intervals print "Out of Intervals".
The symbol '(' represents greater than.
The symbol ')' represents smaller than.
The symbol '[' represents greater than or equal.
The symbol ']' represents smaller than or equal.
For example:

[0,25] indicates numbers between 0 and 25.0000, including both.

(25,50] indicates numbers greater than 25: (25.00001) up to 50.0000000.

Input
Only one line containing a number X ( - 1000 ≤ X ≤ 1000).

Output
Print the answer to the problem above.

Examples
input
25.1
output
Interval (25,50]

input
25.0
output
Interval [0,25]

input
100.0
output
Interval (75,100]

input
-25.2
output
Out of Intervals