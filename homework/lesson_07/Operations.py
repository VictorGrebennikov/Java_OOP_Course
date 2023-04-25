from Calculator import Calculator


class Operation(Calculator):
    def __init__(self, num_1, second_number, symbol):
        self._num_1 = num_1
        self._num_2 = second_number
        self._symbol = symbol

    def operation(self, symbol):
        match symbol:
            case "+":
                return self.sum()
            case "-":
                return self.subtraction()
            case "*":
                return self.multiply()
            case "/":
                return self.devide()
            case _:
                print("Invalid operator")