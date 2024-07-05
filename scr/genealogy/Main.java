package scr.genealogy;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();
        tree.addChild("John", "Michael");
        tree.addChild("John", "Sarah");
        tree.addChild("Michael", "Kevin");
        tree.addChild("Sarah", "Sophie");

        tree.getChildren("John");
        tree.getChildren("Michael");
        tree.getChildren("Sarah");
    }
}
