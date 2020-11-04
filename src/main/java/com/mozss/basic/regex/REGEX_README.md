<br/>
<p align="center">
<img src="https://s1.ax1x.com/2020/05/09/Ylk8u8.png" alt="Ylk8u8.png" border="0" />
</p>
<br/>

# 正则表达式
## What？
 - 名称：Regular Expression，简regex，regexp，或RE。也称为**模式**。（下文为了方便使用简称Regex来表述）

- 起源：最初为20世纪四五十年代数学研究工作，之后引入计算机编辑器中，成为Unix或类Unix系统的工具，经过多年发展几乎所有的平台都支持regex，几乎所有的计算机语言都支持regex，但具体方式和支持程度略有差异。

- 简单认知：它是处理字符串（文本）相关问题的一个工具，解决搜索（匹配）和替换的问题。

## How？
Regex的语法简单，熟记语法无需耗费很多时间。但面对实际问题，快速写出简洁正确的Regex并非易事。

通常难点不是验证Regex能否匹配预期的结果，而是让Regex不匹配到不需要的内容。

这里提供一个学习Regex的网站： https://regex101.com/ 

## 初体验

### 例：1
```
目标文本
Whatever is worth doing is worth doing well.

正则表达式：
well
```
##### 结果(将匹配的内容用加粗斜体表示)
- Whatever is worth doing is ***worth*** doing well.


### 例：2
```
目标文本
Hi，mozss1024@gmail.com is my email address 

正则表达式
[\w.]+@[\w.]+\.\w+
```
##### 结果(将匹配的内容用加粗斜体表示)：
 Hi，***mozss1024@gmail.com*** is my email address.

# Regex语法
语法部分请阅读：

- [正则语法](/grammar/grammar.md)

- [正则元字符MetaCharacters](grammar/metacharacters.md)

# 快速参考
语法或元字符速查请阅读：
- [速查语法或元字符](/reference/manual.md)

常用例子速查请阅读：
- [速查常用正则表达式](/reference/examples.md)


# 练习实践
熟能生巧，巧能生妙：
- [练习网站](https://regex101.com/)
- [题目汇总](/quiz/exercises.md)

正则检查网站：


# 思路 