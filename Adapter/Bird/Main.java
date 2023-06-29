import Interaface.ToyDuck;

//        Suppose you have a Bird class with fly() , and makeSound()methods. And also a ToyDuck class with squeak() method.
//        Let’s assume that you are short on ToyDuck objects, and you would like to use Bird objects in their place.
//        Birds have some similar functionality but implement a different interface, so we can’t use them directly.
//        So we will use adapter pattern. Here our client would be ToyDuck and adaptee would be Bird.
//        Ref: https://www.geeksforgeeks.org/adapter-pattern/
public class Main {

    public static void main(String args[])
    {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow ... ");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        invokeToyDuckSound(toyDuck);

        System.out.println("BirdAdatper...");
        invokeToyDuckSound(birdAdapter);
    }

    public static void invokeToyDuckSound(ToyDuck toyDuck){
        toyDuck.squeak();
    }
}

