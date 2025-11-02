```
Command Pattern
```

`encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or 
log requests, and support undoable operations.`

`We encapsulate a receiver and an action into a command, which just had execute() method`.

`Commands give us a way to package a piece of computation (a receiver and a set of actions) and pass it around as a 
first-class object. Now, the computation itself may be invoked long after some client application creates Commands the 
command object, this might be used as a queueing mechanism as well as to log requests.`


