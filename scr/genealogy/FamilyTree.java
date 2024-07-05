package scr.genealogy;

import java.util.HashMap;
import java.util.Map;

public class FamilyTree {
    private Map<String, Person> people;

    public FamilyTree() {
        this.people = new HashMap<>();
    }

    public void addPerson(String name) {
        if (!people.containsKey(name)) {
            people.put(name, new Person(name));
        }
    }

    public Person getPerson(String name) {
        return people.get(name);
    }

    public void addChild(String parentName, String childName) {
        addPerson(parentName);
        addPerson(childName);
        Person parent = getPerson(parentName);
        Person child = getPerson(childName);
        parent.addChild(child);
    }

    public void getChildren(String parentName) {
        Person parent = getPerson(parentName);
        if (parent != null) {
            System.out.println("Дети " + parentName + ":");
            for (Person child : parent.getChildren()) {
                System.out.println(child.getName());
            }
        } else {
            System.out.println(parentName + " не найден в генеалогическом древе.");
        }
    }
}