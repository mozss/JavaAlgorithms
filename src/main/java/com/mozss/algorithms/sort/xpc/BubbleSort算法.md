- 冒泡排序：从头到尾比较相邻的两个元素并交换，将最大（最小）元素上浮。
### 概要
##### 性质
- 稳定
- 时间：O(n<sup>2</sup>)
- 空间：O(1)
##### 算法思想
比较相邻的元素。
### 解读
##### 简要思路
- 比较并交换：从首元素开始，相邻元素比较，较小的元素置于前边
- 从首到尾：逐个进行“比较并交换”的过程，直到最后一个元素被比较，一趟冒泡的过程结束，最大的元素置于最尾端
- 重复以上步骤：待排序列变为N-1，需要比较N-1轮
##### 算法图解
![KjCeMD.png](https://s2.ax1x.com/2019/11/03/KjCeMD.png)
### 实现
##### 实现方式1：数组
``` java
public class BubbleSort {
    public static int[] sort(int[] array){
        //这里for循环表示总共需要比较多少轮
        for(int i = 1 ; i < array.length; i++){
            //设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            //这里for循环表示每轮比较参与的元素下标
            //对当前无序区间array[0......length-i]进行排序
            //j的范围很关键，这个范围是在逐步缩小的,因为每轮比较都会将最大的放在右边
            for(int j = 0 ; j < array.length-i ; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        return array; 
    }
}
```
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
