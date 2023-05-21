# Binary Search Tree (BST) in Java

This is a simple implementation of a Binary Search Tree (BST) in Java. 
The BST is a data structure that allows efficient insertion, retrieval, and deletion of key-value pairs, where the keys are unique and can be compared.

## Features

- `put(key, value)`: Inserts a key-value pair into the BST.
- `get(key)`: Retrieves the value associated with a given key from the BST.
- `delete(key)`: Removes a key-value pair from the BST.
- `size()`: Returns the number of key-value pairs in the BST.

## Getting Started

To use the Binary Search Tree implementation in your Java project, follow these steps:

1. Clone the repository:

   ```bash
    you can clone https://github.com/NurluhanKakpan/JavaAss5.git

##Testing
 bst.put(5, "Value 5"); // Insert key-value pair (5, "Value 5")
        bst.put(2, "Value 2"); // Insert key-value pair (2, "Value 2")
        bst.put(7, "Value 7"); // Insert key-value pair (7, "Value 7")
        bst.put(1, "Value 1"); // Insert key-value pair (1, "Value 1")
        bst.put(4, "Value 4"); // Insert key-value pair (4, "Value 4")
        bst.put(6, "Value 6"); // Insert key-value pair (6, "Value 6")
        bst.put(9, "Value 9"); // Insert key-value pair (9, "Value 9")

        System.out.println("Value for key 4: " + bst.get(4)); // Retrieve value for key 4 and print

        bst.delete(2); // Delete key 2 from the tree

        System.out.println("Size of the tree: " + bst.size()); // Print the size of the tree

        System.out.println("Keys in ascending order:"); // Print the keys in ascending order
        for (Integer key : bst.iterator()) {
            System.out.println(key);
        }
