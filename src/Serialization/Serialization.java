package Serialization;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) throws IOException {
		Hello obj = new Hello();
		obj.i = 10;
		File f = new File("/home/aravind.kumar@ameexusa.net/Documents/Program/hello.txt");
		FileOutputStream fo = new FileOutputStream(f);
		ObjectOutputStream dos = new ObjectOutputStream(fo);
		dos.writeObject(obj);
		System.out.println("Done");
	}
}

// Serializable is a marker class which doesn't contain any methods or variables
class Hello implements Serializable {
	int i;
}
