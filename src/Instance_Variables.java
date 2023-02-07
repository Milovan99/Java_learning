public class Instance_Variables {
    public static void main(String[] args){
        Dog pas=new Dog();
        pas.setDetails(pas.breed="Doberman",pas.age=3, pas.name="Dzimba" );
        pas.showDetails();
    }
}
class Dog {
    String breed;
    int age;
    String name;

    public void setDetails(String breed, int age, String name) {
        this.breed = breed;
        this.age = age;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }
}