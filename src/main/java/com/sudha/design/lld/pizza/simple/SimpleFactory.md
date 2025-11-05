- `This sounds a lot like our `[**principle**](#3-program-to-interfaces-not-implementation)` but it suggests that our 
high-level components should not depend on our low-level components; rather, they should both depend on abstractions`

- `So high-level -> low->level -> interface turns into high-level -> interface <- low-level,
thus inverting dependency.`

`Guidelines to follow this principle`

- `No variable should hold a reference to a concrete class, use a factory do this.`

- `No method should override an implemented method of its base class, as all subclasses are meant to implement that, if 
you do so, it was not offering any abstraction in the first place`

- `No class should derive from a concrete class, depend on an abstraction`

`When you have some code which instantiates a lot of concrete classes, when a new class of the same super type is 
implemented, our code needs to take cognizance of the new class i.e : not closed for modification.`

<br>
<br>
<br>

<div style="text-align: center;"><img alt="Factory" src="{{ site.baseurl }}/src/main/resources/images/SimpleFactory.png" width="70%"/></div>