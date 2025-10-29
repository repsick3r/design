# Design

```
Design Patterns give you a shared vocabulary with other developers. Once you’ve got the vocabulary you can more easily 
communicate with other developers and inspire those who don’t know patterns to start learning them. 
It also elevates your thinking about architectures by letting you think at the pattern level, not the nitty gritty 
object level.
```

`-------------------------------------------------------------------------------------------------`

- `HAS-A is better than IS-A i.e : composition is better than inheritance`

###### 1 `Favour composition over inheritance`

###### 2 `Encapsulate what varies`

###### 3 `Program to interfaces, not implementation`

- [Duck has fly and quack behaviours which helped us with flexibility][duck-path]

`The above pattern where we made family of algorithms, Duck, FlyBehaviour and QuackBehaviour with encapsulation and 
using them interchangeably is called`

```
strategy pattern
```

`-------------------------------------------------------------------------------------------------`

```
The Observer Pattern
``` 

`defines a one-to-many dependency between objects so that when one object changes state, 
all of its dependents are notified and updated automatically.`

[See how WeatherData is published to Display systems in a pub/sub model][weather-path]

- `The only thing the subject knows about an observer is that it implements a certain interface`
- `We can add new observers at any time`
- `We never need to modify the subject to add new types of observers`
- `We can reuse subjects or observers independently of each other`
- `Changes to either the subject or an observer will not affect the other`

###### 4
`Loosely coupled principle allows us to build flexible OO systems that can handle change because they minimize the interdependency between objects.`

`-------------------------------------------------------------------------------------------------`

###### 5 `The Open-Closed Principle says Classes should be open for extension, but closed for modification.`

- `Following the Open-Closed Principle usually introduces new levels of abstraction, which adds complexity to our code.
You want to concentrate on those areas that are most likely to change in your designs and apply the principles there.`

```
Decorator pattern
```

`
attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative tosubclassing
for extending functionality.
`

- `Decorators have the same supertype as the objects they decorate.`
- `The decorator adds its own behavior either before and/or after delegating to the object it decorates to do the rest 
of the job.`
- `Objects can be decorated at any time, so we can decorate objects dynamically at runtime with as many decorators as
we like.`
- `Given that the decorator has the same supertype as the object it decorates, we can pass around a decorated object in 
place of the original (wrapped) object.`
- `If you have code that relies on the concrete component’s type, decorators will break that code. writing code against 
abstract component will keep the the use of decorators transparent to your code.`
- ` Downside : design using this pattern often result in a large number of small classes that can be overwhelming to a
developer trying to use the Decorator-based API.`
- `This also have the problem that introducing decorators can increase the complexity of the code needed to instantiate 
the component. Once you’ve got decorators, you’ve got to not only instantiate the component, but also wrap it with who 
knows how many decorators.`
  [We have condiments as decorators to the original beverage][coffee-path]

`-------------------------------------------------------------------------------------------------`

`When you have some code which instantiates a lot of concrete classes, when a new class of the same super type is 
implemented, our code needs to take cognizance of the new class i.e : not closed for modification.`

```
Factory Method Pattern
```

`
defines an interface for creating an object, but lets subclasses decide which class to instantiate. 
Factory Method lets a class defer instantiation to subclasses.
`

- `“decides” not because the pattern allows subclasses themselves to decide at runtime, but because the creator class is
written without knowledge of the actual products that will be created, which is decided purely by the choice of the 
subclass that is used.`

[Look at how simple factory][pizza-simple-path] differs from [factory method pattern][pizza-factory-path]
`createPizza abstract method which is going to be implemented can be anything, in simple factory we just compose another
object with pizza store rather than giving this createPizza freedom`

###### 6
`Dependency inversion principle says depend upon abstractions not on concrete classes i.e: reducing dependencies to concrete classes in our code is a “good thing`

`This sounds a lot like our `[principle](#3-program-to-interfaces-not-implementation)`but it suggests that our 
high-level components should not depend on our low-level components; rather, they should both depend on abstractions`

`So` `high-level -> low->level -> interface` `turns into` `high-level -> interface <- low-level`,
`thus inverting dependency.`


[duck-path]: src/main/java/com/sudha/design/lld/ducks

[weather-path]: src/main/java/com/sudha/design/lld/weather

[coffee-path]: src/main/java/com/sudha/design/lld/coffee

[pizza-simple-path]: src/main/java/com/sudha/design/lld/pizza/simple

[pizza-factory-path]: src/main/java/com/sudha/design/lld/pizza/factory

