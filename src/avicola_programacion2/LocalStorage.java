
package avicola_programacion2;

import java.io.*;


public class LocalStorage {

    public static void setObject(String fileName, Object object) {
        try
        {
            FileOutputStream archivoContenedor = new FileOutputStream(fileName);
            ObjectOutputStream objSalida = new ObjectOutputStream(archivoContenedor);
            objSalida.writeObject(object);
            objSalida.close();
            archivoContenedor.close();
            System.out.println("Objeto guardado en " + fileName);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static Object getObject(String fileName) {
        Object object = null;
        try
        {
            FileInputStream archivoContenedor = new FileInputStream(fileName);
            ObjectInputStream objExtraido = new ObjectInputStream(archivoContenedor);
            object = objExtraido.readObject();
            objExtraido.close();
            archivoContenedor.close();
            System.out.println("Objeto recuperado desde " + fileName);
        } catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return object;
    }

}
