public class rash {
    public int Stateman (int rez) {
        int b = 0;
        while (rez / 2 != 1) {
            rez = rez/2;
            b++;
        }
        b = b + 1;
        return b;
    }
}
