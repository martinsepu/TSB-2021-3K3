public class Principal {
    public static void main(String[] args) {
        Arreglo array=new Arreglo(5);

        array.setItemVector(4,0);
        array.setItemVector(8,1);
        array.setItemVector(9,2);
        array.setItemVector(5,3);
        array.setItemVector(5,4);

        System.out.println(array.buscarPrimerPrimo());


    }
}
