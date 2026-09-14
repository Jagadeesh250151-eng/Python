class Laptop:
    def __init__(self, brand, ram, storage):
        self.brand = brand
        self.ram = ram
        self.storage = storage

    def display(self):
        print("Brand:", self.brand)
        print("RAM:", self.ram, "GB")
        print("Storage:", self.storage, "GB")


l = Laptop("HP", 8, 512)
l.display()
