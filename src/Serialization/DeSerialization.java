package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f=new File("/home/aravind.kumar@ameexusa.net/Documents/Program/hello.txt");
		FileInputStream fi=new FileInputStream(f);
		ObjectInputStream oi=new ObjectInputStream(fi);
		Hello h=(Hello) oi.readObject();
		System.out.println(h.i);
	}
}

 