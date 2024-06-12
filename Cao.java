public class Cao implements Animal{
    @Override
    public void comer() {
        System.out.println("O Cão está a comer...");
    }

    @Override
    public void dormir() {
        System.out.println("O Cão está a dormir...");
    }

    @Override
    public void mover() {
        System.out.println("O Cão está a correr...");
    }

    @Override
    public void comunicar() {
        System.out.println("O Cão está a ladrar...");
    }

}
