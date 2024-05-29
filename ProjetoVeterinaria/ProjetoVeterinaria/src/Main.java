import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> animais = new ArrayList<>();
        int op;

        do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Adicionar um Animal");
            System.out.println("2. Ver animais");
            System.out.println("3. Excluir um animal");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    novoAnimal.adicionarAnimal(sc, animais);
                    break;
                case 2:
                    verAnimais.exibirAnimais(animais);
                    break;
                case 3:
                    excluirAnimal.removerAnimal(sc, animais);
                    break;
                case 4:
                    System.out.println("Fechando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println(); // linha em branco para melhor leitura
        } while (op != 4);

        sc.close();
    }

    public static class novoAnimal {
        public static void adicionarAnimal(Scanner sc, List<Animal> animais){
            System.out.println("Escolha o tipo de animal:");
            System.out.println("1. Cachorro");
            System.out.println("2. Gato");
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Espécie: ");
            String especie = sc.nextLine();
            System.out.print("Raça: ");
            String raca = sc.nextLine();

            if (tipo == 1) {
                Cachorro cachorro = new Cachorro(id, nome, idade, especie, raca);
                animais.add(cachorro);
                System.out.println("Cachorro adicionado com sucesso!");
            } else if (tipo == 2) {
                Gato gato = new Gato(id, nome, idade, especie, raca);
                animais.add(gato);
                System.out.println("Gato adicionado com sucesso!");
            } else {
                System.out.println("Tipo de animal inválido. Tente novamente.");
            }
        }
    }

    public static class verAnimais {
        public static void exibirAnimais(List<Animal> animais) {
            if (animais.isEmpty()) {
                System.out.println("Nenhum animal no catalogo..");
            } else {
                System.out.println("\nAnimais adicionados: ");
                for (Animal animal : animais) {
                    System.out.println(animal);
                }
            }
        }
    }

    public static class excluirAnimal {
        public static void removerAnimal(Scanner sc, List<Animal> animais) {
            System.out.println("O animal com este ID será removido..");
            int id = sc.nextInt();

            Iterator<Animal> iterator = animais.iterator();
            boolean animalRemovido = false;
            while(iterator.hasNext()) {
                Animal animal = iterator.next();
                if (animal.getId() == id) {
                    iterator.remove();
                    animalRemovido = true;
                    System.out.println("Animal removido com sucesso!");
                    break;
                }
            }
            if(!animalRemovido) {
                System.out.println("Animal não encontrado!");
            }
        }
    }
}