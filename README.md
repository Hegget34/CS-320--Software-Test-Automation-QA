# CS-320--Software-Test-Automation-QA

# Contact Management System

This repository contains my contact management system project implemented in Java for my CS-320 course. It includes the contact service implementation along with unit tests I created to verify the functionality.

## Repository Contents

### Project One: Contact Service Implementation
- `Contact.java` - My Contact class with validation rules
- `ContactService.java` - Service class for managing contacts
- `ContactTest.java` - My unit tests for the Contact class
- `ContactServiceTest.java` - My unit tests for the ContactService class

### Project Two: Software Testing Summary and Reflections
- `Project_Two.docx` - My report on software testing approaches and reflections

## Reflection Questions

### How can I ensure that my code, program, or software is functional and secure?

Based on what I've learned in this course, I can make my code functional and secure by:

1. **Writing good unit tests** - In this project, I tried to test different scenarios like in the ContactTest class where I checked if exceptions were thrown when validation rules weren't met. I'm still learning, but I can see how thorough testing helps catch problems early.

2. **Validating inputs** - In my Contact class, I made sure to check that fields like contactID weren't too long and that phone numbers were exactly 10 digits. This helps prevent bad data from causing problems.

3. **Using proper exception handling** - I learned that throwing specific exceptions with clear messages helps identify what went wrong. For example, my code checks if a contactID is null or too long and provides a helpful error message.

4. **Testing edge cases** - I tried to test not just the "happy path" but also what happens when things go wrong, like attempting to add duplicate contacts or update contacts that don't exist.

5. **Learning about security concerns** - While not fully implemented in this project, I'm beginning to understand the importance of security in software development.

### How do I interpret user needs and incorporate them into a program?

From this project, I've learned that interpreting user needs involves:

1. **Understanding requirements clearly** - In my Contact class, I implemented the requirements like "contact ID cannot exceed 10 characters" and "phone must be exactly 10 digits" by adding validation in the constructor and setter methods.

2. **Creating test cases based on requirements** - My test classes directly check that these requirements are enforced. For example, testPhoneNotTenDigits() verifies that creating a contact with an invalid phone number fails.

3. **Providing helpful error messages** - I tried to make my exception messages clear so users would understand what they did wrong and how to fix it.

4. **Implementing all required functionality** - My ContactService class provides methods to add, delete, and update contacts as specified in the requirements.

5. **Thinking about the user experience** - While this was a simple project, I'm starting to consider how users would interact with my code.

### How do I approach designing software?

I'm still learning about software design, but this project has taught me to:

1. **Organize code logically** - I separated the Contact model from the ContactService class, which I think makes the code easier to understand and maintain.

2. **Check for errors early** - I added validation in constructors and setters to catch problems as soon as possible.

3. **Make certain fields unchangeable** - I made contactID final so it can't be changed after a contact is created, which seems like a good practice for IDs.

4. **Follow naming conventions** - I tried to use clear method names like updateFirstName() that describe what they do.

5. **Write tests alongside code** - I've learned how important it is to test my code as I write it, rather than waiting until the end.

6. **Start simple and improve** - My implementation is basic, but I can see how it could be expanded and improved as I learn more.

## Conclusion

This project has been a valuable learning experience for me in software testing and design. I've gained a better understanding of how to write testable code and verify that it works correctly. I know I still have a lot to learn, but I believe these foundational skills will help me become a better software developer.
