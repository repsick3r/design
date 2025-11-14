# Design

```
Design Patterns give you a shared vocabulary with other developers. Once you’ve got the vocabulary you can more easily 
communicate with other developers and inspire those who don’t know patterns to start learning them. 
It also elevates your thinking about architectures by letting you think at the pattern level, not the nitty gritty 
object level.
```

`-------------------------------------------------------------------------------------------------`

###### 1 `Favour composition over inheritance`

###### 2 `Encapsulate what varies`

###### 3 `Program to interfaces, not implementation`

<br>

- [**`Strategy Pattern`**][duck-path]


`-------------------------------------------------------------------------------------------------`

###### 4 `Loosely coupled principle allows us to build flexible OO systems that can handle change because they minimize the interdependency between objects.`

<br>

- [**`Observer Pattern`**][weather-path]


`-------------------------------------------------------------------------------------------------`

###### 5 `The Open-Closed Principle says Classes should be open for extension, but closed for modification.`

<br>

- [**`Decorator Pattern`**][coffee-path]

`-------------------------------------------------------------------------------------------------`

###### 6 `Dependency inversion principle says depend upon abstractions not on concrete classes i.e: reducing dependencies to concrete classes in our code is a “good thing`

- [**`Simple Factory Pattern`**][pizza-simple-path] 

<br>

- [**`Factory method pattern`**][pizza-factory-path]

<br>

- [**`Abstract Factory method pattern`**][pizza-abstract-factory-path]

`-------------------------------------------------------------------------------------------------` 

- [**`Singleton Pattern`**][chocolate-path]

`-------------------------------------------------------------------------------------------------`

- [**`Command Pattern`**][remote-path]

`-------------------------------------------------------------------------------------------------`

- [**`Adapter Pattern`**][birds-path]

`-------------------------------------------------------------------------------------------------`

###### 6 `The principle of least knowledge says that talk to your immediate friends`

- [**`Facade Pattern`**][hometheatre-path]

`-------------------------------------------------------------------------------------------------`

###### 7 `The hollywood principle states, don't calls us, we'll call you`

- [**`Template pattern`**][caffeine-path]

`-------------------------------------------------------------------------------------------------`

###### 8 `Single responsibilty principle asks a class to have only one reason to change`

- [**`Iterator pattern`**][menu-path]

<br>

- [**`Composite pattern`**][composite-menu-path]

`-------------------------------------------------------------------------------------------------`

- [**`State pattern`**][gumball-path]

`-------------------------------------------------------------------------------------------------`

- [**`Proxy pattern`**][proxy-path]

`-------------------------------------------------------------------------------------------------`

- [**`Compound patterns`**][mvc-path]

`-------------------------------------------------------------------------------------------------`

- `Facade pattern makes interfaces simpler`
- `Decorator pattern adds responsibility to existing class`
- `Adapter converts one interface to another`
- `The factory method is a specialisation of the template method`
- `Strategy pattern encapsulates interchangeable behaviour and uses delegation to choose one`
- `Iterator pattern provides a way to traverse collections without exposing internal implementation`
- `Composite pattern helps client treat collection of objects and objects uniformly`
- `Observer pattern allows a group of objects to be notified when some state changes`
- `State pattern encapsulates state-based behaviour and delegates behaviour to the current state`

`-------------------------------------------------------------------------------------------------`

###### This contents of this repository are direct or indirect extractions from `Head First Design Patterns`

[duck-path]: src/main/java/com/sudha/design/lld/ducks/Strategy.md

[weather-path]: src/main/java/com/sudha/design/lld/weather/Observer.md

[coffee-path]: src/main/java/com/sudha/design/lld/coffee/Decorator.md

[pizza-simple-path]: src/main/java/com/sudha/design/lld/pizza/simple/SimpleFactory.md

[pizza-factory-path]: src/main/java/com/sudha/design/lld/pizza/factory/Factory.md

[pizza-abstract-factory-path]: src/main/java/com/sudha/design/lld/pizza/abstractfactory/AbstractFactory.md

[chocolate-path]: src/main/java/com/sudha/design/lld/chocolate/Singleton.md

[remote-path]: src/main/java/com/sudha/design/lld/remote/Command.md

[birds-path]: src/main/java/com/sudha/design/lld/birds/Adapter.md

[hometheatre-path]: src/main/java/com/sudha/design/lld/hometheatre/Facade.md

[caffeine-path]: src/main/java/com/sudha/design/lld/caffeine/Template.md

[menu-path]: src/main/java/com/sudha/design/lld/merge/Iterator.md

[composite-menu-path]: src/main/java/com/sudha/design/lld/merge/Composite.md

[gumball-path]: src/main/java/com/sudha/design/lld/gumball/State.md

[proxy-path]: src/main/java/com/sudha/design/lld/proxy/Proxy.md

[mvc-path]: src/main/java/com/sudha/design/lld/compound/compound.md