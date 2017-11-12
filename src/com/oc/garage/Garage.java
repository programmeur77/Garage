package com.oc.garage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Vehicule> ListeVoiture = new ArrayList<Vehicule> ();

	public String toString(){
        String str = "";      
        str += "***************************\n";
        str += "*  Garage OpenClassrooms  *\n";
        str += "***************************";
        return str;
    }
	
	public void addVoiture(Vehicule voiture) {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("garage.gg"))));
			
			ListeVoiture.add(voiture);
			oos.writeObject(voiture);
			
			oos.close();
			
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(
									new File("garage.gg"))));
			
			try {
				System.out.println(((Vehicule)ois.readObject()).toString());
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			ois.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null)
					oos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			try {
				if(ois != null)
					ois.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
