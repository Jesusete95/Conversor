/*
 * @author: Jesús Higueras
 * @version: 1.0
 * */

public class conversor {
	final static double LIBRAS_POR_KILOGRAMO = 0.45359;
	final static double PIES_POR_METROS = 0.30480;
	final static double YARDAS_POR_METROS = 0.91440;
	final static double MILLAS_POR_METROS = 1609.3;
	final static double ACRES_POR_HECTAREAS = 0.40469;
	final static double ONZAS_POR_MILILITROS = 29.574;
	final static double GALONES_POR_LITROS =3.7854;
	public static void main (String args[]) {
		{
//Libras por kilogramo
		double libras =1;
		double kilogramo;
		kilogramo = LIBRAS_POR_KILOGRAMO*libras;
		System.out.println(+ libras + " libras son: " + kilogramo + " kilogramos. ");
		}
		{
//Pies por metros
        double pies =1;
        double metros;
        metros = PIES_POR_METROS*pies;
        System.out.println(+ pies + " pies son: " + metros + " metros. ");
		}
		{
//Yardas por metros
        double yardas =1;
        double metros;
        metros = YARDAS_POR_METROS*yardas;
        System.out.println(+ yardas + " yardas son: " + metros + " metros. ");
		}
		{
//Millas por metros
        double millas =1;
        double metros;
        metros = MILLAS_POR_METROS*millas;
        System.out.println(+ millas + " millas son: " + metros + " metros. ");
		}
		{
//Acres por hectáreas
        double acres =1;
        double hectareas;
        hectareas = ACRES_POR_HECTAREAS*acres;
        System.out.println(+ acres + " acres son: " + hectareas + " hectareas. ");
		}
		{
//Onzas por mililitros
        double onzas =1;
        double mililitros;
        mililitros = ONZAS_POR_MILILITROS*onzas;
        System.out.println(+ onzas + " onzas son: " + mililitros + " mililitros. ");
		}
		{
//Galones por litros
        double galones =1;
        double litros;
        litros = GALONES_POR_LITROS*galones;
        System.out.println(+ galones + " galones son: " + litros + " litros. ");
		}
	}
}

