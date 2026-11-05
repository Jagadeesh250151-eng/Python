class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None


def insert(root, data):
    if root is None:
        return Node(data)

    if data < root.data:
        root.left = insert(root.left, data)
    else:
        root.right = insert(root.right, data)

    return root


def search(root, key):
    if root is None:
        return False

    if root.data == key:
        return True

    if key < root.data:
        return search(root.left, key)

    return search(root.right, key)


def inorder(root):
    if root:
        inorder(root.left)
        print(root.data, end=" ")
        inorder(root.right)


root = None

values = [50, 30, 70, 20, 40, 60, 80]

for value in values:
    root = insert(root, value)

print("Inorder Traversal:")
inorder(root)

key = 60

print("\nSearching:", key)

if search(root, key):
    print("Element Found")
else:
    print("Element Not Found")
