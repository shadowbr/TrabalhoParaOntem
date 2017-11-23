package org.shadowfest.identificador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*Os arquivos deverão usar as classes ObjectInputStream e ObjectOutputStream*/
/**
 *
 * @author Lucas Sombra!
 */
public class Arquivos {
    public static void salvarCliente (List<Cliente> c){
        try{
            FileOutputStream fos = new FileOutputStream("clientes.dat",false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(c);
            oos.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static List<Cliente>loadCliente (){
         try {
            FileInputStream fos = new FileInputStream("clientes.dat");
            ObjectInputStream ois = new ObjectInputStream(fos);
            List<Cliente> p = (List<Cliente>) ois.readObject();
            System.out.println(p);
            
            fos.close();
            ois.close();
            return p;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<Cliente>();
        } 
    }
    
    public static void salvarFesta (List<Festas> c){
        try{
            FileOutputStream fos = new FileOutputStream("festas.dat",false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(c);
            oos.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static List<Festas> loadFesta (){
         try {
            FileInputStream fos = new FileInputStream("festas.dat");
            ObjectInputStream ois = new ObjectInputStream(fos);
            List<Festas> p = (List<Festas>) ois.readObject();
            System.out.println(p);
            
            fos.close();
            ois.close();
            return p;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<Festas>();
        } 
    }
}
