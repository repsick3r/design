- `When high-level components depends upon low-level components which further depend on some high-level components and
so on the dependency rot sets in, to avoid this we have low-level components hook themselves into system, high-level 
system decides if it wants to use it or not.`

```
Template pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template method 
lets subclasses redefine certains steps of an algorithm without changing the algorithm's structure
```

- `we leave some methods empty or default instead of abstract, so that subclasses have the option to do something extra
but also not compulsorily, these are called hooks`

<br>

<div style="text-align: center;"><img alt="Template" src="{{ site.baseurl }}/src/main/resources/images/Template.png" width="60%"/></div>

- `in our caffeinebeverage example, the prepare() method calls brew() abstract method of low-level subclass, so this
reflects our hollywood principle`

- `In our duck sort, example even though we do not have exact template method, we deferred the comparison part to the 
algorithm, this is still in the spirit of template method, even though not textbook`

- `Strategy method offers clients choice of implementation using object composition, they can changes algorithms at
runtime using a different strategy object`

- `Tamplate method, allows code reuse where subclasses specify some behaviour, so we still have control over the
algorithm behaviour, all duplicated code is in the superclass.`

- `We use final for the template method, so that subclasses cannot override it`