import sys

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

    is_error = False
    for func in p:
        if func == 'R':
            x_list.reverse()
        
        elif func == 'D':
            if len(x_list) == 0:
                is_error = True
                print('error')
                break

            x_list.pop(0)
    if not is_error:
        print(x_list)