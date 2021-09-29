# Sorting (5/9)

## Bubble Sort (E)
**Date**: 07/30/21
**Time used**: 16:16
**Time complexity**: O(n^2 ), best case O(n)
**Space complexity**: O(1)
> Iterate through the array, compare two nodes next to each other, switch their positions if needed. Not replying on a helper array. Only change and return the original array.  

==**Important Notes**==:
* I forgot to ==consider special cases== (when the length of the array is 0 and 1).
* I forgot to use ==helper methods==.

## *Insertion Sort (E)*
**Date**: 07/30/21
**Time used**: 40:00~
**Time complexity**: O(n^2 ), best case O(n)
**Space complexity**: O(1)
> Iterate through the array, compare the element i with all nodes before it and insert it into the right position.

==**Important notes**==:
* Bad on trying to write a correct helper method: **Be careful on what parameters to take in!**
* Made things too complicated: tried to use recursion but it's apparently not a good idea.
* ==I need to organize my thoughts before start to write any code!==

## Selection Sort (E)
**Date**: 07/31/21
**Time used**: 16:04
**Time complexity**: O(n^2 ), best case O(n)
**Space complexity**: O(1)
> Iterate through the unsorted part of the list, find the smallest node, then insert it into the end of the sorted part of the list.

==**Important notes**==:
* Great job! Keep calm and analyze through the failed cases.

## Three Number Sort (M)
**Date**: 08/07/21
**Time used**: 45:00~
**Time complexity**: O(n)
**Space complexity**: O(1)
**Why it is hard**:
* We are only allowed to change the array itself. No extra space is permitted.
* Array is the same as String, we cannot change the array itself.

==**Important notes**==:
* I used the second method mentioned in the lecture, but I keep track of the first adn the second number to be sorted. It's easier than keep track of the first and third number.
* AGAIN, **don't start to coding before really clearly think about how to write your algorithm.**
* Tried the third (best) method mentioned in the video: it's harder than expected. Time used: 30:27.

## Quick Sort (H)
**Date**: 08/07/21
**Time used**: ~
**Time complexity**: Best - O(n log(n)), Average - O(n log(n)), Worse - O(n^2 )
**Space complexity**: O(log(n))
==**Important notes**==:
* There's still problems with writing recursions.
* Need to plan out before start writing the code (helper methods etc.)