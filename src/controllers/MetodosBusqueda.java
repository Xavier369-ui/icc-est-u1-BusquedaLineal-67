package controllers;

import views.ShowConsole;

public class MetodosBusqueda {

    private int[] arreglo;
    private ShowConsole showConsole;

    public MetodosBusqueda() {
        this.arreglo = new int[]{10,11,-2,5,6,8,15,22};
        this.showConsole =  new ShowConsole();
        showConsole.printArray(arreglo);
        // buscar el 5
        int clave = 5;
        int result1 = busquedaLineal(clave);
        showConsole.printResult(clave, result1);
        int clave2 = -2;
        int result2 = busquedaLinealWhile(clave2);
        showConsole.printResult(clave2, result2);
        int clave3 = 20;
        int result3 = busquedaLinealWhile(clave3);
        showConsole.printResult(clave3, result3);
        Integer result4 = busquedaLinealObj(100);
        showConsole.printResultO(100,result4);
        Integer result5 = busquedaLinealObj(10);
        showConsole.printResultO(10,result5);
        

    }

    // retorna la posicion del valor(clave) buscado sino encunetra retorna -1 
    public int busquedaLineal( int clave){
        for(int i=0;i < arreglo.length;i++){
            if(arreglo[i] == clave){
                return i;
            }
        }
        return -1;

    }
    public int busquedaLinealWhile(int clave){
        int i= 0;
        while(i < arreglo.length){
            if(arreglo[i] == clave){
                return i;
            }
            i++;
        }

        return -1;
    }

    // retorna el objeto buscado si encontró
    // sino encontro retorna null
    public Integer busquedaLinealObj(int clave){
        for(int i=0;i< arreglo.length;i++){
            if(arreglo[i] == clave){
                return i;
            }
        }
        return null;

    }

    


}
