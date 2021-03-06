package org.bougainvilleas.base.grace.chapter11;

/**
 * 143.可以选择多种Collections扩展
 * 为什么这么多的开源框架热衷于Collections的扩展呢？
 * 是因为程序（经典的定义：程序=算法+数据结构，想想看数据结构是为谁而服务的）主要处理的是一大批数据，
 * 而能容纳大量数据的也就是Collections类和数组了，
 * 但是数据的格式具有多样性，比如数据映射关系多样，数据类型多样等
 *
 * 1）fastutil
 *      fastutil（按照Java的拼写规则应该为FastUtil，但是官网就是这样命名的，我们尊重官方）是一个更新比较频繁的工具包
 *      主要提供了两种功能：
 *          一种是限定键值类型（Type Specific）的Map、List、Set等，
 *          另一种是大容量的集合
 *      大容量集合
 *          Collection的最大容量是Integer的最大值（2 147 483 647），不能超过这个容量，一旦我们需要把一组超大的数据放到集合中，就必须要考虑对此进行拆分了，这会导致程序的复杂性提高，
 *          而fastutil则提供了Big系列的集合，它的最大容量是Long的最大值，这已经是一个非常庞大的数字了，超过这个容量基本上是不可能的。
 *          但在使用它的时候需要考虑内存溢出的问题，
 *          注意调节Java的mx参数配置
 * 2）Trove
 *      Trove提供了一个快速、高效、低内存消耗的Collection集合，并且还提供了过滤和拦截的功能，同时还提供了基本类型的集合
 *      Trove的最大优势是在高性能上，
 *          在进行一般的增加、修改、删除操作时，Trove的响应时间比JDK的集合少一个数量级，
 *          比fastutil也会高很多，因此在高性能项目中要考虑使用Trove
 * 3）lambdaj
 *      lambdaj是一个纯净的集合操作工具，它不会提供任何的集合扩展，只会提供对集合的操作，
 *          比如查询、过滤、统一初始化等，特别是它的查询操作，非常类似于DBRMS上的SQL语句，
 *          而且也会提供诸如求和、求平均值等的方法
 *      lambdaj算是一个比较年轻的开源工具，但是它符合开发人员的习惯，
 *          对集合的操作提供了“One Line”式的解决方法，
 *          可以大大缩减代码的数量，而且也不会导致代码的可读性降低
 */
public class Fn {

}

