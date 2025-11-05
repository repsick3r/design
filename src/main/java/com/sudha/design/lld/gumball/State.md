```
State pattern allows an object to alter its behaviour when internal state changes, the object will appear to be a new 
class
```

<div style="text-align: center;"><img alt="State" src="{{ site.baseurl }}/src/main/resources/images/State.png" width="50%"/></div>


- `even though the class diagram looks the same as strategy pattern, the intent is different as in state pattern we 
do this instead of subclassing, so that we can compose objects with various behaviour easily, but once the object is 
using a behaviour we mostly not change that.`
- `wherein state pattern, we encapsulate behaviour in state classes and avoid putting a lot of conditionals in the 
class`
- `The disadvantage of having state transitions in the state classes is that we create dependencies between the state
classes`
- `We can reuse state objects across various contexts, given we are not storing any state variables in state class`