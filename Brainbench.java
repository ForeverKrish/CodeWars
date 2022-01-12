import java.awt.EventQueue;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.text.JTextComponent;

class Brainbench { 

 public static void main(String[] args) throws IOException {

	 ByteArrayOutputStream baos = new ByteArrayOutputStream();
	ObjectOutputStream out = new ObjectOutputStream(baos);
	out.writeObject(new StringBuffer("Hello"));
	byte bArray[]=baos.toByteArray();
	
	System.out.println(bArray);
	
	int f = 2;
	int g = 5;
	double h;
	h = 3+f/g+2;
	System.out.println(h);
}
 

}

