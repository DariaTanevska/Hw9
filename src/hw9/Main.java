package hw9;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"eat","drink", "sleep"};
        Human father = new Human("Vito", "Karleone", 1952);
        Human mother = new Human("Jane", "Karleone", 1955);
        Family family = new Family(father, mother);
        Human daughter = new Human("Jasmin", "Karleone", 1977);
        Human son = new Human("Michael", "Karleone", 1977, 90,
                new String[][]{{"MONDAY", "Task_1"}, {"TUESDAY", "task_2"}, {"FRIDAY", "Task3"}}, family);
        Pet pet = new Pet("Horse", "Rock:)", 5, 75, habits);

        family.addChild(son);
        family.addChild(daughter);
        family.setPet(pet);
//        System.out.println(family.countFamily());
        System.out.println(family);
//        family.deleteChild(0);
//        System.out.println(family);
//        System.out.println(family.countFamily());
    }
}
