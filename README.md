# Design

```
Design Patterns give you a shared vocabulary with other developers. Once you’ve got the vocabulary you can more easily 
communicate with other developers and inspire those who don’t know patterns to start learning them. 
It also elevates your thinking about architectures by letting you think at the pattern level, not the nitty gritty 
object level.
```

`_____________________________________________________________`

`HAS-A is better than IS-A i.e : composition is better than inheritance`

`Favour composition over inheritance`

[Duck has fly and quack behaviours which helped us with flexibility](src/main/java/com/sudha/design/lld/ducks/)

`The above pattern where we made family of algorithms, Duck, FlyBehaviour and QuackBehaviour with encapsulation and 
using them interchangeably is called`

```
strategy pattern
```

`_____________________________________________________________`

```
The Observer Pattern
``` 

`defines a one-to-many dependency between objects so that when one object changes state, 
all of its dependents are notified and updated automatically.`

- `The only thing the subject knows about an observer is that it implements a certain interface`
- `We can add new observers at any time`
- `We never need to modify the subject to add new types of observers`
- `We can reuse subjects or observers independently of each other`
- `Changes to either the subject or an observer will not affect the other`
- `Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize
   the interdependency between objects.`

