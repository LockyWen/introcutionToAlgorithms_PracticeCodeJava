# introcutionToAlgorithms_PracticeCodeJava
This code is a practice code for my study of Introduction To Algorithm. Only for study. 

==================== 2020.06.22 =====================

Goal: Chapter 1 and Chapter 2

Chapter 1 and 2:

`Definitions`

An algorithm is any well-defined computational procedure that takes some value, or set of values, as input and procedures some value, or set of values, as output. 

An instance of a problem consists of the input (satisfying the representation invariant) needed to compute a solution to the problem. 

An algorithm is said to be correct if for every input instance, it halts with the correct output. 

Incorrect algorithms can sometimes be useful, if we can control their error rate. 

A subsequence of X is just X with some (or possibly all or none) of its elements removed. 

The convex hull is the smallest convex polygon containing the points

A data structure is a way to store and organize data in order to facilitate access and modification. 

Defferent algorithms devised to solve the same problem often differ dramatically in their efficiency. 

The numbers that we wish to sort are also known as the keys. 

``Loop Explanation``

Insertion sort:

To prove the correctness of the algorithm, we must follow the loop invariant: 

At the start of each iteration of the for loop, the subarray A[1...j -1] consists of the elements originally in A[1, ..., j -1] but in sorted order. 

Initialization: It is true prior to the first iteration of the loop. 

Maintenance: If it is true before an iteration of the loop, it remains true before the next iteration. 

Termination: When the loop terminates, the invariant gives us a useful property that helps show that the algorithm is correct.

 

============================================================

6.24 
Goal: Chapter 2.1 

Insertion Sort Proof:

`Pseudocode:`

    for j =2 to A.length                                             # 1
        key = A[j]                                                   # 2
        // Insert A[j] into the sorted sequence A[1 ... j -1]        # 3
        i = j-1                                                      # 4
        while i >= 0 and A[i] > key                                   # 5
            A[i + 1] = A[i]                                          # 6
            i = i - 1                                                # 7
        A[i + 1] = key                                               # 8
 
Initialization: 
We start by showing that the loop invariants holds before the first loop iteration, when j=2. The subarray A[1, ..., j - 1], therefore, consists of just single element A[1], which is in fact the original element in A[1]. Moreover, the subarray is sorted, which shows that the loop invariant holds prior to the first iteration of the loop.

Maintenance: Next, we tackle the second property: showing that each iteration maintains the loop invariant. Informally, the body of the for loop works by moving A[j -1], A[j -2], A[j -3], and so on by one position to the right until it finds the proper position for A[j].       

The subarray A[1...j] then consists of the elements originally in A[1...j], but in sorted order. Incrementing j for the next iteration of the for loop then preserves the loop invariant. 

Termination: The condition causing the for loop to terminate is that j > A.length = n. Because each loop iteration increases j by 1, we must have 
j = n + 1 at that time. Substituting n + 1 for j in the wording of loop invariant, we have that the subarray A[1 ...n] consists of the elements originally in A[1...n], but in sorted order. Observing that the subarray A[1...n] is the entire way, we conclude that the entire array is sorted. Hence, the algorithm is correct. 

`Pseudocode conventions:`

Indentation indicates block structure 

While, for and repeated-until and the if-else conditional construct have interpretations similar to Python

// indicates that the remainder of the line is a comment

i = j = e means i = e; j = e;

Local variables without explicit indication

Question 2.1 - 1 Illustrate the operation of Insertion-Sort on the array A = <31, 41, 59, 26, 41, 58> \
    Solution: 31 --> 41 --> 59 --> 26 --> 41 --> 58 \
              31 --> 41 --> 59 --> 26 --> 41 --> 58 \
              31 --> 41 --> 59 --> 26 --> 41 --> 58 \  
              26 --> 31 --> 41 --> 59 --> 41 --> 58 \
              26 --> 31 --> 41 --> 41 --> 59 --> 58 \
              26 --> 31 --> 41 --> 41 --> 58 --> 59 
             
             
Question 2.1 - 2 Rewrite the InsertionSort procedure to sort into nonincreasing instead of nondecreasing order \
    Solution: 

    for j =2 to A.length                                             # 1
        key = A[j]                                                   # 2
        // Insert A[j] into the sorted sequence A[1 ... j -1]        # 3
        i = j-1                                                      # 4
        while i >= 0 and A[i] < key                                   # 5
            A[i + 1] = A[i]                                          # 6
            i = i - 1                                                # 7
        A[i + 1] = key    
        
  Question 2.1 - 3 Consider the searching problem \
  Input: A sequence of n numbers A = <a_1, a_2, ..., a_n> and a value v\
  Output: An index i such that v = A[i] or the special value NIL if v does not appear in A \  
  Write the psudocode for linear search \
  
    for j = 0 to A.length
        if A[j] == v:
            return j;
    return NIl;
  
  Loop invariant: At a start of each iteration of the for loop, the subarray A[1,... j-1] consists of the elements != v. \
  Initialization: 
  We start by showing that the loop invariants holds before the 
  first loop iteration, when j=0. The subarray is empty, 
  therefore, consists of no elements == v, which shows that the loop 
  invariant holds prior to the first iteration of the loop.
  
  Maintenance: Next, we tackle the second property: showing that 
  each iteration maintains the loop invariant. Informally, the 
  body of the for loop works by moving A[0], ..., A[j - 1], 
  A[j -2], and so on by one position to the right until it 
  finds the proper position for A[j]. If not it continuous.        
  
  Termination: The condition causing the for loop to terminate is that j > A.length = n. If it reaches to the end then return NIL
  
Question 2.1 - 4 Consider the problem of adding two n-bit binary integers, sorted in two n-element arrays A and B.
    The sum of the two integers should be stored in binary form in an (n + 1)-element array C. State the problem formally and write pseudocode
    for adding two integers. (Look at LeetCode 002 )\
    
    
========================================================

Chapter 2.2 （Please refer to CSC165 Course Note)

=======================================================

Chapter 2.3 Designing algorithms \

` Definition`\
Incremental approach: Haveing sorted the subarray A[1...j-1], we inserted the single element A[j] 
into its proper place, yielding the sorted subarray A[1...j]. \

2.3.1 The divide-and-conquer approach \

`Definitions`

Recursive: To solve a given problem, an algorithm can call itself recursively one or more times to deal with closely related subproblems. \

Divide-and-conquer approach: break the problem into several subproblems that
are similar to the original problem but smaller in size, solve the subproblems
recursively, and then combine the solution to the original problem. 

`Proof of Merge Sort` (Please refer to the class Chapter2_gettingStart.MergeSort)

Initialization: Prior to the first iteration of the loop, we have k = p, so that the subarray A[p..k-1] is empty.
This empty subarray contains the k-p=0 smallest elements of L and R, and since i = j = 1, both
L[i] and R[j] are the smallest elements of their arrays that have not been copied back into A. 

Maintenance: 
Termination: ...



    