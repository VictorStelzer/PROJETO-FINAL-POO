public class Animal {
    private int id;
    private String nome;
    private int idade;
    private String especie;


    public Animal(int id, String nome, int idade, String especie){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie(){
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString(){
        return "Animal "+ id +" | "+ nome +" | "+ idade +" Anos | "+ especie;
    }
}
