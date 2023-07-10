print("202302547_나소진")
import random as r

def sadari(st) : 
    r.shuffle(sdr)
    for i in range(len(sdr)):
        print ("%d 번은 %s" % (i, sdr[i]))

if __name__ == '__main__':

    sdr = [0]
    sdr = input('사다리 타기 항목 입력: ').split()

    sadari(sdr)
        