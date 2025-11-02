```
Facade
```

`provides an unified interface to a set of interfaces in a subsystem, basically a higher level interface to make use
of subsystem easier`

`some adapters may also implement different adaptees to provide some functionality to the client, the difference comes
in their intent, adapter intends to alter the adaptee to match an interface the client is expecintg, but the 
facade pattern is trying to provide a simplified interface to a subsystem`

![Facade Pattern](/src/main/resources/images/Facade.png)

###### 6
`The principle of least knowledge says that talk to your immediate friends`

- `you can call the object itself`
- `call objects passed as params to the method`
- `any object the method creates or instantiates`
- `any components of the object`

![Allowed usages](/src/main/resources/images/Demeter.png)

`Basically means, when designing an object, we should be careful of how many classes it interacts with and the way it 
does that. This also achieves the higher goal of loose coupling across the system.`

`This is also called the law of demeter`
`This also comes with some caveats as sometimes we end up writing more wrapper classes to call other components,
defeating the maintainability and performance.`



