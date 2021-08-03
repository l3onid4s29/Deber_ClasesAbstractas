package dominio;

public class AnimalHerbívoro extends Animal {

    @Override
    public void Alimentarse() {
        System.out.println("Su dieta está basada en el consumo de pastos o forraje.");
    }
}
