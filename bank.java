class BankAccount:
    def __init__(self, name, balance):
        self.name = name
        self.balance = balance

    def display(self):
        print("Account Holder:", self.name)
        print("Balance:", self.balance)


a = BankAccount("Kavin", 15000)
a.display()
