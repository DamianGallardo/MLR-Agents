public class Resultado{
    public double resultante(double x1, double x2){
        double yhat=0;
        Matrix m = new Matrix();
        double [][] xtx_1xty ;
        xtx_1xty = m.matrizes();
        System.out.printf("Yhat= b0 + b1*x1 + b2*x2 \n");

        System.out.printf("Yhat= %.4f + %.4f * %.4f + %.4f * %.4f \n",xtx_1xty[0][0],xtx_1xty[0][1],x1,xtx_1xty[0][2],x2);
        yhat=xtx_1xty[0][0]+xtx_1xty[0][1]*x1+xtx_1xty[0][2]*x2;
        System.out.printf("El resultado es: %.4f\n",yhat);
        return yhat;
    }
}
