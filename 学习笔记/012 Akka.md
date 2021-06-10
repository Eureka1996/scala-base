
1. Akka是编写并发程序的框架。
2. akka主要解决的问题是：可以轻松的写出高效稳定的并发程序，程序员不再过多的考虑线程、锁和资源竞争等细节。



Actor模型用于解决什么问题：
1. 处理并发问题的关键是要保证共享数据的一致性和正确性。但当我们对关键代码加入同步条件synchronized后，实际上大并发就会阻塞
在这段代码，对程序效率有很大影响。
2. Actor模型简化并发编程，提升程序 性能。Actor模型是一种处理并发问题的解决方案。



1. akka处理并发的方法基于actor模型
2. 在基于actor的系统里，所有的事物都是actor。就好像在面向对象设计里面所有的事物都是对象一样。
3. actor模型是作为一个并发模型设计和架构的。actor和actor之间只能通过消息通信。
4. actor模型是异步、非阻塞、高性能的事件驱动编程模型。

## Actor模型工作机制

1. ActorSystem创建Actor
2. ActorRef可以理解成是Actor的代理或者引用。消息是通过ActorRef来发送，而不能通过Actor发送消息，通过哪个ActorRef发消息，
就表示把该消息发给哪 个Actor。
3. 消息发送到Dispatcher Message(消息分发器)，它会将消息分发到对应的MailBox。Dispatcher Message可以理解成是一个线程池，MailBox
可以理解成是消息队列，可以缓冲多个消息，遵守FIFO。
4. Actor可以通过receive方法来获取消息，然后进行处理。

## Actor间传递消息机制
1. 每一个消息就是一个Message对象。Message继承了Runnable，因为Message就是线程类。
2. 程序员只需要编写Actor，其它的交给Actor模型完成即可。
3. A actor要给B actor发送消息，那么A actor要先拿到B actor的代理对象ActorRef才能发送消息。
