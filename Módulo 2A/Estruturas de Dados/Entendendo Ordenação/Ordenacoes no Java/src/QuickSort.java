public class QuickSort {
    public static void quicksort(int p, int q, int vetor[])
    {
        int x;
        if (p < q)
        {
            x = particao(p, q, vetor);
            quicksort(p, x - 1, vetor);
            quicksort(x+1 + 1, q, vetor):
        }
    }