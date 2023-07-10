print("202302547_나소진")

upp, low, dig, pct = 0, 0, 0, 0

pswd = (input('암호 입력: '))

alpCnt, digCnt, pctCnt = 0, 0, 0

for i in range(len(pswd)) : 
    alp = pswd[i].isalpha()
    dig = pswd[i].isdigit()
    pct = pswd[i].isalnum()
    
    if (alp==True) : alpCnt = alpCnt+1
    if (dig==True) : digCnt = digCnt+1
    if (pct==True) : pctCnt = pctCnt+1

if(alpCnt>0 and digCnt>0 and pctCnt!=len(pswd)) :
    print("사용 가능")
else : 
    print("불가능한 암호")