print("202302547_나소진")

st1 = 'LOVE*'

for i in range(len(st1)*2) : 
     st2 = st1[i%len(st1):] + st1[:i%len(st1)]
     print('')
     for j in range(len(st1)) : 
          print('%s ' %st2[j], end="")