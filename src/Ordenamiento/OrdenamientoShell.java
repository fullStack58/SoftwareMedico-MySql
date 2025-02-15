/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamiento;

/**
 *
 * @author USUARIO
 */
import javax.swing.JOptionPane;

public class OrdenamientoShell {
    // MÃƒÂ©todo Shell para ordenar alfabÃƒÂ©ticamente
   
    // variables adicionales
    public static int numIC; // Numero de intercambios totales
    public static int numICRegistrados; // Ultima fila recorrida de ambos registros
     public static String[][] registroIC; // Historial de nombres de los intercambios realizados durante el recorrido
    public static int[][] registroIndices_IC; // Historial de indices de los intercambios realizados durante el recorrido
    public static String[][] registroEC; // Historial de elementos o pareja de nombres comparados durante el recorrido
    
    public OrdenamientoShell()
    {
        numIC = 0;

        numICRegistrados = 0;
        registroIC = new String[100][2];
        registroIndices_IC = new int[100][2];
        registroEC = new String[100][2];
    }
    
    
    
    /*
    ------------------------------------------------------
                       METODOS SET
    ------------------------------------------------------
    */
    public static void shell(String[] arreglo)
    {
        int salto, i, j;
        String auxiliar;
       
        salto = arreglo.length / 2;

        while (salto > 0) {
            for (i = salto; i < arreglo.length; i++) 
            {
                j = i - salto;
                while (j >= 0) 
                {
                    registroEC[numICRegistrados][0] = arreglo[j];
                    registroEC[numICRegistrados][1] = arreglo[j + salto];
                    
                    // Comparar cual de las dos cadenas es mayor alfabeticamente (compareTo)
                    int num = arreglo[j].compareTo(arreglo[j + salto]);
 
                    if (num <= 0)
                    {
                        // Si los elementos estÃƒÂ¡n en orden, se sale del ciclo
                        j = -1;
                        
                    } else {
                        // Si los elementos estÃƒÂ¡n fuera de orden, se intercambian
                        auxiliar = arreglo[j];
                        
                        registroIC[numICRegistrados][0] = auxiliar;
                        registroIC[numICRegistrados][1] = arreglo[j + salto];
                        numIC++;
                        
                        registroIndices_IC[numICRegistrados][0] = j;
                        registroIndices_IC[numICRegistrados][1] = j + salto;
                        
                        arreglo[j] = arreglo[j + salto];
                        arreglo[j + salto] = auxiliar;
                        j -= salto;
                    }
                    numICRegistrados++;
                }
            }
            // Se reduce el salto a la mitad
            salto = salto / 2;
        }

        // Se muestra el ordenamiento de los datos paso a paso
        imprimirHistoriales();
        //JOptionPane.showMessageDialog(null, "Arreglo Ordenado en Shell alfabÃƒÂ©ticamente:\n" + arrayToString(arreglo));
    }

    // otros...
    public static void imprimirHistoriales()
    {
        System.out.println("ordenado: " + getNumIC());
        
        System.out.println("\n\n\n registroEC-----------------------------\n ");
        System.out.println("Historial de elementos comparados:\n\n");
        for(int k = 0; k < 10; k++)
        {
            System.out.println(registroEC[k][0] + "  y  " + registroEC[k][1] );
            
        }
        
        System.out.println("\n\n\n registroIC-----------------------------\n ");
        System.out.println("Historial de intercambios realizados:\n\n");
        for(int k = 0; k < 10; k++)
        {
            System.out.println(registroIC[k][0] + "  intercambiar con  " + registroIC[k][1] );
            
        }
        
        System.out.println("\n\n\n registroIndices_IC-----------------------------\n ");
        System.out.println("Historial de intercambios realizados (por indices):\n\n");
        for(int k = 0; k < 10; k++)
        {
            System.out.println("el indice: "+ registroIndices_IC[k][0] + " (" + registroIC[k][0] + ") " + 
                               " se intercambio con el indice: " + registroIndices_IC[k][1] + " (" + registroIC[k][1] + ") ");
            
        }
    }

    /*
    ------------------------------------------------------
                       METODOS GET
    ------------------------------------------------------
    */
    
    // MÃƒÂ©todo para convertir el arreglo en una cadena
    public static String arrayToString(String[] arreglo)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arreglo.length; i++) 
        {
            sb.append("[").append(arreglo[i]).append("] ");
        }
        return sb.toString();
    }

    
    
    // METODOS ADICIONALES (CONTADOR DEL NUMERO DE CAMBIOS Y PASO A PASO DEL ORDENAMIENTO)
    
    
    
    public static int getNumIC()
    {
        return numIC;
    }
    public int getNumPasos()
    {
        return numICRegistrados;
    }
    public String getRegistroIC(int pasoActual, int elemento)
    {
        return registroIC[pasoActual][elemento];
    }
    public String getRegistroEC(int pasoActual, int elemento)
    {
        return registroEC[pasoActual][elemento];
    }
    public int getRegistroIndices_IC(int pasoAntecesor, int elemento)
    {
        return registroIndices_IC[pasoAntecesor][elemento];
    }
}




