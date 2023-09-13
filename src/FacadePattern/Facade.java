package FacadePattern;

public class Facade {
    public void genAll(){
        new Presentation().generate();
        new Dao().generate();
    }
}
