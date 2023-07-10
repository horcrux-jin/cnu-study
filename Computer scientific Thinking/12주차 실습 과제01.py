print("202302547_나소진")

def get_name(no, name, num) :
    n = len(no)
    for i in range(0, n) :
        if num == no[i] :
            return name[i]
    return "?"

sample_no = [99, 45, 88, 105]
sample_name = ["징징이", "스펀지밥", "뚱이", "다람이"]

print(get_name(sample_no, sample_name, 105))
print(get_name(sample_no, sample_name, 777))