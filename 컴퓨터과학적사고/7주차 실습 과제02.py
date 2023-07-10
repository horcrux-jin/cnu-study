print("202302547_나소진")

mul = [10 * [0] for i in range(15)]

for i in range(15) :
    for j in range(10) :
        mul[i][j] = (i+2)*(j+1)
    print(mul[i])