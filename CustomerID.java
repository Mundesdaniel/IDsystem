//2- Create Customer class, it should extend Person  class and it should
// have extra customerID(auto genarate we will not have it on constructor)
// and balance.
//
//Required extra functions: getBalance, setBalance and getCustomerID
//
//Overide toString again and print extra customerID
//override equals function and check if username and password matchs or customerID and password match.  IF any of cases are correct we will return true.

import java.util.Objects;

public class CustomerID extends Person{
    private int customerid;
    private  double balance;




    public CustomerID (String name, String username, int age, String password, double balance){
        super(name,username, age, password);
       int idConter = 1;
        this.customerid = idConter;
        this.balance = balance;


    }


    public int getCustomerid() {
        return customerid;
    }



    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CustomerID that = (CustomerID) o;
        return customerid == that.customerid && Double.compare(balance, that.balance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customerid, balance);
    }

    @Override
    public String toString() {
        return "CustomerID{" +
                "customerid=" + customerid +
                ", balance=" + balance +
                '}';
    }
}
