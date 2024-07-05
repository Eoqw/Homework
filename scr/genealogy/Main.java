package scr.genealogy;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();
        tree.addChild("Иван", "Алексей");
        tree.addChild("Иван", "Мария");
        tree.addChild("Алексей", "Сергей");
        tree.addChild("Мария", "Анна");

        tree.getChildren("Иван");
        tree.getChildren("Алексей");
        tree.getChildren("Мария");
    }
}
