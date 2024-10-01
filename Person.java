//Create Person class, it should have name, age, username, password.
//Override toString function to just print name and age in a good format.
//Override equals function to check username and password.

import java.util.Objects;

public class Person {
    private final String name;
    String username;
    int age;
    String password;

    public Person(String name, String username, int age, String password){
        this.name = name;
        this.username = username;
        this.age = age;
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public  String toString(){
        return "Name ;" + name + "Age :" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(username, person.username) && Objects.equals(password, person.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
