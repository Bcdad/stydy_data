import requests
# 代码获取cookie
headers = {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36'
}
url='https://www.zhihu.com/explore'
r1=requests.get(url)
r=requests.get(url,headers=headers)
cookie=r.cookies
cookiedir=requests.utils.dict_from_cookiejar(cookie)
print(cookiedir)
# print(r.text)
print(r1.text)