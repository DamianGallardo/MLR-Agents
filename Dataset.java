public class Dataset {
    public double x1[] = {1,2,3,4,5,6,7,8,9};
    public double x2[] = {3,6,9,12,15,18,21,24,27};
    public double y[] = {201,202,203,204,205,206,207,208,209};
    public int n = 9;
    public void date(){
        int  i;
       for (i = 0; i < n; i++) {
            System.out.printf("\t %d\t %.2f \t %.2f\t %.2f \n", i + 1, x1[i], x2[i], y[i]);
        }
    }
}
