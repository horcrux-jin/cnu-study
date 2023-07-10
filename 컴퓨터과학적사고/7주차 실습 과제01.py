print("202302547_나소진")

num = int(input("List element 개수 입력 : "))
NewList = []

for i in range(num) :
    print("%d 번째" % i)
    ele = int(input("추가할 element 입력 : "))
    NewList.insert(i,ele)

print(NewList)