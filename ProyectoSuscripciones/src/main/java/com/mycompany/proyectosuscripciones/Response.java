package com.mycompany.proyectosuscripciones;

import Models.Entities.User;

import java.io.Serializable;

/**
 *
 * @author Link
 */
public class Response implements Serializable {
    private String resp;
    private User usuario;

    public Response() {
    }

    public Response(String resp, User usuario) {
        this.resp = resp;
        this.usuario = usuario;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "resp=" + resp + ", usuario=" + usuario + '}';
    }

}
