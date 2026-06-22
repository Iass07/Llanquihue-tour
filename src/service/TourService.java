package service;

import model.Tour;

import java.util.ArrayList;

public class TourService {

    public void mostrarTours(ArrayList<Tour> tours) {

        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }

    public void buscarPorTipo(ArrayList<Tour> tours, String tipoBuscado) {

        System.out.println("\nTours encontrados:");

        for (Tour tour : tours) {

            if (tour.getTipo().equalsIgnoreCase(tipoBuscado)) {
                System.out.println(tour);
            }
        }
    }
}
