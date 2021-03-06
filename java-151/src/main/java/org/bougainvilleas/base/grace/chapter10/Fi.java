package org.bougainvilleas.base.grace.chapter10;

/**
 * 138.性能是个大“咕咚”
 *
 * 性能只是衡量系统的一个辅助指标，而不是主指标
 *
 * 某些Javaer一直在质疑Java系统的性能，
 * 于是我们自己也跟着怀疑Java的性能-----这就是发生在我们身边的真实“咕咚”，
 * Java系统的性能问题本就是子虚乌有的事情，是我们自己吓唬自己，其实，我们可以从四个方面分析该问题：
 * 1）没有慢的系统，只有不满足业务的系统
 *      不管是使用C开发还是Java开发的项目，最终都会有一个产品诞生，或服务于大众（如网站），或服务于企业（企业级应用），
 *      谁来决定一个系统的快慢呢？不是计算机，它只会使用毫秒、纳秒去记录时间但不会做判断，
 *      它可以计算出一个交易执行了多长时间，但它不能决定这个时间是长还是短，
 *      那谁去判断呢？是人，准确地说是使用者，
 *      即使是开发人员自己根据日志记录的时间来判断系统是慢了还是快了，那也还是以使用者的身份来判断的，
 *      对一个系统毫无了解的人员是无法判断出一个系统的快慢的
 *
 *      例如一个做统计的业务人员去看计费系统，即使响应需要N秒的时间，统计人员也会觉得非常快了，
 *      那是因为统计系统的结果经常是按照小时、天来计算的。
 *      再比如即时通信系统，有1秒内的延迟是可以接受的（发送者发出消息到接受者接收消息的时间间隔为1秒），
 *      但是语音通信系统若有1秒的延迟就是不可接受的了；
 *      发送邮件N分钟后才收到，这是可以容忍的，
 *      但是对于同城银行内转账来说，这个时间就是不可容忍的，必须在秒级完成。
 *      不同的系统所要求的性能不同，因此只要一个系统达到业务要求就可以认为它足够快，
 *      我们不要期望跨系统间的性能对比，这是毫无意义的
 *
 *      使用者告诉你，“这个系统太慢了”，也就是在间接地提醒您：系统没有满足业务需求，尚待继续努力
 * 2）没有慢的系统，只有架构不良的系统
 *      在做系统架构设计时，架构师有没有考虑并行计算？有没有考虑云计算技术？有没有负载均衡？……
 *      这些都是解决我们性能问题的良方，只要架构设计得当，效率就不是问题。
 *      即使是架构初期没有考虑扩展性，那我们也有一些手段可解决性能问题。
 *
 *      比如有一个批处理系统，系统建设时的目标是：5小时内生成2000万条业务数据，
 *      可到第3年的时候，公司发生了大规模的变化（整合了其他同类公司），
 *      需要处理的数据更多了，在5小时内需要生成8000万业务。于是就得考虑架构的扩展了。
 *      有一个很简单的处理方案，即应用服务器水平扩展，
 *      增加业务数据源的纵向切割能力，均分数据压力，这样就可以很轻松地实现大数量的生成。
 *
 *      再比如，一个新闻网站，刚开始上线时访问的人员不多，响应都是在毫秒级别的，
 *      随着访问量的激增，响应时间呈阶梯型增加，资深会员流失率翻倍跳跃，如何解决该问题呢？
 *      解决方案有两个：
 *      一是增加IP层的负载均衡，
 *          或者硬件设备，
 *          或者软件架构，
 *          把访问者分配到多个不同的应用服务器上、
 *          降低单台应用服务器的性能压力；
 *      二是增强系统的处理能力，增大吞吐量，
 *          比如提升数据源的响应能力，
 *          划分数据的热度（如把数据划分为Hot、Warm、Cold等区域，分配不同的硬件资源和服务等级），
 *      很多时候这两个方案配合起来使用，会很快解决性能问题
 * 3）没有慢的系统，只有懒惰的技术人员
 *      这里的技术人员涉及面很大，可以是开发人员，也可以是维护人员，甚至是应用软件的顾问人员（如数据库顾问、App Server的顾问）等。
 *      一个系统出现问题，
 *          或者是投产前后立刻出现的性能问题，
 *          或者是运行中突发的性能问题，
 *          或者是逐渐增长的数据（用户或业务数据）导致的性能问题，
 *      只要我们肯用心查找，并且拥有适当的资源（如源码和支持资源），一般都是可以解决的。
 *      最可怕的是我们的技术人员对性能问题漠不关心，对时间效率不够敏感，
 *      导致使用者怨声载道，三人成虎，最终致使此系统成为一个“慢得无法使用的系统”
 *
 *      这也要求我们在开发初期就适当考虑一下性能问题，
 *      但不要把性能排为头号任务，它只是我们的一个关注点而已。
 * 4）没有慢的系统，只有不愿意投入的系统
 *      这里的投入指的是资源，包括软硬件资源、人员资源及资金资源等，
 *      这不是项目组能够单独解决的问题，但是它会严重影响系统的性能。
 *      曾经作者遇到一个运行超过8年的分析系统，
 *      从1年前开始只要是高峰期它的速度就会慢下来，
 *      分析下来，发现是因为并发用户超过了许可的数量，造成系统阻塞，性能缓慢，
 *      唯一解决的法就是购买更多的许可数量，
 *      但是8年了，一个系统的生命期还能有多少呢？
 *      所以最后采用了自由放任的办法，让其自行走到寿命的终结点，然后建立新的分析系统。
 *
 *      当然，我们也会碰到查不出原因的性能问题，
 *      这不可否认，毕竟现在的系统越做越大，源代码动辄就十万、百万级别，
 *      让一个人或一个小团队将其彻头彻尾地查清楚也不现实，
 *      而且性能问题涉及面非常广，
 *      如操作系统、数据库、网络、存储等，要想对这些技术都非常熟悉也很困难，
 *      但查不出问题并不代表我们解决不了，
 *      是的，这与治疗癌症相似，我们现在的科学还不知道它的发病机理，不知道为什么会产生癌细胞，但我们知道割除病变部位能够避免癌细胞扩散，
 *      性能问题也一样：
 *          我们可能不知道问题产生的原因，但我们可以有N种手段来解决它。能够解决的问题还算是问题吗？
 *
 */
public class Fi {}