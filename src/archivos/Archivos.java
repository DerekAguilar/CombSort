/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Adrus Elric
 */
public class Archivos {
    // Cuenta de líneas para tamaño de Array
    private int countLines(String name) {
        File archivo; // Apunta a un archivo físico dentro del disco duro
        FileReader fr; // Llave para tener acceso al archivo
        BufferedReader br; // Bufer para leer datos desde diversas fuentes (teclado, archivos, etc.)
        int numLineas=0;
        try{
            // Crear apuntador al achivo físico
            archivo=new File("C:\\"+"Users\\"+"Public\\"+"Documents\\"+name+".txt");
            //archivo=new File("D:\\"+name+".txt"); Separar cada carpeta del directorio
            // Abrir archivo para lectura
            fr=new FileReader(archivo);
            // Configura br para leer datos del archivo
            br=new BufferedReader (fr);
            
            // Asignar tamaño de arreglo con líneas del archivo
            while((br.readLine()) != null)
                numLineas++;
            br.close();
        } catch (IOException e){
            System.out.println("Error al abrir el archivo, Erm: "+e.toString());
        }
        return numLineas;
    }
    
    // Lectura y escritura de datos a un array por tipo
    public String[] readStringFile(String name) throws IOException{
        File archivo; // Apunta a un archivo físico dentro del disco duro
        FileReader fr; // Llave para tener acceso al archivo
        BufferedReader br; // Bufer para leer datos desde diversas fuentes (teclado, archivos, etc.)
        String linea;
        String[] arreglo=null;
        int index=0;
        try{
            // Crear apuntador al achivo físico
            archivo=new File("C:\\"+"Users\\"+"Public\\"+"Documents\\"+name+".txt");
            // Abrir archivo para lectura
            fr=new FileReader(archivo);
            br=new BufferedReader (fr); // Configura br para leer datos del archivo
            
            arreglo=new String[countLines(name)];
            
            // Mientras haya contenido, leer e imprimir
            while((linea=br.readLine()) != null){
                arreglo[index]=linea;
                index++;
            }
            br.close();
        } catch (IOException e){
            System.out.println("Error al abrir el archivo, Erm: "+e.toString());
        } 
        return arreglo;
    }
    
    public int[] readIntFile(String name) throws IOException{
        File archivo; // Apunta a un archivo físico dentro del disco duro
        FileReader fr; // Llave para tener acceso al archivo
        BufferedReader br; // Bufer para leer datos desde diversas fuentes (teclado, archivos, etc.)
        String linea;
        int[] arreglo=null;
        int index=0;
        
        try{
            // Crear apuntador al achivo físico
            archivo=new File("C:\\"+"Users\\"+"Public\\"+"Documents\\"+name+".txt");
            // Abrir archivo para lectura
            fr=new FileReader(archivo);
            // Configura br para leer datos del archivo
            br=new BufferedReader (fr);
            
            arreglo=new int[countLines(name)];
            
            // Asignar cada slot con la información
            while((linea=br.readLine()) != null){
                arreglo[index]=Integer.parseInt(linea);
                index++;
            }
            br.close();
        } catch (IOException | NumberFormatException e){
            System.out.println("Error al abrir el archivo, Erm: "+e.toString());
        } 
        return arreglo;
    }
    
    public double[] readDoubleFile(String name) throws IOException{
        File archivo; // Apunta a un archivo físico dentro del disco duro
        FileReader fr; // Llave para tener acceso al archivo
        BufferedReader br; // Bufer para leer datos desde diversas fuentes (teclado, archivos, etc.)
        String linea;
        double[] arreglo=null;
        int index=0;
        
        try{
            // Crear apuntador al achivo físico
            archivo=new File("C:\\"+"Users\\"+"Public\\"+"Documents\\"+name+".txt");
            // Abrir archivo para lectura
            fr=new FileReader(archivo);
            // Configura br para leer datos del archivo
            br=new BufferedReader (fr);
            
            arreglo=new double[countLines(name)];
            
            // Asignar cada slot con la información
            while((linea=br.readLine()) != null){
                arreglo[index]=Integer.parseInt(linea);
                index++;
            }
            br.close();
        } catch (IOException | NumberFormatException e){
            System.out.println("Error al abrir el archivo, Erm: "+e.toString());
        } 
        return arreglo;
    }
    
    public boolean[] readBooleanFile(String name) throws IOException{
        File archivo; // Apunta a un archivo físico dentro del disco duro
        FileReader fr; // Llave para tener acceso al archivo
        BufferedReader br; // Bufer para leer datos desde diversas fuentes (teclado, archivos, etc.)
        String linea;
        boolean[] arreglo=null;
        int index=0;
        
        try{
            // Crear apuntador al achivo físico
            archivo=new File("C:\\"+"Users\\"+"Public\\"+"Documents\\"+name+".txt");
            // Abrir archivo para lectura
            fr=new FileReader(archivo);
            // Configura br para leer datos del archivo
            br=new BufferedReader (fr);
            
            arreglo=new boolean[countLines(name)];
            
            // Asignar cada slot con la información
            while((linea=br.readLine()) != null){
                arreglo[index]=Boolean.parseBoolean(linea);
                index++;
            }
            br.close();
        } catch (IOException | NumberFormatException e){
            System.out.println("Error al abrir el archivo, Erm: "+e.toString());
        } 
        return arreglo;
    }

