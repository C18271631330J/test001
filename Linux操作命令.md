Linux操作命令：
linux系统中如何判断是否安装了mysql
1、数据库目录
　　/var/lib/mysql/

2、配置文件
　　/usr/share/mysql（mysql.server命令及配置文件）

3、相关命令
　　/usr/bin(mysqladmin mysqldump等命令)

4、启动脚本
　　/etc/rc.d/init.d/（启动脚本文件mysql的目录）

因此可通过如下方式查看：
1）查看安装目录，如上所示
2）查看服务是否启动：service mysql status
3）查看进程服务ps -aux | grep mysql
4）查看端口netstat -apn | grep 3306


linux系统中查找服务部署在哪个项目下：

 比如：  find / -name "SmsBoard-*.jar"
		 ps -ef|grep 

























