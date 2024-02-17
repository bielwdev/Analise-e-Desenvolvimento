public class Main {
    public static void main(String[] args) {

        int[] nota = new int[3];

        nota[0] = 9;
        nota[1] = 10;
        nota[2] = 8;

        System.out.println(nota[0]);
        System.out.println(nota[1]);
        System.out.println(nota[2]);
        System.out.println("Fim das notas manuais");

        for(int i=0;i<3;i++){
            System.out.println(nota[i]);
        }
        System.out.println("Fim das notas automaticas");

        for(int valor:nota){
            System.out.println(valor);
        }
        System.out.println("Fim das notas vetor");
    }
}