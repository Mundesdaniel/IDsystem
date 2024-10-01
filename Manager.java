import java.util.Objects;

//3- Create Manager class, it should extend Person, it should have extra manage
// rId (auto generate) and actionNumber( set zero when you created the object so it
// should assign 0 in the constructor)
//
////        Required extra functions: getActionNumber, setActionNumber and getManagerID
//
////        Overide toString again and print extra managerID
//override equals function and check if username and password matchs or managerIDand
// password match.  IF any of cases are correct we will return true.
public class Manager extends Person {
    private int managerid;
    private int actionnumber;




    public Manager(String name, String username, int age, String password, int managerid) {
        super(name, username, age, password);
        this.managerid = generatemanagerid();
        this.actionnumber = 0;
    }

    private int generatemanagerid() {
        return (int) (Math.random() * 100000);
    }

    public int getManagerid() {
        return managerid;
    }


    public int getActionnumber() {
        return actionnumber;
    }

    public void setActionnumber(int actionnumber) {
        this.actionnumber = actionnumber;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerid=" + managerid +
                ", actionnumber=" + actionnumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return managerid == manager.managerid && actionnumber == manager.actionnumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), managerid, actionnumber);
    }


    public static void main(String[] args) {
        Manager manager1 = new Manager("Mundes","dan",24,"jfjgjg",0);
        Manager manager2 = new Manager("Babu","buba",0,"sdnweoj",9);
        System.out.println(manager1);
        System.out.println(manager2);

        manager1. setActionnumber(10);
        System.out.println("Manager 1 action number: " + manager1. getActionnumber());

        System.out.println(manager1.equals(manager2));
    }
}