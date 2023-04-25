from iOperations import Operation


class Calculator(Operation):
    def __init__(self, num_1, num_2, symbol):
        self._num_1 = num_1
        self._num_2 = num_2
        self._symbol = symbol

    def sum(self):
        return self._num_1 + self._num_2

    def subtraction(self):
        return self._num_1 - self._num_2

    def multiply(self):
        return self._num_1 * self._num_2

    def devide(self):
        if self._num_2 != 0:
            return self._num_1 / self._num_2
        else:
            print("Error!")