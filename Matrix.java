public class Matrix {
    sumatorias s=new sumatorias();
    public double [][] xtx={{s.p, s.sumx1(), s.sumx2()}, {s.sumx1(), s.sumx1sql(), s.sumx1x2()},
            {s.sumx2(), s.sumx1x2(), s.sumx2sql()}};
    public double[][] matrizes(){
        double [][] x_1= new double [3][3];
        double [][] ymat={{s.sumy()},{s.sumx1y()},{s.sumx2y()}};
        double [][] xtx_1xty= new double [3][3];
        double Ds;
        Ds = (s.p * s.sumx1sql() * s.sumx2sql()) + (s.sumx1() * s.sumx1x2() * s.sumx2()) + (s.sumx2() * s.sumx1() * s.sumx1x2()) -
                (s.sumx2() * s.sumx1sql() * s.sumx2()) - (s.p * s.sumx1x2() * s.sumx1x2())-s.sumx2sql()*s.sumx1()*s.sumx1();

        for (int fila = 0; fila < 3; fila++) { //formula matriz de adjunto (formula para adquirir la inversa)
            for (int columna = 0; columna < 3; columna++) {
                if(fila==0){
                    if (columna==0){
                        x_1[fila][columna]=((xtx[fila+1][columna+1]*xtx[fila+2][columna+2])-(xtx[fila+2][columna+1]*xtx[fila+1][columna+2]));
                    }else if(columna==1){
                        x_1[fila][columna]=(-1*((xtx[fila+1][columna-1]*xtx[fila+2][columna+1])-(xtx[fila+2][columna-1]*xtx[fila+1][columna+1])));
                    }else if(columna==2){
                        x_1[fila][columna]=(((xtx[fila+1][columna-2]*xtx[fila+2][columna-1])-(xtx[fila+2][columna-2]*xtx[fila+1][columna-1])));
                    }
                }if(fila==1){
                    if (columna==0){
                        x_1[fila][columna]=(-1*((xtx[fila-1][columna+1]*xtx[fila+1][columna+2])-(xtx[fila+1][columna+1]*xtx[fila-1][columna+2])));
                    }else if(columna==1){
                        x_1[fila][columna]=(((xtx[fila-1][columna-1]*xtx[fila+1][columna+1])-(xtx[fila+1][columna-1]*xtx[fila-1][columna+1])));
                    }else if(columna==2){
                        x_1[fila][columna]=(-1*((xtx[fila-1][columna-2]*xtx[fila+1][columna-1])-(xtx[fila+1][columna-2]*xtx[fila-1][columna-1])));
                    }
                }if(fila==2){
                    if (columna==0){
                        x_1[fila][columna]=((xtx[fila-2][columna+1]*xtx[fila-1][columna+2])-(xtx[fila-1][columna+1]*xtx[fila-2][columna+2]));
                    }else if(columna==1){
                        x_1[fila][columna]=(-1*((xtx[fila-2][columna-1]*xtx[fila-1][columna+1])-(xtx[fila-1][columna-1]*xtx[fila-2][columna+1])));
                    }else if(columna==2){
                        x_1[fila][columna]=(((xtx[fila-2][columna-2]*xtx[fila-1][columna-1])-(xtx[fila-1][columna-2]*xtx[fila-2][columna-1])));
                    }
                }
            }
        }
        for (int fila = 0; fila < 3; fila++) { // se divide por determinantee de sistema para concluir la inversa
            for (int columna = 0; columna < 3; columna++) {
                x_1[fila][columna]=x_1[fila][columna]/Ds;
            }
        }
        double guard=0;
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                guard+=(x_1[fila][columna] * ymat[columna][0]);
            }
            xtx_1xty[0][fila]=guard;
            guard=0;
        }
        return xtx_1xty;
    }

}
