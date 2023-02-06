package example;

public class Human {
    public void takeMilkshake(){
        HumanThought thought = new HumanThought() {
            @Override
            public void print() {
                System.out.println("Что же взять?\n" +
                        "Шоколадный или клубничный коктейл");
            }
        };
        thought.print();
    }
}
