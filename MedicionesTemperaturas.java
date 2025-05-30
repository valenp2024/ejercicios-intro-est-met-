import java.util.ArrayList; 

/**
 * Registros de temperaturas diarios de una estacion meteorológica
 */
public class MedicionesTemperaturas
{
    /**
     * Contiene las mediciones de temperaturas.
     */
    private ArrayList<Integer> registros;
    
    /**
     * Dia del registro
     */
    private int dia;
    
    /**
     * Mes del registro
     */
    private int mes;
    
    /**
     * Constructor de la clase. Inicializa dia y mes con los parámetros respectivos,
     * y la lista de registros se inicializa vacía (sin mediciones).
     * Precondición: 
     *  - dia debe ser un día válido (entre 1 y 31)
     *  - mes debe ser un mes válido (entre 1 y 12)
     */
    public MedicionesTemperaturas(int dia, int mes) {
        assert dia >= 1 && dia <= 31;
        assert mes >= 1 && mes <= 12;
        this.dia = dia;
        this.mes = mes;
        this.registros = new ArrayList<Integer>();
    }
    
    /**
     * Agrega una temperatura al registro de temperaturas
     */
    public void agregarRegistro(int nuevaTemperatura) {
        registros.add(new Integer(nuevaTemperatura));
    }
    
    /**
     * Muestra todas las temperaturas registradas en 
     * la pantalla. 
     */
    public void imprimirTemperaturas() {
        System.out.println(dia + "/" + mes);
        int pos = 0;
        for (Integer temperatura: registros) {
            System.out.print(pos + ": ");
            System.out.println(temperatura + "C");
            pos = pos + 1;
        }
    }
    public void cantTemperaturasExtremas(){
        //temp extrema +35 min-15
          int tempExt = 0;
          int tempMin = 0;
          for (int temperatura : registros){
          if (temperatura > 35){
              tempExt = tempExt + 1;
            } 
          if (temperatura < (-15)){
                tempMin = tempMin + 1;
            }    
         }
        System.out.println("cant temp max:" + tempExt + "cant temp min: " + tempMin);
        }
     //this, el punto para llamar a métodos interos?
    public void promedio(){
            int suma = 0;
            int prom = 0;
            int cant = 0;
            for (int temperartura : registros){
                suma = suma + temperartura;
                cant = cant + 1;
            }
            prom = (suma/cant);
            //assert (prom == 0: "no hay temperaturas registradas");
            //HAY QUE VER QUE EL ARREGLO TENGA TEMPERATURAS
            System.out.println("promedio: " + prom);
        }
    public void tMax(){
        int tempMax = 0;
        for (int temperatura : registros){
            //int newMAx = 0;
            if (temperatura > tempMax){
                tempMax = temperatura;
            }                
        }
        System.out.println("Temp max: " + tempMax);
    }
    public void tMin(){
        int tempMin = 0;
        for (int temperatura : registros){
            //int newMAx = 0;
            if (temperatura < tempMin){
                tempMin = temperatura;
            }                
        }
        System.out.println("Temp min: " + tempMin);
        //return tempMin;
    }
    public void amplitud(){
        //diferencia entre la max y la min
        
    }
}
