package com.tcs.tallerListas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.tcs.tallerListas.beans.Estudiante;

public class IngresoEstudiantes {
	static ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

	public static void main(String[] args) {

		String[] estData = null;
		System.out.println("################ Ingreso de estudiantes ################");

		try {
			Scanner data = new Scanner(new File("src/main/resources/data.txt"));

			while (data.hasNextLine()) {
				estData = data.nextLine().split(",");
				estudiantes.add(new Estudiante(estData[0], estData[1], estData[2], estData[4], estData[3]));

			}
		} catch (FileNotFoundException e) {
			System.out.println("Lectura de archivo errónea" + e.getMessage());

		}
		System.out.println("El número de estudiantes es: " + estudiantes.size());
		System.out.println("El número de estudiantes entre 6 y 10 años son: " + InformacionEstudiantes.estudiantes6y10(estudiantes));
		InformacionEstudiantes.estudiantesGrado(estudiantes);
		InformacionEstudiantes.documentoTi(estudiantes);
		InformacionEstudiantes.repitente(estudiantes);
	}

}
