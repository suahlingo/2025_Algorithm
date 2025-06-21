import sys

S = set()
input = lambda: sys.stdin.readline().rstrip()
M = int(input())
for m in range(M):
    command = input()
    if command == 'all':
        S = set([i for i in range(1, 21)])
    elif command == 'empty':
        S = set([])
    else:
        command, x = command.split()
        x = int(x)

        if command == 'add':
            S.add(x)

        elif command == 'remove':
            S.discard(x)

        elif command == 'check':
            if x in S:
                print(1)
            else:
                print(0)

        elif command == 'toggle':
            if x in S:
                S.remove(x)
            else:
                S.add(x)