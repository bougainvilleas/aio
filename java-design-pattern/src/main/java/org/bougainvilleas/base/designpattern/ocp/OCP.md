[toc]
# OCP
## Open Close Principle
- Software entities like classes,modules and functions should be open for extension but closed for modifications
## 开闭原则
- 一个软件实体如类、模块和函数应该对扩展开放，对修改关闭
- 一个软件实体应该通过扩展来实现变化，而不是通过修改已有的代码来实现变化
## 变化
- 逻辑变化
```text
只变化一个逻辑，而不涉及其他模块，
比如原有的一个算法是a*b+c，现在需要修改为a*b*c，可以通过修改原有类中的方法的方式来完成，
前提条件是所有依赖或关联类都按照相同的逻辑处理
```
- 子模块变化
```text
一个模块变化，会对其他的模块产生影响，特别是一个低层次的模块变化必然引起高层模块的变化，因此在通过扩展完成变化时，高层次的模块修改是必然的
```
- 可见视图变化
```text
可见视图是提供给客户使用的界面，如JSP程序、Swing界面等，
该部分的变化一般会引起连锁反应（特别是在国内做项目，做欧美的外包项目一般不会影响太大）。
如果仅仅是界面上按钮、文字的重新排布倒是简单，
最司空见惯的是业务耦合变化，
一个展示数据的列表，按照原有的需求是6列，突然有一天要增加1列，而且这一列要跨N张表，处理M个逻辑才能展现出来，这样的变化是比较恐怖的，
但还是可以通过扩展来完成变化，这就要看我们原有的设计是否灵活
```
# 注意
- 在设计时尽量适应这些变化，以提高项目的稳定性和灵活性，真正实现“拥抱变化”
- 开闭原则对扩展开放，对修改关闭，并不意味着不做任何修改，低层模块的变更，必然要有高层模块进行耦合，否则就是一个孤立无意义的代码片段
- 一个项目的基本路径应该是这样的：项目开发、重构、测试、投产、运维，其中的重构可以对原有的设计和代码进行修改，运维尽量减少对原有代码的修改，保持历史代码的纯洁性，提高系统的稳定性
## 重要性
- Single Responsibility Principle：单一职责原则
- Open Closed Principle：开闭原则
- Liskov Substitution Principle：里氏替换原则
- Law of Demeter：迪米特法则
- Interface Segregation Principle：接口隔离原则
- Dependence Inversion Principle：依赖倒置原则
- ocp是最基础的一个原则，其余是OCP的具体形态
- 开闭原则可以提高复用性
- 开闭原则可以提高可维护性
- 面向对象开发的要求
- 开闭原则对测试的影响
## 如何使用OCP
- 抽象约束
```text
抽象是对一组事物的通用描述，没有具体的实现，也就表示它可以有非常多的可能性，可以跟随需求的变化而变化。
因此，通过接口或抽象类可以约束一组可能变化的行为，并且能够实现对扩展开放，
其包含三层含义：
第一，通过接口或抽象类约束扩展，对扩展进行边界限定，不允许出现在接口或抽象类中不存在的public方法；
第二，参数类型、引用对象尽量使用接口或者抽象类，而不是实现类；
第三，抽象层尽量保持稳定，一旦确定即不允许修改
```
- 元数据（metadata）控制模块行为
```text
尽量使用元数据来控制程序的行为，减少重复开发
元数据：用来描述环境和数据的数据，通俗地说就是配置参数，参数可以从文件中获得，也可以从数据库中获得
```
- 制定项目章程
```text
约定优于配置
```
- 封装变化
```text
第一，将相同的变化封装到一个接口或抽象类中；
第二，将不同的变化封装到不同的接口或抽象类中，不应该有两个不同的变化出现在同一个接口或抽象类中。
封装变化，也就是受保护的变化（protected variations），
找出预计有变化或不稳定的点，
为这些变化点创建稳定的接口，准确地讲是封装可能发生的变化，
一旦预测到或“第六感”发觉有变化，就可以进行封装，
23个设计模式都是从各个不同的角度对变化进行封装的
```