## sample-tkmybatis-spring
> mybatis的Spring版本demo，增加了tkmybatis、generator插件，方便今后开发

#### 调试
> test目录下直接单元调试，测试运行，查看流程。

#### 配置
* 数据库结构：/doc目录下的sql文件
* 数据库连接信息：/jdbc.properties
* generator配置：/mybatis目录下generator*文件

#### generator从数据库生成class、mapper、xml
* 相关配置：generator.properties、generatorConfig.xml 对应配置
* 执行maven命令 mybatis-generator:generate -e

#### 相关文档
* [mybatis官方文档](http://www.mybatis.org/mybatis-3/)
* [tkmybatis文档](mapperhelper.github.io)


