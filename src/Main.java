public class Main {
    public static void main(String[] args) {
        /* The factory method pattern helps us encapsulate
        different ways of creating objects of the same type and reuse this encapsulated logic
        anytime needed in our code.
        Factory Method Pattern -- Lets us define an interface or a super class for creating objects ,
        and lets the subtypes define what object to instantiate */

        // my example using interfaces
        AnimalCreator creator = new RandomCreator();
        AnimalCreator creator1 = new EvenCreator();
    }
}