import javax.swing.*;


public class Recursividad {


     private int numero;

    public int Factorial(int numero){
        this.numero=numero;
        if (this.numero<=1){
            return 1;
        }
        else{
            int resultado=this.numero*Factorial(numero-1);
            return resultado;
        }
    }

    public static void main(String[] args) {

        int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el numero del factorial que quiere"));
        Recursividad objR=new Recursividad();
        int resultado=objR.Factorial(numero);
        JOptionPane.showMessageDialog(null,resultado);
    }


}
