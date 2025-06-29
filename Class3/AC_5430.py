import sys
from collections import deque

input = lambda: sys.stdin.readline().rstrip()

T = int(input())

for _ in range(T):
    p = input()
    n = int(input())
    x = input()
    
    if n == 0:
        x_list = []
    else:
        x_list = list(map(int, x[1:-1].split(',')))
    
    q = deque(x_list)

    is_reverse = False
    is_error = False
    for func in p:
        if func == 'R':
            is_reverse = not is_reverse
        
        elif func == 'D':
            if len(q) == 0:
                is_error = True
                print('error')
                break
            if is_reverse:
                q.pop()
            else:
                q.popleft()

    if not is_error:
        if is_reverse:
            q.reverse()

        print('['+','.join(list(map(str, q)))+']')