public class Main {
    public static void suma( int n1, int n2, int n3) {
        int resultado = n1 + n2 + n3;
        System.out.println(resultado);
    }
    public static class Coche{
        static int puertas = 4;
        void addPuertas (){
            puertas += 1;
            System.out.println(Coche.puertas);
        }
    }
    public static void main(String[] args) {
        suma(10,20,30);
        Coche micoche = new Coche();
        micoche.addPuertas();
    }
}