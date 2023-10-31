package co.edu.uniquindio.rabbit.consumer.controller.service;

public interface IModelFactoryService {
    void producirMensaje(String queue, String message);
}
