from Operations import Operation


while True:
    num_1 = int(input("Input the first number: "))
    symbol = input("Input operation sign: ")
    num_2 = int(input("Input the second number: "))

    calc = Operation(num_1,num_2, symbol)
    print(calc.operation(symbol))
    print("Do you want continue? 'y' or 'n':")
    answer = input()
    if answer == "n":
        break