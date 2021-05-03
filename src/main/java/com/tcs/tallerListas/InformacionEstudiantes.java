package com.tcs.tallerListas;

import java.util.ArrayList;

import com.tcs.tallerListas.beans.Estudiante;

public class InformacionEstudiantes {
	static ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	static ArrayList<Estudiante> estudianteJardin = new ArrayList<Estudiante>();
	static ArrayList<Estudiante> estudiantePrimero = new ArrayList<Estudiante>();
	static ArrayList<Estudiante> estudianteSegundo = new ArrayList<Estudiante>();
	static ArrayList<Estudiante> estudianteTercero = new ArrayList<Estudiante>();
	static ArrayList<Estudiante> estudianteCuarto = new ArrayList<Estudiante>();
	static ArrayList<Estudiante> estudianteQuinto = new ArrayList<Estudiante>();

	public static int estudiantes6y10(ArrayList<Estudiante> arrayEstudiante) {
		int numEstudiantes = 0;
		for (Estudiante estudiante : arrayEstudiante) {
			
			try {
				if (Integer.parseInt(estudiante.getEdad()) >= 6 && Integer.parseInt(estudiante.getEdad()) <= 10) {
					numEstudiantes++;
				}
			} catch (Exception e) {
				System.out.println("Error en conversion" + e.getMessage());
			}

		}
		return numEstudiantes;
	}

	public static void estudiantesGrado(ArrayList<Estudiante> arrayEstudiante) {
		for (Estudiante estudiante : arrayEstudiante) {
			String grado = estudiante.getGradoCursar();
			switch (grado) {
			case "Jardin":
				estudianteJardin.add(new Estudiante(estudiante.getNombre(), estudiante.getGradoCursar()));
				break;
			case "Primero":
				estudiantePrimero.add(new Estudiante(estudiante.getNombre(), estudiante.getGradoCursar()));
				break;
			case "Segundo":
				estudianteSegundo.add(new Estudiante(estudiante.getNombre(), estudiante.getGradoCursar()));
				break;
			case "Tercero":
				estudianteTercero.add(new Estudiante(estudiante.getNombre(), estudiante.getGradoCursar()));
				break;
			case "Cuarto":
				estudianteCuarto.add(new Estudiante(estudiante.getNombre(), estudiante.getGradoCursar()));
				break;
			case "Quinto":
				estudianteQuinto.add(new Estudiante(estudiante.getNombre(), estudiante.getGradoCursar()));
				break;

			default:
				System.out.println("La información no contiene un grado válido");
				break;
			}

		}

		estudiantesPorGrado(estudianteJardin, "Jardín");
		estudiantesPorGrado(estudiantePrimero, "Primero");
		estudiantesPorGrado(estudianteSegundo, "Segundo");
		estudiantesPorGrado(estudianteTercero, "Tercero");
		estudiantesPorGrado(estudianteCuarto, "Cuarto");
		estudiantesPorGrado(estudianteQuinto, "Quinto");

	}

	public static void estudiantesPorGrado(ArrayList<Estudiante> arrayGrado, String grado) {
		System.out.println("Los estudiantes de " + grado + " son:");
		for (Estudiante estudiantesPorGrado : arrayGrado) {
			System.out.println("Nombre: " + estudiantesPorGrado.getNombre());
		}
		System.out.println("//////////////////////////////////// \n");
	}

	public static void documentoTi(ArrayList<Estudiante> arrayEstudiante) {
		System.out.println("Estudiantes con docuemnto TI: ");
		for (Estudiante estudianteTI : arrayEstudiante) {
			if (estudianteTI.getIdentificacion().substring(0, 2).equals("TI")) {
				System.out
						.println("Edad: " + estudianteTI.getEdad() + " su grado es: " + estudianteTI.getGradoCursar());

			}

		}
		System.out.println("//////////////////////////////////// \n");
	}

	public static void repitente(ArrayList<Estudiante> arrayEstudiante) {
		System.out.println("Los estudiantes que repiten son: ");
		for (Estudiante estudiante : arrayEstudiante) {
			if (estudiante.getRepite().equals("si")) {
				System.out.println(estudiante.getNombre());
			}

		}

	}
}
