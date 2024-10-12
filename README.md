# GraalVM-Examples

尝试基于graalvm实现将springboot-helloworld项目编译为linux原生可执行文件并部署。

|         | CD     | starting | size  | MEM    |
| ------- | ------ | -------- | ----- | ------ |
| graalvm | 11m14s | 0.038s   | 83.1M | 26.6M  |
|         | 1m     | 2.88s    | 19.2M | 132.7M |

**优点**

启动时间极快；内存占用低；ubuntu镜像更小；

**缺点**

编译速度太慢，其中`Compiling methods`最耗时；而基本CD最耗时操作为复制编译结果而非编译本身；  
编译时内存占用过大；  
无法确定对使用反射/动态加载/动态代理等第三方库的支持情况；  
一旦程序无法运行，较难排查问题；  

**总结**

拆分的微服务如果不包含过多第三方依赖本身并不大，十几分钟的编译时间换仅快几秒的启动速度，是否值得？  
为了使用graalvm而修改代码/配置/依赖/版本等以支持graalvm的兼容性，是否值得？  
启动慢，内存占用大的是数据库；  
感觉graalvm更适合：技术架构成熟，频繁不更新，希望降低内存资源占用的服务。