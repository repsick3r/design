```
Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to 
instantiate, it lets a class defer instantiation to subclasses.
```

- `“decides” not because the pattern allows subclasses themselves to decide at runtime, but because the creator class is
written without knowledge of the actual products that will be created, which is decided purely by the choice of the 
subclass that is used.`
- `createPizza abstract method which is going to be implemented can be anything, in simple factory we just compose another
object with pizza store rather than giving this createPizza freedom`

<br>
<br>
<br>

<div style="text-align: center;"><img alt="Factory" src="{{ site.baseurl }}/src/main/resources/images/Factory.png" width="70%"/></div>