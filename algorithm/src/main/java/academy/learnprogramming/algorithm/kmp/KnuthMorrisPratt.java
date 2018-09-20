package academy.learnprogramming.algorithm.kmp;

public class KnuthMorrisPratt {

    /*
    * This computes the table of the longest suffix and longest prefix on the pattern.
    * This is to be used by the Knuth-Morris-Pratt main method of the algorithm.
     */
    public int[] computeLSPTable(char[] pattern){
        int lsp[] = new int[pattern.length];
        int j = 0;
        for (int i = 1; i < pattern.length; i++) {
            while(j > 0 && pattern[j] != pattern[i]){
                j = lsp[j-1];
            }
            if (pattern[j] == pattern[i]){
                lsp[i] = j + 1;
                j++;
            } else {
                lsp[i] = 0;
            }
        }
        return lsp;
    }

}
