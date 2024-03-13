import requests
from bs4 import BeautifulSoup
url='https://www.jxcbw.cn/newsContent?newsid=1716061542417559554'
headers={
    'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.111 Safari/537.36'
}
r=requests.get(url,headers=headers)
# print(r.text)
soup=BeautifulSoup(r.text)
# 返回标题
print(soup.title)
# 格式化
print(soup.prettify()) 
s=soup.find_all('a')
for s1 in s:
    print(s1.get('href'))

