package dominio;

public abstract class SerVivo {

    private String Class_SV;
    public abstract void Alimentarse();

    public String getClass_SV() {
        return Class_SV;
    }

    public void setClass_SV(String Class_SV) {
        this.Class_SV = Class_SV;
    }

}
