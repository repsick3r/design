```
Singleton pattern ensures a class only has one instance of it and provides a global point of access to it.
```

- `Use this when only one object is needed such as those managing thread pools, resources ..`
-`We solve the double instantiation problem in LazySlowSingleton by using synchronised word, but synchronised is 100x
slower`
-`We can try to use EarlyLoadedSingleton when eager loading is not resource intensive and is okay`
-`We finally come up with a tradeoff in DoubleCheckedLockingSingleton wherein the getInstance method is not synchronised
but only the instantiation block is in a synchronised block removing the slowness of synchronised method for further all
calls.`
- `In theory we would have violated the one class, one responsibility priniciple wherein singleton is handling both
making sure only instance is present, and the main logic in the application`
- `These are usually not meant to be subclassed, if you do want to make the subclass you were going to design itself a
singleton`
-`Be careful if you are using multiple class loaders; this could defeat the Singleton implementation and result in
multiple instances as each class loader would have its own copy of the class.`
