import sys

input = lambda: sys.stdin.readline().rstrip()

N = int(input())

dp = [0 for _ in range(N+1)]

for i in range(len(dp)-1, 0, -1):
    if i*3 <= len(dp)-1:
        dp[i] = min(dp[i*3], dp[i*2], dp[i+1]) + 1
    elif i*2 <= len(dp)-1:
        dp[i] = min(dp[i*2], dp[i+1]) + 1
    elif i+1 <= len(dp)-1:
        dp[i] = dp[i+1] + 1

print(dp[1])
