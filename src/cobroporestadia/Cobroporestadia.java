
package cobroporestadia;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Cobroporestadia {

    
    public static void main(String[] args)throws IOException {
       //Declaracion de variables e inicio de archivo en donde se guardará lo registrado 
        Scanner entrada = new Scanner ( System.in);
        ObjectOutputStream datosEstudiante = null;
        ObjectInputStream lecturaDatosEstudiante = null;
        Estudiante estudiante = null;
        Aprobados aprobados = null;
        Reprobados reprobados = null;
        char respuesta ='s';
        int opcmenupri;
        
//try y catch para solventar cualquier error en la escritura y lectura del archivo
        try {
            if (Files.exists(Paths.get("datos_estudiantes.txt"))) {
                datosEstudiante = new AppendingObjectOutputStream(Files.newOutputStream(Paths.get("datos_estudiantes.txt"), StandardOpenOption.APPEND));
            }
            else {
               
                datosEstudiante = new ObjectOutputStream(Files.newOutputStream(Paths.get("datos_estudiantes.txt")));
            }
              System.out.println("-----ANÁLISIS DE DATOS DE ESTUDIANTES-----");
              
            System.out.println("Seleccione su opción");
        
        System.out.println(" 01.        Ingreso de datos");
        
        System.out.println(" 02.        Análisis de datos");
        
        System.out.println(" 03.        Salir");
       opcmenupri = entrada.nextInt();
         
           if (opcmenupri == 1){
            do {
                //creacion de nuevo objeto estudiante
                  estudiante = new Estudiante();
                
                
           //Datos a recolectar 
               System.out.println("-----DATOS DEL ESTUDIANTE-----");
               System.out.println("INGRESE LO QUE SE LE PIDA");
               System.out.println("----------------------");
               System.out.println("Nombres:");
               estudiante.setDd(entrada.nextLine());
               estudiante.setNombres(entrada.nextLine());
               System.out.println("Apellidos:");
               estudiante.setApellidos(entrada.nextLine());
               System.out.println("Número de carné:");
               estudiante.setCarne(entrada.nextLine());
               System.out.println("Ingrese edad: ");
               estudiante.setEdad(Integer.valueOf(entrada.nextLine()));
               System.out.println("Sexo:");
               estudiante.setSexo(entrada.nextLine());
               System.out.println("Carrera:");
               estudiante.setCarrera(entrada.nextLine());
               System.out.println("Total de créditos:");
               estudiante.setTotalCreditos(Integer.valueOf(entrada.nextLine()));
               System.out.println("Cantidad de cursos aprobados:");
               estudiante.setCantidadCursosAprobados(Integer.valueOf(entrada.nextLine()));
               // creacion de nuevo objeto aprobados
               aprobados = new Aprobados();
               // datos a registrar en el objeto
                System.out.println("INGRESE LOS DATOS PARA LOS CURSOS APROBADOS");
                 System.out.println("Semestre: ");
                 aprobados.setSemestreA(entrada.nextInt());
                  System.out.println("Nombre del Curso: ");
                  aprobados.setNombreA(entrada.nextLine());
                   System.out.println("Código: ");
                  aprobados.setCodigoA(entrada.nextInt());
                    System.out.println("Zona: ");
                    aprobados.setZonaA(entrada.nextInt());
                     System.out.println("Examen Final: ");
                     aprobados.setExamenFinalA(entrada.nextInt());
                      System.out.println("Fecha: ");
                      aprobados.setFechaA(entrada.nextLine());
                //creación de nuevo objeto reprobados      
                reprobados = new Reprobados();
                // datos a regidtrar en el objeto
                 System.out.println("INGRESE LOS DATOS PARA LOS CURSOS REPROBADOS");
                 System.out.println("Semestre: ");
                 reprobados.setSemestreR(entrada.nextInt());
                  System.out.println("Nombre del Curso: ");
                  reprobados.setNombreR(entrada.nextLine());
                   System.out.println("Código: ");
                  reprobados.setCodigoR(entrada.nextInt());
                    System.out.println("Zona: ");
                    reprobados.setZonaR(entrada.nextInt());
                     System.out.println("Examen Final: ");
                     reprobados.setExamenFinalR(entrada.nextInt());
                      System.out.println("Fecha: ");
                      reprobados.setFechaR(entrada.nextLine());
               //registrar los datos de los objetos en el archivo
               datosEstudiante.writeObject(estudiante);
               datosEstudiante.writeObject(aprobados);
               datosEstudiante.writeObject(reprobados);
               System.out.println("Ingreso de datos registrados");
               

                  System.out.println("¿Desea ingresar más datos? (s/n) ");
                respuesta = entrada.nextLine().toLowerCase().charAt(0); 
            
            
                
                }while (respuesta == 's');
            //cierra el archivo
            datosEstudiante.close();
            
                 
           }
           else {
               if (opcmenupri ==2){
                   System.out.println("Esta parte no la pude realziar debido a poca comprención respecto\n"
                           + " a los nuevos temas implementados pocos dias antes del examen final y falta de tiempo");
               }
               
           }
            
        } catch (IOException ioException) {
            System.err.println("Error al ingresar datos en el archivo. " + ioException.toString());
        }
         
        
        try {
            lecturaDatosEstudiante = new ObjectInputStream(Files.newInputStream(Paths.get("datos_estudiantes.txt")));
            
           while (true){
                estudiante = (Estudiante) lecturaDatosEstudiante.readObject();
                
                System.out.println("NOMBRES:                      " + estudiante.getNombres());
                System.out.println("APELLIDOS:                    " + estudiante.getApellidos());
                System.out.println("CARNÉ No.:                    " + estudiante.getCarne());
                System.out.println("EDAD:                         " + estudiante.getEdad());
                System.out.println("SEXO:                         " + estudiante.getSexo());
                System.out.println("CARRERA:                      " + estudiante.getCarrera());
                System.out.println("TOTAL DE CRÉDITOS:            " + estudiante.getTotalCreditos()); 
                System.out.println("CANTIDAD DE CURSOS APROBADOS: " + estudiante.getCantidadCursosAprobados());      
              
             
        
                aprobados = (Aprobados) lecturaDatosEstudiante.readObject();
                System.out.println("Semestre:     " + aprobados.getSemestreA());
                System.out.println("Nombre:       " + aprobados.getNombreA());
                System.out.println("Código:       " + aprobados.getCodigoA());
                System.out.println("Zona:         " + aprobados.getZonaA());
                System.out.println("Examen Final: " + aprobados.getExamenFinalA());
                System.out.println("Fecha:        " + aprobados.getFechaA());
              
                
                reprobados = (Reprobados) lecturaDatosEstudiante.readObject();
                System.out.println("Semestre:     " + reprobados.getSemestreR());
                System.out.println("Nombre:       " + reprobados.getNombreR());
                System.out.println("Código:       " + reprobados.getCodigoR());
                System.out.println("Zona:         " + reprobados.getZonaR());
                System.out.println("Examen Final: " + reprobados.getExamenFinalR());
                System.out.println("Fecha:        " + reprobados.getFechaR());
               
                
           }
                
            
        } 
        catch (EOFException endOfFileException) {
            System.out.printf("%s%n", "No hay más registros");
        }
        catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Tipo de objeto inválido.");
        }
        catch (IOException ioException) {
            System.err.println("Error al leer archivo. : " + ioException.getMessage());
        } finally {
            lecturaDatosEstudiante.close();
        }
       
       
                  
            
           
           
       }
       
    }

    
    

