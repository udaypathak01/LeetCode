class Solution {
    public int minimumLines(int[][] stockP) {
        int n = stockP.length;
        //if we have not two lines
        if (n == 0 || n == 1) {
            return 0;
        }
        //sort initial array with 1st balue means day wise
        Arrays.sort(stockP, (a, b) -> Integer.compare(a[0], b[0]));
        int line = 1;
        for (int i = 2; i < n; i++) {
            int a = stockP[i - 1][0] - stockP[i - 2][0];
            int b = stockP[i][1] - stockP[i - 1][1];

            int c = stockP[i][0] - stockP[i - 1][0];
            int d = stockP[i-1][1] - stockP[i - 2][1];
            if ((a * b) != (c * d)) {
                line++;
            }
        }

        return line;
    }
}