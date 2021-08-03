package dominio;

public abstract class Animal extends SerVivo {

    private String ClassAnimal;

    @Override
    public abstract void Alimentarse();

    public String getClassAnimal() {
        return ClassAnimal;
    }

    public void setClassAnimal(String ClassAnimal) {
        this.ClassAnimal = ClassAnimal;
    }
}
