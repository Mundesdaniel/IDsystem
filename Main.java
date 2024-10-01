public class Main extends Person {
    public Main(String name, String username, int age, String password) {
        super(name, username, age, password);
    }

    public static void main(String[] args) {
            //Obj CustomerId
        Person person1 = new Person("Mundes","dan",34,"ijerifjir");
        Person person2 = new Person("Babu", "Buba", 45, "asfljn vjle ");
       System.out.println(person1);
        System.out.println(person2);
       System.out.println("person1 equals person2: " + person1.equals(person2));


        CustomerID customer1 = new CustomerID("Hana", "Hana1", 20, "2332", 1000.0);
       System.out.println(customer1);


       //Object ManagerId
        Manager manager1 = new Manager("Mundes","dan",24,"jfjgjg",0);
        Manager manager2 = new Manager("Babu","buba",0,"sdnweoj",9);
        System.out.println(manager1);
        System.out.println(manager2);

        manager1. setActionnumber(10);
        System.out.println("Manager 1 action number: " + manager1. getActionnumber());

        System.out.println(manager1.equals(manager2));
    }


    }
