import random

print("202302547_나소진")

userwin = 0
comwin = 0

for a in range(1,4,1) :
    com = random.randrange(0, 2)
    user = int(input("홀 0, 짝 1 입력 : "))

    if user == com :
        print("사용자 승\n")
        userwin = userwin + 1
    else :
        print("컴퓨터 승\n")
        comwin = comwin + 1
    a = a + 1
    
print("userwin = %d, comwin = %d" %(userwin,comwin))