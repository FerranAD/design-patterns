<h1 align="center">
  Design Patterns 📚 
</h1>

Here's a collection of design patterns that I've implemented following the [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/9781492077992/) book. My goal for this repo is to have a brief pattern catalog that I can refer to when needed.

Ilustrations are from the [Refactoring Guru](https://refactoring.guru/design-patterns/catalog)

## Table of contents

- [Creational patterns](##Creational)
- [Structural patterns](##Structural)
- [Behavioral patterns](##Behavioral)


## Creational 🔨

_Creational patterns provide object creation mechanisms that increase flexibility and reuse of existing code._

### Factory method

The Factory Method pattern defines an interface
for creating an object, but lets subclasses decide which
class to instantiate. Factory Method __lets a class defer
instantiation to subclasses__.

<h5 align = center> <img align="center" src="/img/uml-factory-method.png" height="50%" width="50%"/> </h5>

By replacing `new Product()` with a call to `createProduct()`, the (abstract) superclass can operate with the object to be created. Only when a subclass is instantiated, some kind of concrete product will be actually created.

### Abstract factory

The Abstract Factory pattern provides an interface
for __creating families of related or dependent objects__
without specifying their concrete classes.

<h5 align = center> <img align="center" src="/img/uml-abstract-factory.png" height="50%" width="50%"/> </h5>

Abstract factories are usually formed by a set of factory methods. By returning the abstract type of the concrete products, they decouple the client from concrete product implementations.

### Singleton

The Singleton pattern lets you ensure that a class has only one instance, while providing a global access point to this instance. We can achieve that just by making the class constructor private, and adding a static method to get the unique instance (adding locks would be necessary if concurrency can happen).

Singletons __can often lead to bad designs__ if used improperly, they are hard to test and can be problematic on multithreaded environments. So they really must be used only when needed (to access a database for example).

### Builder

The Builder pattern lets you __construct complex objects step by step__. The pattern allows you to produce different types and representations of an object using the same construction code.

<h5 align = center> <img align="center" src="/img/uml-builder.png" height="50%" width="50%"/> </h5>

It's also useful for avoiding giant constructors and creating complex objects.

## Structural 🏗️

_Structural patterns explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient._

### Facade

By __defining a higher-level interface__, the Facade pattern provides easier access to a particular part of the subsystem’s functionality. It knows where to direct the client’s request. 

<h5 align = center> <img align="center" src="/img/uml-facade.png" height="50%" width="50%"/> </h5>

**Avoid creating a god object**. If needed, additional facades can be made either to be used independently or to be composed with a higher-level facade (so the latter can maintain cohesiveness).

### Adapter

The Adapter Pattern converts the interface of a class
into another interface the clients expect. It lets
classes work together that couldn’t otherwise because of
incompatible interfaces.

<h5 align = center> <img align="center" src="/img/uml-adapter.png" height="50%" width="50%"/> </h5>

Notice that Facade defines a new interface for existing objects, whereas Adapter tries to make the existing interface usable. Adapter usually wraps just one object, while Facade works with an entire subsystem of objects.

## Behavioral 🗣️

_Behavioral patterns take care of effective communication and the assignment of responsibilities between objects._