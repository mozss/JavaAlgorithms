package com.mozss.basic.algorithms.sort.tjj;

public class CountSort {
    /*
     * 这就是计数排序的基本过程，它适用于一定范围的整数排序。在取值范围不是很大的情况下，它的性能在某些情况甚至快过那些O(nlogn)的排序，
     * 例如快速排序、归并排序。
     * */
    public static int[] countSort(int[] array) {
        //1.得到数列的最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        //2.根据数列的最大值确定统计数组的长度
        int[] coutArray = new int[max + 1];
        //3.遍历数列，填充统计数组
        for (int i = 0; i < array.length; i++)
            coutArray[array[i]]++;

        //4.遍历统计数组，输出结果
        int index = 0;
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < coutArray.length; i++) {
            for (int j = 0; j < coutArray[i]; j++) {
                sortedArray[index++] = i;
            }
        }
        return sortedArray;
    }

    /*
     * 不能只靠最大值来决定统计数组的长度，比如这个数列：95, 94, 91, 98, 99, 90, 99, 93, 91, 92。
     * 该数列最大值是99，但最小值是90，如果我们只以数列的最大值来决定统计数
     * 组的长度的话，就要创建长度为100的数组，那么就会浪费前面90个空间。 为了解决这个问题，我们不再以（输入数列的最大值+1）作为统计数
     * 组的长度，而是以（数列最大值和最小值的差+1）作为统计数组的长度。同时，数列的最小值作为一个偏移量，用于统计数组的对号入座。
     * 以刚才的数列为例，统计数组的长度为 99-90+1=10，偏移量等于数列最小值90。 对于第一个整数95，对应的统计数组下标为95-90=5。
     * 如果原始数列的规模是N，最大最小整数的差值是M，由于代码中第1、2、4步都涉及到遍历原始数列，运算量都是N，第3步遍历统计数列，运算量
     * 是M，所以总体运算量是3N+M，去掉系数，时间复杂度是O(N+M)。 至于空间复杂度，如果不考虑结果数组，只考虑统计数组的话，空间复杂度
     * 是O(M)。 虽然计数排序看上去很强大，但是它存在两大局限性： 1.当数列最大最小值差距过大时，并不适用于计数排序 比如给定20个随机整数，
     * 范围在0到1亿之间，此时如果使用计数排序的话，就需要创建长度为1亿的数组，不但严重浪费了空间，而且时间复杂度也随之升高。 2.当数列元素
     * 不是整数时，并不适用于计数排序 如果数列中的元素都是小数，比如3.1415，或是0.00000001这样子，则无法创建对应的统计数组，这样显然无法
     * 进行计数排序。 正是由于这两大局限性，才使得计数排序不像快速排序、归并排序那样被人们广泛适用。
     * * */
    public static int[] countSort_02(int[] array) {
        //1.得到数列的最大值与最小值，并算出差值d
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int d = max - min;
        //2.创建统计数组并计算统计对应元素个数
        int[] countArray = new int[d + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }
        //3.统计数组变形，后面的元素等于前面的元素之和
        int sum = 0;
        for (int i = 0; i < countArray.length; i++) {
            sum += countArray[i];
            countArray[i] = sum;
        }
        //4.倒序遍历原始数组，从统计数组找到正确位置，输出到结果数组
        int[] sortedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            sortedArray[countArray[array[i] - min] - 1] = array[i];
            countArray[array[i] - min]--;
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int a[] = {8, 2, 3, 4, 3, 6, 6, 3, 9};
        int b[] = {91, 92, 93, 94, 93, 96, 96, 93};
        a = CountSort.countSort(a);
        b = CountSort.countSort_02(b);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}

