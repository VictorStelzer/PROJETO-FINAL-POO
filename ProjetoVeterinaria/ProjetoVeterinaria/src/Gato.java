public class Gato extends Animal {
    private String raca;

    public Gato(int id, String nome, int idade, String especie, String raca) {
        super(id, nome, idade, especie);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString(){
        return "Gato "+ getId() +" | "+ getNome() +" | "+ getIdade() +" Anos | "+ getEspecie() +" | Raça: "+ raca;
    }
}