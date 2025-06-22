import sys

input = lambda: sys.stdin.readline().rstrip()


N, M = map(int, input().split())

n_set = set()
m_set = set()
for n in range(N):
    n_set.add(input())
for m in range(M):
    m_set.add(input())

answer = n_set & m_set
answer = list(answer)
answer.sort()
print(len(answer))
for a in answer:
    print(a)
