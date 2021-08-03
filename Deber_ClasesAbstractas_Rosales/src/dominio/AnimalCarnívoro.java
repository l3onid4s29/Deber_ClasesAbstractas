package dominio;

public class AnimalCarnívoro extends Animal {

    @Override
    public void Alimentarse() {
 
        System.out.println("Su dieta consiste principal o exclusivamente del consumo de carne, ya sea mediante la depredación o consumo de carroña.");
    }
}
