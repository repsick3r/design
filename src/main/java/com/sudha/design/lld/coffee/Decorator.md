- `Following the Open-Closed Principle usually introduces new levels of abstraction, which adds complexity to our code.
You want to concentrate on those areas that are most likely to change in your designs and apply the principles there.`

```
Decorator pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible 
alternative to subclassing for extending functionality.
```

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

<br>
<br>
<br>

<img alt="Decorator" src="/src/main/resources/images/Decorator.png" width="40%"/>