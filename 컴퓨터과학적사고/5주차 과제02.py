import random

print("202302547_나소진")

num = random.randrange(0, 21)
user = -1 #1과 20의 사이의 수가 아닌 수로 초기화


while user != num :
    
    user = int(input("1~20 사이의 수 입력 : "))
    
    if user > num :
        print("더 작은 수 입니다.")
    elif user < num : 
        print("더 큰 수입니다.")
    else :
        print("맞췄습니다.")

    