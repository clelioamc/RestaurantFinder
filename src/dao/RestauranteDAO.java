package dao;

import java.util.ArrayList;
import java.util.List;
import model.Restaurante;

public class RestauranteDAO {

    private List<Restaurante> restaurantes = new ArrayList<>();

    // Método para cadastrar um restaurante
    public void cadastrar(Restaurante restaurante) {
        restaurantes.add(restaurante);
    }

    // Método para listar todos os restaurantes
    public List<Restaurante> listarTodos() {
        return new ArrayList<>(restaurantes); // Retorna uma cópia da lista
    }

    // Método para buscar restaurante por nome
    public Restaurante buscarPorNome(String nome) {
        for (Restaurante restaurante : restaurantes) {
            if (restaurante.getNome().equalsIgnoreCase(nome)) {
                return restaurante;
            }
        }
        return null; // Caso não encontre
    }

    // Método para atualizar as informações de um restaurante
    public void atualizar(Restaurante restaurante) {
        for (int i = 0; i < restaurantes.size(); i++) {
            if (restaurantes.get(i).getId() == restaurante.getId()) {
                restaurantes.set(i, restaurante);
                return;
            }
        }
    }

    // Método para excluir um restaurante pelo ID
    public void excluir(int id) {
        restaurantes.removeIf(restaurante -> restaurante.getId() == id);
    }
}