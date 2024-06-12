public class Pato  implements AnimalAereo{
    @Override
    public void comer(){
        System.out.println("O Pato está a comer...");
    }
    @Override
    public void dormir(){
        System.out.println("O Pato está a dormir...");
    }
    @Override
    public void mover(){
        System.out.println("O Pato está a andar...");
    }
    @Override
    public void comunicar(){
        System.out.println("O Pato está a fazer barulho...");
    }
    @Override
    public void voar(){
        System.out.println("O Pato está a voar...");
    }
}
