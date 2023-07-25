package com.paginaDemo.demo.dao;

import com.paginaDemo.demo.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    Usuario obtenerUserPorCredenciales(Usuario usuario);
}
