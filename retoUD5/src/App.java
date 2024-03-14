import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        puntoA();
    }

    public static void puntoA() {
        // mostrar directorio actual
        System.getProperty("user.did");

        // crear directorio; dirEjer2 (comprobar antes que existe)
        File fileUno = new File("dirEjer2//uno.txt");
        File fileDos = new File("dirEjer2//dos.txt");
        if (fileUno.exists()) {
            System.out.println("El fichero: " + fileUno.getName() + " ya existe");
        } else {
            fileUno.createNewFile();
        }
        if (fileDos.exists()) {
            System.out.println("El fichero: " + fileDos.getName() + " ya existe");
        } else {
            fileDos.createNewFile();
        }
    }

    // crear 2 ficheros uno.txt, dos.txt (comprobar exist)
public static void puntosBC() {
    String nombre;
    Scanner teclado= new Scanner(System.in);
    do {
        System.out.println("introduce nombre por pantalla");
        System.out.println("introduce - para finalizar");
        nombre= teclado.nextLine();
    } while (!nombre.equals("-")){
        escritor.write(nombre+"\n");
    
     } while (!nombre.equals("-"));
    } catch (IOException e) {
        System.out-System.err.println(e.getMessage());
    } finally
    teclado.close();
    if (escritor!=null) escritor.close();
}

BufferedReader lector=null;escritor=null;lector=new BufferedReader(new FileReader(fileName:"dirEjer2//uno.txt"));escritor=new BufferedWriter(new BufferedWriter(fileName:
    dirEjer2// dos.txt"));
    nombre = lector.readLine();while(lector!=null)
    {
        System.out.println(lector + "\n");
    }}catch(
    FileNotFoundException e)
    {
        System.out.println(e.Message());
    }catch(
    IOException e)
    {
        System.out.println(e.Message());
    }finally
    {
        if (lector != null)
            lector.close();
        if (escritor != null)
            escritor.close();
    }
}

}