    public char[] readCharFile(String name) throws IOException{
        File archivo; // Apunta a un archivo físico dentro del disco duro
        FileReader fr; // Llave para tener acceso al archivo
        BufferedReader br; // Bufer para leer datos desde diversas fuentes (teclado, archivos, etc.)
        String linea;
        char[] arreglo=null;
        int index=0;
        
        try{
            // Crear apuntador al achivo físico
            archivo=new File("C:\\"+"Users\\"+"Public\\"+"Documents\\"+name+".txt");
            // Abrir archivo para lectura
            fr=new FileReader(archivo);
            // Configura br para leer datos del archivo
            br=new BufferedReader (fr);
            
            arreglo=new char[countLines(name)];
            
            // Asignar cada slot con la información
            while((linea=br.readLine()) != null){
                arreglo[index]=linea.charAt(0);
                index++;
            }
            br.close();
        } catch (IOException | NumberFormatException e){
            System.out.println("Error al abrir el archivo, Erm: "+e.toString());
        } 
        return arreglo;
    }    
    
    // Escritura de un arreglo a un archivo por tipo
    public void saveIntData(String name,int[] array) throws IOException{
        FileWriter fw;
        PrintWriter pw;
        
        try {
            fw=new FileWriter("C:\\"+"Users\\"+"Public\\"+"Documents\\"+name+".txt");
            pw=new PrintWriter(fw);
            for(int item : array)
                pw.println(item);
            
            // Cerrar archivo
            fw.close();
        } catch (IOException e){
            System.out.println("Error al escribir en el archivo "+name+": "+e.toString());
        }
    }
    
    public void saveDoubleData(String name,double[] array) throws IOException{
        FileWriter fw;
        PrintWriter pw;
        
        try {
            fw=new FileWriter("C:\\"+"Users\\"+"Public\\"+"Documents\\"+name+".txt");
            pw=new PrintWriter(fw);
            for(double item : array)
                pw.println(item);
            
            // Cerrar archivo
            fw.close();
        } catch (IOException e){
            System.out.println("Error al escribir en el archivo "+name+": "+e.toString());
        }
    }
    
    public void saveBooleanData(String name,boolean[] array) throws IOException{
        FileWriter fw;
        PrintWriter pw;
        
        try {
            fw=new FileWriter("C:\\"+"Users\\"+"Public\\"+"Documents\\"+name+".txt");
            pw=new PrintWriter(fw);
            for(boolean item : array)
                pw.println(item);
            
            // Cerrar archivo
            fw.close();
        } catch (IOException e){
            System.out.println("Error al escribir en el archivo "+name+": "+e.toString());
        }
    }
    
    public void saveCharData(String name,char[] array) throws IOException{
        FileWriter fw;
        PrintWriter pw;
        
        try {
            fw=new FileWriter("C:\\"+"Users\\"+"Public\\"+"Documents\\"+name+".txt");
            pw=new PrintWriter(fw);
            for(char item : array)
                pw.println(item);
            
            // Cerrar archivo
            fw.close();
        } catch (IOException e){
            System.out.println("Error al escribir en el archivo "+name+": "+e.toString());
        }
    }
    
    public void saveStringData(String name,String[] array) throws IOException{
        FileWriter fw;
        PrintWriter pw;
        
        try {
            fw=new FileWriter("C:\\"+"Users\\"+"Public\\"+"Documents\\"+name+".txt");
            pw=new PrintWriter(fw);
            for(String item : array)
                pw.println(item);
            
            // Cerrar archivo
            fw.close();
        } catch (IOException e){
            System.out.println("Error al escribir en el archivo "+name+": "+e.toString());
        }
    }
    
    // Escritura manual a un archivo de nombre personalizado (no considera tipos)
    public void writeFile(String name) throws IOException{
        // Función para escribir dentro de un archivo
        FileWriter fw;
        PrintWriter pw;
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        char ans;
        
        try {
            fw=new FileWriter("C:\\"+"Users\\"+"Public\\"+"Documents\\"+name+".txt");
            pw=new PrintWriter(fw);
            do{
                System.out.println("Puedes escribir. Termina pulsando enter.");
                // Agregar entrada al archivo en disco
                pw.println(br.readLine());
                
                System.out.println("Escribe n para parar o cualquiera para seguir");
                ans=br.readLine().charAt(0); // Si falla, probar poner paréntesis a br.readLine
            } while (ans!='n');
            // Cerrar archivo
            fw.close();
        } catch (IOException e){
            System.out.println("Error al escribir en el archivo "+name+": "+e.toString());
        }
    }
}
