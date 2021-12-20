# shoppingApp
## Description 
Write classes to model a shopping list. Make an Item class that represents a grocery item’s name and price, such as tissues for $3. Also implement an ItemOrder class that represents a shopper’s desire to purchase a given item in a given quantity, such as five boxes of tissues. You might wish to implement bulk-discounted items, such as two boxes of tissues for $4, which would bring the cost of the given item order of  boxes of tissues to  or  Lastly, implement a ShoppingCart class that stores ItemOrders in an ArrayList and allows item orders to be added to, removed from, or searched for in the cart. The cart should be able to report the total price of all item orders it currently carries.

In summary:

* Textbook ItemOrder will not be needed, because we can simply use Item, and just add (or remove) Item  Download Itemobjects in ArrayList
* With the simple change to "protected List" in the GroceryBill.java we can manipulate the ArrayList as needed.
* Search the ArrayList, managing size, super.add and remove become the major conceptual tasks in getting this project to work.
* Above specifications will impose good object-oriented programming (OOP) by using class methods to manipulate the object.

DiscountApp.java minimum specifications:

one data field (NO more, others inherited) | boolean for discount
--------------|--------------
two constructors | zero parameter and single parameter
add(Item, int) method	| int number of Item's now purchased, return true upon success
getTotal() method |	returns double, checks for discounts, cannot use super total
setDiscount(boolean) method	| simple one line of code, allows GUI App to work
toString() standard	| calls toString() for all Items in cart

In your solution, most coding is for add and getTotal, as they need to rework the List every time.
