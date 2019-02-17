# Online shopping cart

[![Build Status](https://travis-ci.com/rowland007/Online-shopping-cart.svg?branch=master)](https://travis-ci.com/rowland007/Online-shopping-cart)
[![CodeFactor](https://www.codefactor.io/repository/github/rowland007/online-shopping-cart/badge)](https://www.codefactor.io/repository/github/rowland007/online-shopping-cart)

Create a program using classes that does the following:

(1) Create two files to submit:

- ItemToPurchase.java - Class definition
- ShoppingCartPrinter.java - Contains main() method

Build the ItemToPurchase class with the following specifications:

- Private fields
- String itemName - Initialized in default constructor to "none"
- int itemPrice - Initialized in default constructor to 0
- int itemQuantity - Initialized in default constructor to 0
- Default constructor
- Public member methods (mutators & accessors)
- setName() & getName() (2 pts)
- setPrice() & getPrice() (2 pts)
- setQuantity() & getQuantity() (2 pts)

(2) In main(), prompt the user for two items and create two objects of the ItemToPurchase class. Before prompting for the second item, call **scnr.nextLine();** to allow the user to input a new string. (2 pts)

Ex:

```
Item 1
Enter the item name: Chocolate Chips
Enter the item price: 3
Enter the item quantity: 1

Item 2
Enter the item name: Bottled Water
Enter the item price: 1
Enter the item quantity: 10
```

(3) Add the costs of the two items together and output the total cost. (2 pts)

Ex:

```
TOTAL COST
Chocolate Chips 1 @ $3 = $3
Bottled Water 10 @ $1 = $10

Total: $13
```