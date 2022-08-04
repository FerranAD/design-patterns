<h1 align="center">
  Design Patterns 📚 
</h1>

Here's a collection of design patterns that I've implemented following the [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/9781492077992/) book. My goal for this repo is to have a brief pattern catalog that I can refer to when needed.

Ilustrations are from the [Refactoring Guru](https://refactoring.guru/design-patterns/catalog).

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

<h5 align = center> <img align="center" src="/img/uml-factory-method.png" height="70%" width="70%"/> </h5>

By replacing `new Product()` with a call to `createProduct()`, the (abstract) superclass can operate with the object to be created. Only when a subclass is instantiated, some kind of concrete product will be actually created.

### Abstract factory

The Abstract Factory pattern provides an interface
for __creating families of related or dependent objects__
without specifying their concrete classes.

<h5 align = center> <img align="center" src="/img/uml-abstract-factory.png" height="65%" width="65%"/> </h5>

Abstract factories are usually formed by a set of factory methods. By returning the abstract type of the concrete products, they decouple the client from concrete product implementations.

### Singleton

The Singleton pattern lets you ensure that a class has only one instance, while providing a global access point to this instance. We can achieve that just by making the class constructor private, and adding a static method to get the unique instance (adding locks would be necessary if concurrency can happen).

Singletons __can often lead to bad designs__ if used improperly, they are hard to test and can be problematic on multithreaded environments. So they really must be used only when needed (to access a database for example).

### Builder

The Builder pattern lets you __construct complex objects step by step__. The pattern allows you to produce different types and representations of an object using the same construction code.

<h5 align = center> <img align="center" src="/img/uml-builder.png" height="43%" width="43%"/> </h5>

It's also useful for avoiding giant constructors and creating complex objects.

## Structural 🏗️

_Structural patterns explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient._

### Facade

By __defining a higher-level interface__, the Facade pattern provides easier access to a particular part of the subsystem’s functionality. It knows where to direct the client’s request. 

<h5 align = center> <img align="center" src="/img/uml-facade.png" height="53%" width="53%"/> </h5>

**Avoid creating a god object**. If needed, additional facades can be made either to be used independently or to be composed with a higher-level facade (so the latter can maintain cohesiveness).

### Adapter

The Adapter Pattern converts the interface of a class
into another interface the clients expect. It lets
classes work together that couldn’t otherwise because of
incompatible interfaces.

<h5 align = center> <img align="center" src="/img/uml-adapter.png" height="83%" width="83%"/> </h5>

Notice that Facade defines a new interface for existing objects, whereas Adapter tries to make the existing interface usable. Adapter usually wraps just one object, while Facade works with an entire subsystem of objects.

### Decorator (or wrapper)

The Decorator Pattern attaches additional
responsibilities to an object dynamically (at runtime).
Decorators provide a flexible alternative to
subclassing for extending functionality.

<h5 align = center> <img align="center" src="/img/uml-decorator.png" height="67%" width="67%"/> </h5>


The wrapper contains the same set of methods as the target and delegates to it all requests it receives. However, the wrapper may alter the result by **doing something either before or after it passes the request to the target.**

### Composite

The Composite Pattern allows you to
compose objects into tree structures to
represent **part-whole hierarchies**. Composite
lets clients treat individual objects and
compositions of objects uniformly.

<h5 align = center> <img align="center" src="/img/uml-composite.png" height="40%" width="40%"/> </h5>

### Proxy

The Proxy Pattern provides a surrogate or
placeholder for another object to **control access** to it.

If you need to **execute something either before or after the primary logic of the class**, the proxy lets you do this without changing that class. Since the proxy implements the same interface as the original class, it can be passed to any client that expects a real service object.

<h5 align = center> <img align="center" src="/img/uml-proxy.png" height="46%" width="46%"/> </h5>

Use the Proxy
Pattern to create a
representative object
that controls access
to another object,
which may be remote,
expensive to create, or
in need of securing.

## Behavioral 🗣️

_Behavioral patterns take care of effective communication and the assignment of responsibilities between objects._

### Template method

The Template Method pattern suggests that you **break down an algorithm** into a series of steps, turn these steps into methods, and put a series of calls to these **methods inside a single template method**. The steps may either be `abstract`, or have some default implementation. The algorithm is completed by subclassing and overriding some optional steps if needed (but not the template method itself).

<h5 align = center> <img align="center" src="/img/uml-template-method.png" height="42%" width="42%"/> </h5>

**Hooks** can be very useful, they are methods that **give a point of extension of the algorithm**, but that are not needed for the algorithm to work. An example is the `onCreate()` method on *Android Activity*, which lets the client do something before
(or after) an important step.


### Iterator

The main idea of the Iterator pattern is to extract the traversal behavior of a collection into a separate object called an *iterator*.

<h5 align = center> <img align="center" src="/img/uml-iterator.png" height="42%" width="42%"/> </h5>

This **makes the client code compatible with any collection type or any traversal algorithm** as long as there’s a proper iterator. If you need a special way to traverse a collection, you just create a new iterator class, without having to change the collection or the client.

### Strategy

The Strategy pattern suggests that you take a class that does something specific in a lot of different ways and **extract all of these algorithms into separate classes** called strategies.

The original class, called context, must have a field for storing a reference to one of the strategies. The context **delegates the work to a linked strategy object which can be changed at runtime**, and also used by other contexts.

<h5 align = center> <img align="center" src="/img/uml-strategy.png" height="42%" width="42%"/> </h5>

Remember that if you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program. Also keep in mind that functional typing and **anonymous functions can provide the same results**, avoiding the need to bloat with new classes and interfaces.