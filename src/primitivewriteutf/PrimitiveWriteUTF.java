package primitivewriteutf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Julian
 */
public class PrimitiveWriteUTF {

    public static void main(String[] args) throws IOException {
        File texto3 = new File("/home/oracle/Documents/texto3.txt");

        FileOutputStream salida = new FileOutputStream(texto3, true);
        BufferedOutputStream bout = new BufferedOutputStream(salida);
        DataOutputStream dataout = new DataOutputStream(bout);

        FileInputStream entrada = new FileInputStream(texto3);
        BufferedInputStream bin = new BufferedInputStream(entrada);
        DataInputStream datain = new DataInputStream(bin);

        dataout.writeUTF("Esto es una cadena\n");
        System.out.println("Graba " + dataout.size());
        dataout.writeUTF("Esto es una cadena\n");
        System.out.println("Graba " + dataout.size());

        dataout.close();

        while (datain.available() != 0) {
            System.out.println("Lendo o UTF \n" + datain.readUTF()+"Disponibles "+datain.available());

        }

        datain.close();

    }

}
