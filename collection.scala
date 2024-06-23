val items = Map("Pen" -> 20, "Pencil" -> 10, "Eraser" -> 7, "Book" -> 25, "Sheet" -> 15)

// i. Display item-name and quantity
items.foreach{ case (name, quantity) => println(s"Item: $name, Quantity: $quantity") }

// ii. Display sum of quantity and total number of items
val totalQuantity = items.values.sum
val totalItems = items.size
println(s"Total Quantity: $totalQuantity, Total Items: $totalItems")

// iii. Add 3 Books to the collection
val updatedItems = items.updated("Book", items("Book") + 3)
println(updatedItems)

// iv. Add new item “Board” with quantity 15 to the collection
val newItems = updatedItems + ("Board" -> 15)
println(newItems)
