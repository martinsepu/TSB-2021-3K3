import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        Arreglo array=new Arreglo(10000000);

        boolean uno=false,dos=false,tres=false,cuatro=false,cinco=false,seis=false,siete=false,ocho=false;

        //carga del arreglo
        File f = new File("lote01.txt");
        int i=0;
        //long suma=0;

        try{
            Scanner miEscaner = new Scanner(f);

            while (miEscaner.hasNextInt()) {
                int numero = miEscaner.nextInt();
                //System.out.println(numero);
                array.setItemVector(numero,i);
                i++;
                //suma=suma+numero;
                switch (numero) {
                    case 2755145:
                        uno = true;
                        break;
                    case 12873556:
                        dos = true;
                        break;
                    case 9121687:
                        tres = true;
                        break;
                    case 1013111:
                        cuatro = true;
                        break;
                    case 882943:
                        cinco = true;
                        break;
                    case 923810:
                        seis = true;
                        break;
                    case 716253:
                        siete = true;
                        break;
                    case 987235:
                        ocho = true;
                }

            }
        }
        catch (FileNotFoundException e){
          System.err.println("El archivo no existe");
        }

        StringBuffer res = new StringBuffer("binario de existencia: ");
        if (uno)res.append("1");
        else res.append("0");
        if (dos)res.append("1");
        else res.append("0");
        if (tres)res.append("1");
        else res.append("0");
        if (cuatro)res.append("1");
        else res.append("0");
        if (cinco)res.append("1");
        else res.append("0");
        if (seis)res.append("1");
        else res.append("0");
        if (siete)res.append("1");
        else res.append("0");
        if (ocho)res.append("1");
        else res.append("0");
        System.out.println(res);


        // arreglo de prueba
        /*
        array.setItemVector(4,0);
        array.setItemVector(8,1);
        array.setItemVector(9,2);
        array.setItemVector(3,3);
        array.setItemVector(5,4);
        suma=4+8+9+3+5;
        */

        //  Calculo de promedio
        /*
        double prom= (double)suma/10000000;
        prom=(double)Math.round(prom*100d)/100d;
        System.out.println(prom);
        System.out.println("promedio: " + Math.round(prom) );
        */

        //System.out.println(i);
        array.calculoMediana();
        System.out.println(array.getItem(9999999));
        System.out.println("ya ordene");

        //System.out.println("el primer primo es: " + array.buscarPrimerPrimo());




    }
}
