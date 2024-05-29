public class Cachorro extends Animal {
    private String raca;

    public Cachorro(int id, String nome, int idade, String especie, String raca) {
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
        return "Cachoro "+ getId() +" | "+ getNome() +" | "+ getIdade() +" Anos | "+ getEspecie() +" | Raça: "+ raca;
    }
}
