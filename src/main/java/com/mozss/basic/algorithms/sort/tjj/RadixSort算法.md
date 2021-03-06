- 基数排序：将整数按“位数”分割，然后按照“低位”到“高位”进行排序。是桶排序的扩展。
### 概要
##### 性质
- 不稳定
- 时间：O(n)
- 空间：O(1)

##### 算法思想
将整数按位数切割成不同的数字，然后按每个位数分别比较。

具体做法是：将所有待比较数值统一为同样的数位长度，数位较短的数前面补零。然后，从最低位开始，依次进行一次排序。这样从最低位排序一直到
最高位排序完成以后, 数列就变成一个有序序列。

### 解读
##### 简要思路
![KjYTa9.png](https://s2.ax1x.com/2019/11/03/KjYTa9.png)

![MmLeiV.png](https://s2.ax1x.com/2019/11/09/MmLeiV.png)
##### 算法图解
- 按照个位数进行排序。
- 按照十位数进行排序。
- 按照百位数进行排序。
### 实现

##### 实现方式1：数组

##### 实现方式2：链表


### 性能分析

##### 时间复杂度
##### 空间复杂度
##### 适用场景

### 算法应用例子
- 源码地址：

##### 例子1：
##### 例子2：
##### 例子3：
