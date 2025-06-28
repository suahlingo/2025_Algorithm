import sys
import collections

input = lambda: sys.stdin.readline().rstrip()


M, N = map(int, input().split())

tomatos = []
for _ in range(N):
    tomatos.append(list(map(int, input().split())))

q = collections.deque()

for n in range(N):
    for m in range(M):
        if tomatos[n][m] == 1:
            q.append((n, m, 0))

print(q)

max_num = 0
dxdy = [(1, 0), (0, 1), (-1, 0), (0, -1)]
while q:
    print(tomatos)
    y, x, num = q.popleft()
    if num > max_num:
        max_num = num
    
    for dx, dy in dxdy:
        if y+dy < 0 or y+dy > N-1 or x+dx < 0 or x+dx > M-1:
            continue

        if tomatos[y+dy][x+dx] == 0:
            q.append((y+dy, x+dx, num+1))
            tomatos[y+dy][x+dx] = num + 1

all_ripe = True
for n in range(N):
    if not all_ripe:
        break
    for m in range(M):
        if tomatos[n][m] == 0:
            print(-1)
            all_ripe = False
            break

if all_ripe:
    result = max(map(max, tomatos))
    if result == 1:
        print(0)
    else:
        print(result)
