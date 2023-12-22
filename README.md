============****************Simple Banking System Program 🏦*******************==========================
****Explaining the concept of multithreading and Synchronization in java***************
This program simulates a simple banking system with two customers, "Satyam" and "Shivam," who share a common bank account. The program consists of three classes: Account 💰, Customer 👤, and ThreadSyn 🔄.

1. Account Class:

The Account class represents a bank account and has an initial balance (bal).
It has a method isSufficient that checks if the account has sufficient balance for a given withdrawal amount.
The withdraw method deducts the specified amount from the account balance.
2. Customer Class:

The Customer class implements the Runnable interface, representing a bank customer.
Each customer is associated with an Account (x1) and has a name (src).
The run method, executed in a separate thread, uses synchronization to ensure safe concurrent access.
The customer is prompted to enter a withdrawal amount, and if the account has enough balance (isSufficient), a withdrawal is made using the withdraw method.
3. ThreadSyn Class:

The ThreadSyn class contains the main method and serves as the entry point for the program.
It creates an Account (a1) with an initial balance of 5000 and two Customer objects (c1 and c2) associated with the same account.
Two threads (t1 and t2) are created using the Customer objects and started to simulate concurrent banking transactions.
Execution:

The program runs two threads concurrently, each representing a customer trying to make a withdrawal from the shared bank account.
The withdrawal amount is entered by the user for each customer.
If the account balance is sufficient, the withdrawal is successful and the updated balance is displayed.
If the account balance is insufficient, a message indicating "Insufficient Balance" is shown.
Note:

The program uses synchronization to prevent conflicts when accessing the shared account balance concurrently from multiple threads.
The program ends when the threads complete their execution. ⏰
