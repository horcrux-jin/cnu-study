def palindrome(str, num):
    if str[num] == str[len(str)-1-num]:
        if num == len(str)-1-num:
            print('True')
        else:
            palindrome(str, num+1)
    else:
        print('False')
            
print("202302547_나소진")          
str = (input('단어를 입력하세요: '))      
palindrome(str, 0)           