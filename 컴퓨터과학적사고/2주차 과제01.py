print("202302547 나소진")

price = int(input("기계 값: "))
used = int(input("사용 기간: "))

pay = price / 24
left = 24 - used

print("매달 내는 돈 = %.1f원" % pay)
print("남은 약정기간 = %d개월" % left)
print("위약금 = %.1f원" %(pay*left))