n = int(input())
nList = list(map(int,input().split(" ")))
sum = 0
maxScore = max(nList)
for i in range(n):
    sum += nList[i]/maxScore*100
print(sum/n)
