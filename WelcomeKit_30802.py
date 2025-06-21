N = int(input())
participant = list(map(int, input().split()))
T, P = map(int, input().split())

t_shirt = 0
for parti in participant:
    if parti % T > 0:
        t_shirt += (parti // T) + 1
    else:
        t_shirt += parti // T

pen_bundle = N // P
pen_individual = N % P

print(t_shirt)
print(pen_bundle, pen_individual)

