public class Arreglo {
    private int vector[];


    public Arreglo(int cant){
        if(cant<=0) cant=5;
        vector =new int[cant];

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
                        break;
                        noesPrimo = true;
                    }
                }
                if(noesPrimo)
                    return vector[i];
            }
        }
        return -1;
    }


}
