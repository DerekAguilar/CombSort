/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package combsort;

import archivos.Archivos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Derek Eduardo Aguilar Reyes
 */
public class CombSort {

    // Método para determinar la brecha entre elementos
    public static int nextGap(int gap,boolean comb11Flag){
        gap/=1.3;
        if (comb11Flag) // <- Para Combsort11 (menos ordenamientos, más pasos y comparaciones)
            if(gap==10||gap==9)
                gap=11;
        if (gap<1)
            return 1;
        return gap;
    }
    
    // Método de ordenamiento
    public static int[] combSort(int[] array,boolean comb11Flag){
        int size=array.length; //Obtiene tamaño de arreglo
        int gap=size; // Inicializa el tamaño de la brecha
        System.out.println("Tamaño de arreglo: "+size);
        int steps=1,count=1,compare=0; // Contador de pasos y de ordenamientos realizados
        boolean alt=true;
        while(gap!=1||alt==true){
            gap=nextGap(gap,comb11Flag); // Proceso de reducción de espacios
            System.out.println("**********Paso #"+steps+"**********");
            System.out.println("Brecha: "+gap);
            alt=false;
            System.out.print("Arreglo actual: ");
            printIntArray(array);
            for(int i=0;i<size-gap;i++){
                compare++;
                if(array[i]>array[i+gap]){ //compara el elemento i de arreglo con el que viene gap espacios después
                    int swap=array[i];
                    array[i]=array[i+gap];
                    array[i+gap]=swap;
                    alt=true;
                    System.out.print("Ordenamiento "+count+": ");
                    printIntArray(array);
                    count++;
                }
            } 
            steps++;
        }
        System.out.println("~~Total de pasos: "+(steps-1));
        System.out.println("~~Total de ordenamientos: "+(count-1));
        System.out.println("~~Comparaciones hechas: "+compare);
        return array;
    }
    
    // Método para imprimir arreglos int[]
    public static void printIntArray(int[] array){
        for (int item : array)
            System.out.print(item+" ");
        System.out.println();
    }
    
    public static void main(String[] args) throws IOException {
        int[] numbers,sorted;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Archivos file=new Archivos();
        System.out.println("Programa para ordenar arreglos por método Comb Sort");
        System.out.println("----------AVISO----------");
        System.out.println("El programa lee archivos de texto desde esta ubicación:");
        System.out.println("Usuarios\\Acceso público\\Documentos públicos");
        System.out.println("Cierra el programa si no tienes un archivo ahí, y ábrelo cuando haya sido creado.");
        System.out.println("*Si quieres llamar a un archivo de una subcarpeta, separa cada carpeta con 2 diagonales inversas*");
        System.out.println("----------FIN DE AVISO----------");
        System.out.print("¿Usar combsort11 (menos ordenamientos, más comparaciones)? (true/false): ");
        boolean comb11Flag=Boolean.parseBoolean(br.readLine());
        System.out.print("Escribe el nombre del archivo a leer: ");
        numbers=file.readIntFile(br.readLine());
        sorted=combSort(numbers,comb11Flag);
        System.out.println("-----Arreglo final-----");
        printIntArray(sorted);
    }
}
