import random

print("202302547 나소진")

user = int(input("가위 0, 바위 1, 보 2 선택 : "))
com = random.randrange(0, 3)

print("user = %d, com = %d" % (user,com))

if  user == com:
    print("비겼음")
elif (user == 1 and com == 0) or (user == 2 and com == 1) or (user == 0 and com == 2):
    print("user 승")
else :
    print("com 승")