
package SolucionEcuacion;

public class ecuacion {
    public static String calcularSolucion (double A, double B, double C){
        double X1, X2,X;
        String R;
        if((Math.pow(B,2)-4*A*C)<0){
         R = ("La ecuacion no tiene solucion ");
        } else if(A!=0 && (Math.pow(B,2)-4*A*C)>0){
            X1 = (-B+Math.sqrt(B*B-4*A*C))/(2*A);
            X2 = (-B-Math.sqrt(B*B-4*A*C))/(2*A);
            R = ("X1: "+X1+" y X2: "+X2);
        } 
        else{
            X = -B/(2*A);
            R = ("La unica solucion es: "+ X);
        }
        return R;
    }
}
