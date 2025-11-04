```
Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying 
their concrete classes.
```

- `In factory pattern, you use subclasses to do your creation for us, clients are decoupled from concrete type`

- `In abstract factory pattern we have an abstract type for creating a family of products. Subclasses of this type define 
how those products are produced.` 
  - `To use the factory, you instantiate one and pass it into some code that is written 
  against the abstract type. So, like Factory Method, my clients are decoupled from the actual concrete products they 
  use.`

- `use whenever you have families of products you need to create and you want to make sure your clients create products 
that belong together`

- `use factory method when you want to decouple your client code from the concrete classes you need to instantiate, or if 
you don’t know ahead of time all the concrete classes you are going to need. To use me, just subclass me and implement 
my factory method!`

- `Factory Method relies on inheritance: object creation is delegated to subclasses which implement the factory method to
create objects.`

- `Abstract Factory relies on object composition: object creation is implemented in methods exposed in the factory 
interface.`

<br>
<br>
<br>

<img alt="Abstract Factory" src="/src/main/resources/images/AbstractFactory.png" width="70%"/>

