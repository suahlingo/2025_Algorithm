import sys

input = lambda: sys.stdin.readline().strip()

N = int(input())
reserved = [list(map(int, input().split(' '))) for _ in range(N)]
reserved.sort(key=lambda x: [x[1], x[0]])

num = 0
finised = 0
for i in reserved:
    if i[0] >= finised:
        num += 1
        finised = i[1]

print(num)