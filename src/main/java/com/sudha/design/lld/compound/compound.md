
`Compound pattern combines two or more patterns to solve a recurring or general problem`

```
MVC is a good example of an compound pattern.
```

- `The controller and view are observers for the model, as in when model changes state, it notifies these although not 
so common to notify controllers.`
- `The view itself uses composite pattern to work with buttons, windows and other components`
- `The view uses controller as strategies, where it can use different controllers to switch between behaviours`
- `The adapter model can be used to adapt a new model to an exsisting view and controller`

<div style="text-align: center;"><img alt="MVC" src="{{ site.baseurl }}/src/main/resources/images/MVC.png" width="50%"/></div>





