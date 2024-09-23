public class Main {
    public static void main(String[] args){

        // exemplo de notas de prova semestral, tcc e avaliações
        int ps = 7, tcc = 5, av1 = 10, av2 = 6;

        double mediaFinal = ps * 0.5 + tcc * 0.3 + ((av1 + av2) / 2) * 0.2;

        mediaFinal += 1;

        System.out.println("A média final é: " + mediaFinal);
    }
}
