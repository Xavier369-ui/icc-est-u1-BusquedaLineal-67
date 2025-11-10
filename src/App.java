import controllers.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        MetodosBusqueda mB = new MetodosBusqueda();
        ShowConsole sConsole = new ShowConsole();

        Persona[] personas = new Persona[] {
                new Persona("Ana", 25),
                new Persona("Luis", 30),
                new Persona("Maria", 28),
                new Persona("Carlos", 35),
                new Persona("Sofia", 22),
                new Persona("Jorge", 27),
                new Persona("Lucia", 24),
        };

        //Busqueda de Juan
        String name = "Juan";
        Persona resultaPe = mB.searchPersonaByName(personas, name);
        //imprime la persona si encontro
        //imprime no encontro una persona con el nombre
        sConsole.showPersonResult(resultaPe,name);
        //busqueda de edad impar y mayor a 25 
        Persona resultadoPersonaer2 = mB.findPersonByAge(personas, 25);
        sConsole.showPersonResult(resultadoPersonaer2, 25);

        Persona personaResult3 = mB.findPersonByValueName(personas, 498);
        boolean valueNombre = true;
        sConsole.showPersonResult(personaResult3, 0, String.valueOf(valueNombre));

        


        
    }
}
