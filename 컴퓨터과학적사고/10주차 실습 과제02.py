print("202302547 나소진")

subj = {"김경미":["수학", "과학"], "최영희":["영어", "수학"],
        "강동원":"영어", "정필수":["사회", "역사"],
        "박희수":"국어", "이승철":["수학", "과학"]}

teacher = []

tc = (input('담당 교사명을 입력하시오: '))
print(subj[tc])

sj = (input('과목을 입력하시오: '))
for key, value in subj.items() :
    if sj in value :
        teacher.append(key)
        
print(teacher)