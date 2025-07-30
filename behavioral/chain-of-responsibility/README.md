## Introduction

The Chain of Responsibility (CoR) pattern allows you to pass a request along a chain of handlers. Each handler decides either to process the request or to pass it to the next handler in the chain.

 - It decouples the sender and receiver of a request.
 - Useful when multiple objects can handle a request, but the handler isn't known in advance.

## Characteristics
 - Follows behavioral pattern category.
 - Promotes loose coupling by avoiding hard-coded references between sender and receiver.
 - Handlers are linked in a chain structure.
 - Requests move along the chain until one handler processes it or the end of the chain is reached.
 - Dynamic chain creation is possible at runtime.
 - Reduces the need for complex conditional logic (if-else or switch-case).


```plaintext

+------------+     +------------+     +------------+             +------------+
|   Client   | --> |  Handler1  | --> |  Handler2  | --> ... --> |  HandlerN  |
+------------+     +------------+     +------------+             +------------+
       |                     |                     |
       |                     |                     |
       +---------------------+---------------------+
                             |
                             v
                     Processed Request

```

