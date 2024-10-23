package test;

import controller.RestauranteController;
import model.Restaurante;

public class TesteRestaurante {
    public static void main(String[] args) {
        RestauranteController controller = new RestauranteController();

        // Criando e cadastrando restaurantes
        Restaurante r1 = new Restaurante(1, "Restaurante A", "Rua 123", "Italiana", 4.5);
        Restaurante r2 = new Restaurante(2, "Restaurante B", "Rua 456", "Japonesa", 4.2);
        Restaurante r3 = new Restaurante(3, "Restaurante C", "Avenida 789", "Brasileira", 4.8);

        controller.cadastrarRestaurante(r1);
        controller.cadastrarRestaurante(r2);
        controller.cadastrarRestaurante(r3);

        // Listando todos os restaurantes cadastrados
        System.out.println("Lista de todos os restaurantes:");
        controller.listarRestaurantes().forEach(System.out::println);

        // Buscando restaurante pelo nome
        System.out.println("\nBuscando restaurante por nome 'Restaurante B':");
        Restaurante restauranteEncontrado = controller.buscarRestaurantePorNome("Restaurante B");
        System.out.println(restauranteEncontrado != null ? restauranteEncontrado : "Restaurante não encontrado");

        // Atualizando informações de um restaurante
        r2.setAvaliacao(4.7); // Atualizando a avaliação do Restaurante B
        controller.atualizarRestaurante(r2);
        System.out.println("\nRestaurante B atualizado:");
        System.out.println(controller.buscarRestaurantePorNome("Restaurante B"));

        // Excluindo um restaurante
        controller.excluirRestaurante(1); // Excluindo Restaurante A
        System.out.println("\nLista de restaurantes após exclusão do Restaurante A:");
        controller.listarRestaurantes().forEach(System.out::println);
    }
}
