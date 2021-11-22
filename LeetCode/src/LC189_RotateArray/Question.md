# LC#189 - Rotate Array

**原題說明**

Given an array, rotate the array to the right by `k` steps, where `k` is non-negative.

**Example 1:**

```
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
```

**Example 2:**

```
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
```



**Sol.**

* don't use swap, it's too slow
* use `System.arraycopy(來源陣列, 開始擷取的第一個位置 , 新陣列, 開始放置的第一個位置, 要擷取的長度);`

![image-20211122182337369](C:\Users\USER\AppData\Roaming\Typora\typora-user-images\image-20211122182337369.png)
