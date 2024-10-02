num, big = input().split()
num = int(num)
big = int(big)

nums = list()
for i in range(0, num):
    numb = input().split()
    nums.append(numb)
    
for i in nums:
    print(i, end=' ')