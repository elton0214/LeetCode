# LC#20 - ValidParentheses

**原題說明**




**Example 1:**
```
Input: s = "()"
Output: true
```

**Example 2:**

```
Input: s = "()[]{}"
Output: true
```

**Example 3:**

```
Input: s = "(]"
Output: false
```

**Example 4:**

```
Input: s = "([)]"
Output: false
```

**Example 5:**

```
Input: s = "{[]}"
Output: true
```

**Constraints:**

- `s` consists of parentheses only `'()[]{}'`.

  

___

**Sol.**

* **用Stack** 

![image-20211104230707689](C:\Users\USER\AppData\Roaming\Typora\typora-user-images\image-20211104230707689.png)

___

**Faster Sol.**

* 用 **str.charAt(i)** 取代 **str.split("") + split[i]**

