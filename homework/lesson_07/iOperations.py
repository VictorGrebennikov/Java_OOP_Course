from abc import ABC, abstractmethod


class Operation(ABC):
    @abstractmethod
    def sum(self):
        pass

    @abstractmethod
    def subtraction(self):
        pass

    @abstractmethod
    def multiply(self):
        pass

    @abstractmethod
    def devide(self):
        pass