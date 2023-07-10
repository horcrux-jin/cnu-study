print("202302547 나소진")
a = int(input("인원 수: "))
b = a//4 + (a%4!=0)

print("\n주문 피자 개수 %d판" %b)
print("총 피자 가격 %d원" %(b*12000))