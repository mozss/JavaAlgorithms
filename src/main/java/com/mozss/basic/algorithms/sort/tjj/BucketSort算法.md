- 桶排序：利用函数映射关系的排序方式，非比较型排序。
### 概要
##### 性质
- 稳定
- 时间：O(n+k)
- 空间：O(n+k)
##### 算法思想
将数分布到有限数量的桶中。
### 解读
##### 简要思路
把区间划分为n个大小的区间，这样的区间称为桶。将待排序的数分布到各个桶里面，然后依次将桶里面的数列出来。
##### 算法图解
![Mpt3Hf.png](https://s2.ax1x.com/2019/11/05/Mpt3Hf.png)
### 实现

##### 实现方式1：数组
```java
public class BucketSort {
 private static int[] bucketSort(int[] arr){

        // 计算最大值与最小值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        // 计算桶的数量
        int bucketNum = (max - min) / arr.length + 1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
        for(int i = 0; i < bucketNum; i++){
            bucketArr.add(new ArrayList<Integer>());
        }

        // 将每个元素放入桶
        for(int i = 0; i < arr.length; i++){
            int num = (arr[i] - min) / (arr.length);
            bucketArr.get(num).add(arr[i]);
        }
        // 对每个桶进行排序
        for(int i = 0; i < bucketArr.size(); i++){
            Collections.sort(bucketArr.get(i));
        }
        // 将桶中的元素赋值到原序列
        int index = 0;
        for(int i = 0; i < bucketArr.size(); i++){
            for(int j = 0; j < bucketArr.get(i).size(); j++){
                arr[index++] = bucketArr.get(i).get(j);
            }
        }
        return arr;
}
```
##### 实现方式2：链表
```java

```
### 性能分析
##### 时间复杂度
 eg：对大小为[1...100]范围内的n个整数A[1..n]排序。可以把桶设置为大小为10的范围，具体而言设集合B[1]存储[1..10]的整数，集合B[2]存储
 （10..20]的整数， i=1，2，，100.总共100个桶然后扫描A[i]，吧每个A[i]放入到对应的B[j]中。然后再对每个桶里的数字排序。 假设有n个数
 字，有m个桶，如果数字是平均分布的，则每个桶里面平均有n/m个数字。如果每个桶里中的数字采用快速排序，
 那么整个算法的复杂度是 O（n+m*n/m*log（n/m）） = O（n+nlogn-nlogm）.当m接近n时，桶排序复杂度接近O（n）。
 
对于待排序序列大小为 N，共分为 M 个桶，主要步骤有：
- N 次循环，将每个元素装入对应的桶中
- M 次循环，对每个桶中的数据进行排序（平均每个桶有 N/M 个元素）
 
 一般使用较为快速的排序算法，时间复杂度为 O(NlogN) 
 O(NlogN)，实际的桶排序过程是以链表形式插入的。
 整个桶排序的时间复杂度为：
 
 O(N)+O(M∗(N/M∗log(N/M)))=O(N∗(log(N/M)+1))
 
 O(N)+O(M∗(N/M∗log(N/M)))=O(N∗(log(N/M)+1))
 
 当 N = M 时，复杂度为 O(N)
##### 空间复杂度

##### 适用场景

### 算法应用例子
- 源码地址：
##### 例子1：
##### 例子2：
##### 例子3：
