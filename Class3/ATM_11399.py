import sys

input = lambda: sys.stdin.readline().rstrip()


N = int(input())

time_list = list(map(int, input().split(' ')))

time_list.sort()

total = 0
before = 0
for time in time_list:
    total += before + time
    before += time

print(total)