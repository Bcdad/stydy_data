# 导入requests模块
import requests
# 使用requests模块的get方法，获取图片的url
r=requests.get("https://ts1.cn.mm.bing.net/th/id/R-C.df4462fabf18edd07195679a5f8a37e5?rik=FnNvr9jWWjHCVQ&riu=http%3a%2f%2fseopic.699pic.com%2fphoto%2f50059%2f8720.jpg_wh1200.jpg&ehk=ofb4q76uCls2S07aIlc8%2bab3H5zwrmj%2bhqiZ%2fyw3Ghw%3d&risl=&pid=ImgRaw&r=0")
# 使用with open方法，以二进制写入的方式，将图片写入到phone.jpg文件中
with open('phone.jpg','wb') as f:
    f.write(r.content)
    print(r.content)