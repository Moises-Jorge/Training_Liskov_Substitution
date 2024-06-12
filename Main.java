public class Main {

    public static void main(String[] args) {
        // Instanciando os animais normalmente (com os seus comportamentos especificos)
            Cao cao = new Cao();
            Pato pato = new Pato();
            Pinguin pinguin = new Pinguin();

            // Execuntando os seus comportamentos 
            cao.comer();        pato.comer();       pinguin.comer();
            cao.dormir();       pato.dormir();      pinguin.dormir();
            cao.comunicar();    pato.comunicar();   pinguin.comunicar();
            cao.mover();        pato.mover();       pinguin.mover();
                                pato.voar();        pinguin.nadar();
        // End

        // Substituindo os animais pelas suas superclasses e o comportamento se mantendo
        Animal cao_novo = new Cao();
        AnimalAereo pato_novo = new Pato();
        AnimalAquatico pinguin_novo = new Pinguin();

            // Executando os mesmos comportamentos
            cao_novo.comer();       pato_novo.comer();      pinguin_novo.comer();
            cao_novo.dormir();      pato_novo.dormir();     pinguin_novo.dormir();
            cao_novo.comunicar();   pato_novo.comunicar();  pinguin_novo.comunicar();
            cao_novo.mover();       pato_novo.mover();      pinguin_novo.mover();
                                    pato_novo.voar();       pinguin_novo.nadar();
        // End

        // CONSEGUIMOS SUBSTITUIR AS SUBCLASSES PELAS SUPERCLSEES SEM QUEBRAR A APLICACAO, PROTANTO, CONSEGUIMOS GARANTIR O "LISP"

    }
}