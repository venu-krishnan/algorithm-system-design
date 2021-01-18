package com.designpattern.behavioral.chainofresposibility;

/**
 *
 * 1) This patterns lets to pass requests along a chain of handlers.
 * 2) Upon receiving a request, each handler decides either to process the request or
 *      to pass it to the next handler in the chain.
 * 3) Chain of processing object is responsible for a certain type of command,
 *      it forwards to next processor in chain once the processing is done.
 * 4) This patterns follows Single Responsibility Principle and Open/Closed Principle,
 *      ie) new handlers can be added without breaking the existing client code
 *
 */
public class ChainOfResonsibilityExample {

    public static void main(String[] args) {

        Handler authHandler = new AuthHandler(null);
        Handler auditHandler = new AuditLogHandler(authHandler);
        Handler baseHandler = new BaseHandler(auditHandler);

        baseHandler.handle("doNothing");

        //Output
        //BaseHandler handling command:doNothing
        //AuditLogHandler handling command:doNothing
        //AuditLogHandler handling command:doNothing
    }
}
