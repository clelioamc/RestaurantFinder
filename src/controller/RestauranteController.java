package controller;

import java.util.ArrayList;
import java.util.List;
import model.Restaurante;
import dao.RestauranteDAO;

public class RestauranteController {

    private RestauranteDAO restauranteDAO;

    public RestauranteController() {
        this.restauranteDAO = new RestauranteDAO(); // Instancia a classe DAO
    }

    // Método para cadastrar um restaurante
    public void cadastrarRestaurante(Restaurante restaurante) {
        restauranteDAO.cadastrar(restaurante);
    }

    // Método para listar todos os restaurantes
    public List<Restaurante> listarRestaurantes() {
        return restauranteDAO.listarTodos();
    }

    // Método para buscar restaurante por nome
    public Restaurante buscarRestaurantePorNome(String nome) {
        return restauranteDAO.buscarPorNome(nome);
    }

    // Método para atualizar as informações de um restaurante
    public void atualizarRestaurante(Restaurante restaurante) {
        restauranteDAO.atualizar(restaurante);
    }

    // Método para excluir um restaurante pelo ID
    public void excluirRestaurante(int id) {
        restauranteDAO.excluir(id);
    }
}
