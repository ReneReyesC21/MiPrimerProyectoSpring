package com.reyeda.screenmatch.services;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);
}
