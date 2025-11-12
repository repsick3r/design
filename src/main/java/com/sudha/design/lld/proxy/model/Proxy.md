- `an interface can extend another interface`
- `variable sent over the wire should be primitive or serializable`

```
Proxy pattern provides a surrogate or placeholder for another object to control access to it, this object can be remote,
protected or expensive to create.
```

<div style="text-align: center;"><img alt="Proxy" src="{{ site.baseurl }}/src/main/resources/images/Proxy.png" width="40%"/></div>

- `virtual proxy is used where object is expensive to create, defers creation of object until required.`
- `sometimes proxy and decorator look very similar, but serves different purposes, decorator adds behaviour, proxy
control access to it.`
- `We can use proxies by wrapping objects in factory methods with these, so the client never knows they are using 
proxies`

``` 
Dynamic proxies are a thing in java, where we create a proxy class on the fly, because of this nature we have invocation
handlers to specify what to do when proxy methods are called as they are generated at runtime.
```

<div style="text-align: center;"><img alt="Proxy" src="{{ site.baseurl }}/src/main/resources/images/DynamicProxy.png" width="40%"/></div>

- `there are many real life adaptions of the proxy model like the FireWall Proxy, Smart Reference Proxy, Caching Proxy,
Copy-On-Write Proxy` 