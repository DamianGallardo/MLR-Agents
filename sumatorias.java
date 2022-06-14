public class sumatorias {
    Dataset d = new Dataset();
    private int i;
    public int p =d.n;
    public double sumx1(){
        double sumatoriax1 = 0;
        for (i=0;i<d.n;i++){
            sumatoriax1+=d.x1[i];
        }
        return sumatoriax1;
    }
    public double sumx2(){
        double sumatoriax2 = 0;
        for (i=0;i<d.n;i++){
            sumatoriax2+=d.x2[i];
        }
        return sumatoriax2;
    }
    public double sumy(){
        double sumatoriay = 0;
        for (i=0;i<d.n;i++){
            sumatoriay+=d.y[i];
        }
        return sumatoriay;
    }
    public double sumx1x2(){
        double sumatoriax1x2 = 0;
        for (i=0;i<d.n;i++){
            sumatoriax1x2+=d.x1[i]*d.x2[i];
        }
        return sumatoriax1x2;
    }

    public double sumx1sql(){
        double sumatoriax1sql = 0;
        for (i=0;i<d.n;i++){
            sumatoriax1sql+=d.x1[i]*d.x1[i];
        }
        return sumatoriax1sql;
    }
    public double sumx2sql(){
        double sumatoriax2sql = 0;
        for (i=0;i<d.n;i++){
            sumatoriax2sql+=d.x2[i]*d.x2[i];
        }
        return sumatoriax2sql;
    }
    public double sumx1y(){
        double sumatoriax1y = 0;
        for (i=0;i<d.n;i++){
            sumatoriax1y+=d.x1[i]*d.y[i];
        }
        return sumatoriax1y;
    }

    public double sumx2y(){
        double sumatoriax2y = 0;
        for (i=0;i<d.n;i++){
            sumatoriax2y+=d.x2[i]*d.y[i];
        }
        return sumatoriax2y;
    }
}
