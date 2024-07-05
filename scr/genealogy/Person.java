package scr.genealogy;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Person parent;
    private List<Person> children;

    public Person(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Person getParent() {
        return parent;
    }

    public void setParent(Person parent) {
        this.parent = parent;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        child.setParent(this);
        this.children.add(child);
    }
}