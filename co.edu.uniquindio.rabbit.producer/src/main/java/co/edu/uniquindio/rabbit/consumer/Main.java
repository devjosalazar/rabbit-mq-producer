package co.edu.uniquindio.rabbit.consumer;

import co.edu.uniquindio.rabbit.consumer.controller.ModelFactoryController;

import static co.edu.uniquindio.rabbit.consumer.util.Constantes.QUEUE_NUEVA_PUBLICACION;

public class Main {
    public static void main(String[] args) {
        ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();
        String mensaje = "";
        mensaje += "100;";
        mensaje += "NUEVO_PRODUCTO";
        modelFactoryController.producirMensaje(QUEUE_NUEVA_PUBLICACION, mensaje);
    }
}