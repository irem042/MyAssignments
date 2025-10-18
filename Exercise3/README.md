Description:
In this exercise, the goal is to modify the code from Exercise 1 to implement a Min Heap data structure instead of a Max Heap.  

Steps performed:
1. Created `MinHeapInterface.java` and `MinHeap.java` by modifying the method names and the content of the `add` and `reheap` methods from `MaxHeapInterface.java` and `MaxHeap.java`.
2. Adjusted the comparison operators in add and reheap methods to maintain the min heap property (parent node <= children nodes).
3. Modified `Test.java` as instructed to test the Min Heap operations.

Output:
```The heap is not empty; it contains 6 entries.
The smallest entry is 2


Removing entries in ascending order:
Removing 2
Removing 10
Removing 14
Removing 15
Removing 20
Removing 21
```

Notes:
- The exercise demonstrates how to transform a Max Heap implementation into a Min Heap.  
- The focus is on understanding how changing comparison operators affects heap behavior.
- All files are placed under the Exercise3 folder.
