package com.mozss.basic.algorithms.leetcode.hashmap;

/**
 * @author mozss
 * @create 2019-09-06 10:25
 */

public class No811 {
	/**
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * @题目名称:   811.子域名访问计数
	 * @知识考察:
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * @题目描述:   一个网站域名,比如"discuss.leetcode.com"包含多个子域名,作为顶级域名,常用的
	 *             有"com",下一级则有"leetcode.com",最低的一级为"discuss.leetcode.com",
	 *             当我们访问域名为"discuss.leetcode.com"时,也同时访问了父级域名"leetcode.com"
	 *             和"com"
	 *
	 *             给定一个带访问次数和域名的组合,要求分别计算每个域名被方法的次数,其格式为访问次数+空格+地址
	 *             例如:"9001 discuss.leetcode.com"
	 *             接下来会给一组访问次数和域名组合的列表cpdomains,要求解析出所有域名的访问次数,输出格式
	 *             和输入格式相同,不限定先后顺序.
	 *
	 *             注意事项:
	 *                  1.cpdomains的长度小于100
	 *                  2.每个域名的长度小于100
	 *                  3.每个域名地址包含一个或者两个"."符号
	 *                  4.输入中任何一个域名的访问次数到小于1000
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * eg 1>:
	 * @输入Input:    ["9001" discuss.leetcode.com"]
	 * @输出Output:   ["9001 discuss.leetcode.com","9001 leetcode.com","9001 com"]
	 * @说明:     例子中仅包含一个域名,"discuss.leetcod.com",按照前文的假设,子域名"leetcode.com"
	 *            和"com"都会被访问,所以它们的访问次数都是9001次.
	 *
	 * eg 2>:
	 * @输入Input:    ["900 google.mail.com","50 yahoo.com","1 intel.mail.com","5,wiki.org"}
	 * @输出Output:   ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org",
	 *                 "5 org","1 interl.mail.com","951 com"]
	 * @说明:
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * @解题思路:
	 * @题目总结:
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 **/
}
