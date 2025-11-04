```
Adapter converts the interface of a class into another interface the clients expect. Adapter lets classes work together 
that couldn't otherwise beacause of incompatible interfaces.
```

- `The adapter encapsulates the changes in the adaptee interface, so client code can stay the same`
- `Another advantage we get is the adapter can be used with any subclass of the adaptee, as we have used object
composition to wrap the adaptee interface`
- `We also have something called class adapter, where we subclass both target and adaptee classes, this although is not
possible in java`

<br> 

<img alt="object adapter" src="src/main/resources/images/Adapter.png" width="70%"/>

<br>


- `We use composition in object adapter, whereas inheritance in class adapter, with the class adapter though we can 
quickly override a method. object adapter has the benefit of able to work with all the adaptee's subclasses.`

<br>

<img alt="class adapter" src="src/main/resources/images/ClassAdapter.png" width="70%"/>
