/* 
 Simple Banking System Program 🏦
 */

import java.util.Scanner;

class Account
{
    int bal;
    Account(int b)
    {
        bal = b;
    }
    boolean isSufficient(int w)
    {
        if(bal>=w)
        {
            return true;
        }
        else{
            return false;
        }
    }
    void withdraw(int amt, String s1)
    {
        bal = bal -amt;
        System.out.println(s1+" Transaction Successful.");
        System.out.println(s1+" Current Balance is: "+bal);
    }
}
class Customer implements Runnable
{
    Account x1;
    String src;
    Customer(Account a1,String s1)
    {
        x1 = a1;
        src = s1;

    }
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        synchronized(x1)
        {
            System.out.println("Enter the withdraw amount "+src+"=");
            int amt = sc.nextInt();
            
            if(x1.isSufficient(amt))
            {
                x1.withdraw(amt,src);
            }
            else{
                System.out.println("Insufficient Balance...");
            }
        }
    }
}
public class ThreadSyn {
    public static void main(String[] args) {
        Account a1 = new Account(5000);
        Customer c1 = new Customer(a1, "Satyam");
        Customer c2 = new Customer(a1, "Shivam");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();

    }
}
