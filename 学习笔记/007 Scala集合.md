
## Scala集合基本介绍

1. Scala同时支持不可变集合和可变集合，不可变集合可以安全的并发访问
2. 两个主要的包：
    1. 不可变集合：scala.collection.immutable
    2. 可变集合：scala.collection.mutable
3. Scala默认采用不可变集合，对于几乎所有的集合，Scala都同时提供了可变和不可变的版本
4. Scala的集合有三大类：序列Seq、集Set、映射Map，所有的集合都扩展自Iterable特质。


## 不可变集合




## 可变集合

1. 在可变集合中比不可变集合更加丰富。
2. 在Seq集合中，增加了Buffer集合，在实际开发中比较常用的是ArrayBuffer和ListBuffer。
3. 如果涉及到线程安全可以选择使用syn...开头的集合。


## List

1. List默认是不可变的集合
2. List在scala包对象声明的，因此不需要引入其它包也可以使用
3. val List = scala.collection.immutable.List
4. List中可以放任何数据类型
5. 如果希望得到一个空列表，可以使用Nil对象，在scala包对象声明的，因此不需要引入其它包也可以使用


## Map
1. Scala中不变的Map(scala.collection.immutable.Map)是有序的，可变的Map(scala.collection.mutable.Map)是无序的。
2. 不可变Map中的元素其实是Tuple2类型
