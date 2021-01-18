package com.designpattern.behavioral.command;

/**
 * 1) This pattern is used to encapsulate all the data required for performing
 *  a given action(command), in an object.
 * 2) This pattern turns a request into a stand-alone (command) object that contains all
 *     information about request and how and who to execute that.
 * 3) This pattern decouples objects that produce the commands from their consumers,
 *  hence it is also known as producer-consumer pattern
 * 4) typical implementation needs 5 components
 *      1) Sender (invoker or producer or Executor)
 *      2) Command interface (encapsulated object that executes the command)
 *      3) Concrete Command implementation (holds data about receiver and its operations)
 *      4) Receiver (consumer which executes the actual business logic)
 *      5) Client (creates concrete commands and invokes the flow)
 *
 * 5) Usage: Use the Command pattern when you want to queue operations,
 *  schedule their execution, or execute them remotely, reversible operations.
 */
public class CommandExampleClient {

    public static void main(String[] args) {

        String customerId = "1234";
        //Receiver that actually executes the business logic
        OrderReceiver orderReceiver = new OrderReceiver(customerId);

        WebOrderExecutor webOrderExecutor = new WebOrderExecutor();
        //Producer WebOrderExecutor calls executeOperation with Concrete Command
        webOrderExecutor.executeOperation(new AddItemOperation(orderReceiver, 1));
        webOrderExecutor.executeOperation(new AddItemOperation(orderReceiver, 2));
        webOrderExecutor.executeOperation(new AddItemOperation(orderReceiver, 3));

        //Producer MobileOrderExecutor calls executeOperation with Concrete Command
        MobileOrderExecutor mobileOrderExecutor = new MobileOrderExecutor();
        mobileOrderExecutor.executeOperation(new RemoveItemOperation(orderReceiver, 2));
        mobileOrderExecutor.executeOperation(new PlaceOrderOperation(orderReceiver));

    }
}
