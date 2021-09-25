public class Arreglo {
    private int vector[];
    private boolean estaOrdenado;


    public Arreglo(int cant){
        if(cant<=0) cant=5;
        vector =new int[cant];
        estaOrdenado=false;

    }

    public void setItemVector(int item, int pos) {
        if (pos<vector.length)
            vector[pos]=item;
    }

    /**
     * metodo que buscara el primer numero primo del arreglo
     * @return: retornara el primer numero primo, si no existe ninguno retorna -1
     */
    public int buscarPrimerPrimo() {
        boolean noesPrimo;
        noesPrimo=false;
        for(int i=0;i<vector.length;i++){
            if(vector[i]%2==0)
                continue;
            else{
                for(int j=3;j<vector[i]/2;j+=2){
                    if(vector[i]%j==0){
                        noesPrimo = true;
                        break;


                    }
                }
                if(!noesPrimo)
                    return vector[i];
                noesPrimo=false;
            }
        }
        return -1;
    }
    public void quick(int izq, int der){
        int i = izq, j = der, y;
        int x = vector[(izq + der) / 2];
        do
        {
            while(vector[i]<x && i<der) { i++; }
            while(x<vector[j] && j>izq) { j--; }
            if(i <= j)
            {
                y = vector[i];
                vector[i] = vector[j];
                vector[j] = y;
                i++;
                j--;
            }
        }
        while(i <= j);
        if(izq < j) { quick( izq, j ); }
        if(i < der) { quick( i, der ); }
    }
    public void ordenarArreglo(){

        quick(0,vector.length-1);
    }

    public long calculoMediana(){
        long mediana;
        long suma;
        if(!estaOrdenado) {
            this.ordenarArreglo();
            estaOrdenado = true;
        }
        suma=vector[5000000]+vector[5000001];
        double prom=(double) suma/2;
        prom=(double)Math.round(prom*100d)/100d;
        System.out.println("el promedio es: "+prom);
        System.out.println("promedio entero: " + Math.round(prom) );
        mediana= Math.round(prom);
        return mediana;
    }

    public int buscarMayor() {
        int mayor;
        if(!estaOrdenado) {
            this.ordenarArreglo();
            estaOrdenado = true;
        }
        return vector[vector.length-1];
    }

    public int getItem(int pos){
        return vector[pos];

    }


}
