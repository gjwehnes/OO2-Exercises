#### Exercise: Bird Hierarchy

This exercise focuses on redesigning an inheritance hierarchy for different types of birds.

##### Background
You come across a design for a Bird superclass that intends to allow subclasses to implement behaviours of specific birds. Specifically, the Bird class will have methods `String vocalize()` and `String fly()`. To keep this simple, these methods just return a String with onomatopoeias (a fine word to know, outside of Computing Science)

All well and good, but you then see that someone has started a Penguin class. Hmmm.... penguins are birds, and they certainly vocalize, but they can't fly! So, to solve that inconsistency, that someone has decided to have the `fly()` method throw a `UnsupportedOperationException`. Problem solved?

Well, unfortunately not, because this design violates the [Liskov Substitution Principle](https://en.wikipedia.org/wiki/Liskov_substitution_principle) (LSP). You do not have to dive too deeply into this definition (although should know it exists and you may find the given link interesting), but it essentially formalizes what your textbook calls the substitution principle: "you can always use a subclass object when a superclass object is expected.". By the existing definition of the Bird class, code can expect a Bird object to be able to vocalize. However, when you substitute a Penguin (subclass) for a Bird (superclass), that code suddenly will experience a run-time exception.

Your task is to modify the class hierarchy to satisfy the LSP by introducing a subclass of Bird called `FlyingBird`. You do *not at this time need a 'NonFlyingBird'

##### Notes
- The BirdTest unit test should currently pass one of two test. After making your modification, it should (obviously) pass both tests. Consider the one test that already passes to be a non-regression test.
- You may wonder why the Bird class' `vocalize()` method is not abstract. We will cover the idea of abstract methods in a later exercise. For now, the intent is for the superclasses to still have behaviour that we expect of generic birds

##### Requirements

###### 1. Modify the Bird Class

The Bird class must:
- Remove the method `fly()`.

###### 2. Create the FlyingBird Class

Create a class named **FlyingBird**.

The FlyingBird class must:
- Extend `Bird`.
- Add a method named `fly()` which has the same behaviour as the `fly()` method removed from the Bird class

###### 3. Modify the Crow and Penguin class

Consider what changes may need to be made

##### What Your Implementation Should Support

Your solution should allow:
- Creating Bird, Crow, and Penguin objects.
- Calling `vocalize()` on all bird types.
- Calling `fly()` on flying birds.
- Representing that some birds cannot fly.
- Correct use of inheritance and method overriding.
- Successful execution of the provided unit test.

##### Learning Goals

By completing this exercise, you will practice:
- Building inheritance hierarchies.
- Using method overriding.
- Applying polymorphism.
- Modelling real-world relationships using classes.
- Designing class structures that avoid inappropriate behavior inheritance.





