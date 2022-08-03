<h1 align="center">
  Design Patterns 📚 
</h1>

Here's a collection of design patterns that I've implemented following the [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/9781492077992/) book. My goal for this repo is to have a brief pattern catalog that I can refer to when needed.



## Creational 🔨

_Creational patterns provide object creation mechanisms that increase flexibility and reuse of existing code._

### Factory method

The Factory Method pattern defines an interface
for creating an object, but lets subclasses decide which
class to instantiate. Factory Method __lets a class defer
instantiation to subclasses__.

<h2 align = center> <img align="center" src="/img/uml-factory-method.png" height="50%" width="50%"/> </h2>

By replacing `new Product()` with a call to `createProduct()`, the (abstract) superclass can operate with the object to be created. Only when a subclass is instantiated, some kind of concrete product will be actually created.

### Abstract factory

The Abstract Factory pattern provides an interface
for creating families of related or dependent objects
without specifying their concrete classes.

<h2 align = center> <img align="center" src="/img/uml-abstract-factory.png" height="50%" width="50%"/> </h2>

Abstract factories are usually formed by a set of factory methods. By returning the abstract type of the concrete products, they decouple the client from concrete product implementations.

### Singleton

The Singleton pattern lets you ensure that a class has only one instance, while providing a global access point to this instance. We can achieve that just by making the class constructor private, and adding a static method to get the unique instance.

Singletons can often lead to bad designs if used improperly, they are hard to test and can be problematic on multithreaded environments. So they really must be used only when needed (to access a database for example).


## Structural 🏗️

_Structural patterns explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient._

## Behavioral 🗣️

_Behavioral patterns take care of effective communication and the assignment of responsibilities between objects._