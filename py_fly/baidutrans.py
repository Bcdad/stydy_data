from selenium import webdriver
from selenium.webdriver import ActionChains
import time
driver = webdriver.Chrome()
driver.get("https://fanyi.baidu.com/")
flag=True
while flag:
  word=input("请输入要翻译的单词:")
  if word=="":
    flag=False
    driver.quit()
  else:
    a=driver.find_element_by_xpath('//*[@id="baidu_translate_input"]')
    a.send_keys(word)
    time.sleep(2)
    b=driver.find_element_by_xpath('//*[@id="main-outer"]/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/p[2]')
    print(b.text)
    delete=driver.find_element_by_xpath('//*[@id="main-outer"]/div/div/div[1]/div[2]/div[1]/div[1]/div/div[3]/a')
    ActionChains(driver).click(delete).perform()