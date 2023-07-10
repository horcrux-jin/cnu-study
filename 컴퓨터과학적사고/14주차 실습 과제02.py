print("202302547_나소진")

def cal(num):
    if(num == 1):
        print("%d" %num, end="")
    elif(num%2 == 0):
        print("%d -> " %num, end="")
        cal(num/2)
    elif(num%2 == 1):
        print("%d -> " %num, end="")
        cal(3*num+1)  

num = int(input())
cal(num)