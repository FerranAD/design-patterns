<h1 align="center">
  Design Patterns 📚 
</h1>

Here's a collection of design patterns that I've implemented following the [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/9781492077992/) book. My goal for this repo is to have a brief pattern catalog that I can refer to when needed.



## Creational 🔨

_Creational patterns provide object creation mechanisms that increase flexibility and reuse of existing code._

### Factory method

The Factory Method Pattern defines an interface
for creating an object, but lets subclasses decide which
class to instantiate. Factory Method __lets a class defer
instantiation to subclasses__.

<h2 align = center> <img align="center" src="/img/uml-factory-method.png" height="100%" width="100%"/> </h2>

By replacing `new Product()` with a call to `createProduct()`, the (abstract) superclass can operate with the object to be created. Only when a subclass is instantiated, some kind of concrete product will be actually created.

### Abstract factory

## Structural 🏗️

_Structural patterns explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient._

## Behavioral 🗣️

_Behavioral patterns take care of effective communication and the assignment of responsibilities between objects._