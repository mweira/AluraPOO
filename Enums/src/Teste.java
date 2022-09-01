public class Teste {
    public static void main(String[] args) {

        Prioridades pMin = Prioridades.MIN;
        Prioridades pMax = Prioridades.MAX;

        System.out.println(pMin);
        System.out.println(pMax);

        System.out.println(pMin.ordinal());
        System.out.println(pMax.ordinal());

        System.out.println(pMin.getValor());
        System.out.println(pMax.getValor());

    }
}
