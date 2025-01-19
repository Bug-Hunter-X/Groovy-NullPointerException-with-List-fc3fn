# Groovy NullPointerException with List

This example demonstrates a common error in Groovy: a `NullPointerException` occurring when a method that expects a `List` receives a `null` argument.

The issue arises because the `each` method on a `List` will throw an exception if the list itself is null.  The solution involves adding a null check before using the list.