import math
def solution(price):
    answer = 0
    s=0
    if 500000 <= price: 
        s=20
    elif 300000 <= price: 
        s=10
    elif 100000 <= price:
        s=5

    answer = price - price * (s / 100)

    return math.floor(answer)