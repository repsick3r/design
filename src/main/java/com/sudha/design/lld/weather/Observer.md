```
The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its 
dependents are notified and updated automatically
```

- `The only thing the subject knows about an observer is that it implements a certain interface`
- `We can add new observers at any time`
- `We never need to modify the subject to add new types of observers`
- `We can reuse subjects or observers independently of each other`
- `Changes to either the subject or an observer will not affect the other`

<br>
<br>
<br>

<img alt="Observer" src="/src/main/resources/images/Observer.png" width="50%"/>