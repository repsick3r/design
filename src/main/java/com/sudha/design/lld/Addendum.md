```KISS : Keep it simple stupid```

```
YAGNI: If you decide to implement a pattern for a simple problem, do that in the case you expect the system to vary, 
add patterns to practical variations expected to happen, not some hypothetical change that may happen.
```

<br>

```
Bridge pattern allows us to vary the implementation along with your abstractions
```

- `Write about bridge here`

<br>

```
Builder pattern is used to encapsulate the construction of a product and allow it to be constructed in steps.
```

- `we encapsulate our creation logic in an object(builder) which takes care of building the internal structure`
- `allows us to build the object in multi steps`

<br>

```
Chain of Responsibility Pattern when you want to give more than one object a chance to handle a request.
```

-  `Each object in the chain acts as a handler and has a successor object. If it can handle the request, it does; 
otherwise, it forwards the request to its successor.`


<div style="text-align: center;"><img alt="COR" src="{{ site.baseurl }}/src/main/resources/images/COR.png" width="50%"/></div>

<div style="text-align: center;"><img alt="COR2" src="{{ site.baseurl }}/src/main/resources/images/COR2.png" width="60%"/></div>

<br>

``` 
Flyweight Pattern when one instance of a class can be used to provide many virtual instances.
```
- `This is used when a class has many instances, and they can all be controlled identically.`
- `instead of having thousands of Tree objects, you could redesign your system so that you’ve got only one instance of 
Tree, and a client object that maintains the state of all trees`
  - `once you’ve implemented it, single, logical instances of the class will not be able to behave independently from
  the other instances.`


<div style="text-align: center;"><img alt="Flyweight" src="{{ site.baseurl }}/src/main/resources/images/Flyweight.png" width="50%"/></div>

<br>

``` 
Interpreter Pattern to build an interpreter for a language.
```

- `defines a class-based representation for its grammar along with an interpreter to interpret its sentences.`
- `grammar is easily extendable as it is represented by classes, methods can easily add additional functionality`
  - `can become cumbersome quickly when the number of rules become large`

<div style="text-align: center;"><img alt="Interpreter" src="{{ site.baseurl }}/src/main/resources/images/Interpreter.png" width="50%"/></div>

<br>

``` 
Mediator Pattern used to centralize complex communications and control between related objects.
```

- `we remove the dependency of to know about all other object, now all appliances are decouple with each other and only
talk with the mediator`
- `simplifies and reduces the variety of messages sent between objects in the system.`
  - `without proper design, the Mediator object itself can become overly complex.`

<div style="text-align: center;"><img alt="Mediator" src="{{ site.baseurl }}/src/main/resources/images/Mediator.png" width="25%"/></div>


<br>

``` 
Memento Pattern when you need to be able to return an object to one of its previous states.
```

- `we just store the state of the object in another object called a memento`
- `keeping the saved state external from the key object helps to maintain cohesion.`

<br>

``` 
Prototype pattern is used when creating an instance of a class is either costly or complicated.
```

- `allows you to make new instances by copying existing instances, clone() in java usually.`
- `client code can make new instances without knowing which specific class is being instantiated.`
- `we basically give the ability to copy an object without knowing the class, selecting the source for this copy is not
our concern`

<br>

``` 
Visitor Pattern when you want to add capabilities to a composite of objects and encapsulation is not important.
```

- `the Visitor works hand in hand with a traverser, who knows how to navigate to all of the objects in a composite. we 
parse through the composite and the visitor collects state, once state has been gathered, the client can have the 
visitor perform various operations on the state.`
- `When new functionality is required, only the visitor must be enhanced.`

<div style="text-align: center;"><img alt="Visitor" src="{{ site.baseurl }}/src/main/resources/images/Visitor.png" width="70%"/></div>