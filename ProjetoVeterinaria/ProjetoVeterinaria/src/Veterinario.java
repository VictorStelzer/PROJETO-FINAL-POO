public class Veterinario {
    private String nome;
    private String email;
    private String vocacao;

    public Veterinario(String nome, String email, String vocacao) {
        this.nome = nome;
        this.email = email;
        this.vocacao = vocacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVocacao() {
        return vocacao;
    }

    public void setVocacao(String vocacao) {
        this.vocacao = vocacao;
    }

    @Override
    public String toString() {
        return "Veterinário = "+ nome +" | "+ email +" | "+ vocacao;
    }
}

