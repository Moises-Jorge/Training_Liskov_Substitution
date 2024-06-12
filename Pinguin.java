public class Pinguin implements AnimalAquatico{
    
    @Override
    public void comer() {
        System.out.println("O Pinguin está a comer...");
    }
    
    @Override
    public void dormir() {
        System.out.println("O Pinguin está a dormir...");
    }
    
    @Override
    public void mover() {
        System.out.println("O Pinguin está a andar...");
    }
    
    @Override
    public void comunicar() {
        System.out.println("O Pinguin está a fazer barulho...");
    }
    
    @Override
    public void nadar() {
        System.out.println("O Pinguin está a nadar...");
    }
}
