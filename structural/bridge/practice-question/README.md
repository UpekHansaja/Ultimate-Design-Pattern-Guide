
## Scenario:

You are designing a cross-platform notification system for a large-scale enterprise. The company needs to send notifications via multiple channels such as Email, SMS, and Push Notifications. Furthermore, these notifications can be of different types such as Alert, Reminder, and Promotion.
Currently, each notification type is tightly coupled with each delivery channel, leading to a class explosion like EmailAlert, SMSReminder, PushPromotion, etc.

## Your Task:

 1. Identify the problems in the current tightly-coupled design.
 2. Explain how the Bridge Design Pattern can be applied to solve this problem.
 3. Design and implement Java classes/ interfaces to demonstrate the solution using Bridge Pattern.
 4. Draw a UML class diagram for your proposed design.
 5. Describe how this design allows:
    -  Adding a new Notification Type (e.g., Survey)
    -  Adding a new Channel (e.g., WhatsApp) Without modifying existing code (Open/Closed Principle)

