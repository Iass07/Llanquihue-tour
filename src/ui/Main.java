package ui;

import data.GestorDatos;
import model.Tour;
import service.TourService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> tours =
                gestor.cargarTours("resources/tours.txt");

        TourService servicio = new TourService();

        System.out.println("=== LISTA DE TOURS ===");
        servicio.mostrarTours(tours);

        servicio.buscarPorTipo(tours, "Cultural");
    }
}
