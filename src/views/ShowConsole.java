package views;

public class ShowConsole {


    public ShowConsole(){

    }
    /* 
    public void printArray(int[] numeros){
        for(int i=0; i < numeros.length;i++){
            System.out.println(numeros[i]+ ",");
        }

    }
    */
    public void printArray(int[] numeros){
        System.out.print("[");
        for(int i=0; i< numeros.length;i++){
            if(i == numeros.length-1){
                System.out.print(numeros[i]);
            }else{
                System.out.print(numeros[i] + " ,  ");
            }     
        }
        System.out.println("]");
    }

    public void printResult(int numeroBuscado, int posicion) {
        if (posicion == -1) {
            System.out.println("Error -> No se encontró el número {" + numeroBuscado + "}.");
        } else {
            System.out.println("El número {" + numeroBuscado + "} se encontró en la posición [" + posicion + "].");
        }
    }
    public void printResultO(int numeroBuscado, Integer posicion) {
        if (posicion == null) {
            System.out.println("Error -> No se encontró el número {" + numeroBuscado + "}.");
        } else {
            System.out.println("El {"+ numeroBuscado+ "} se encontro ");
        }
}
    


}
