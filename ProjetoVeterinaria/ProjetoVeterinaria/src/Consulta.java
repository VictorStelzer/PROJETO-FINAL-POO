import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private Dono dono;
    private Veterinario veterinario;
    private Animal animal;
    private String motivo;
    private int data;

    public Consulta(Dono dono, Veterinario veterinario, Animal animal, String motivo, int data) {
        this.dono = dono;
        this.veterinario = veterinario;
        this.animal = animal;
        this.motivo = motivo;
        this.data = data;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo){
        this.motivo = motivo;
    }

    public int getData(){
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nConsulta (Dia: "+ data +")\nDono: "+ dono +"\nVeterinário: "+ veterinario +"\nAnimal: "+ animal +"\nMotivo: " + motivo;
    }

    public static void main(String[] args) {
        Dono dono1 = new Dono("João", "joao@gmail.com");
        Veterinario veterinario1 = new Veterinario("Dr. Silva", "dr.sival@veterinaria.com", "Tosador");
        Cachorro cachorro1 = new Cachorro( 1, "Rex", 3, "Canina", "Labrador");

        Dono dono2 = new Dono("Victor", "victorstelzer@gmail.com");
        Gato gato1 = new Gato(25, "Lilica", 4, "Felina", "Siamês");

        Consulta consulta1 = new Consulta(dono1, veterinario1, cachorro1, "Tosa", 28052024);
        Consulta consulta2 = new Consulta(dono2, veterinario1, gato1, "Tosa", 29052024);

        System.out.println(consulta1);
        System.out.println(consulta2);
    }
}