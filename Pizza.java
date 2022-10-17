import java.util.List;
import java.util.ArrayList;
public class Pizza {
    private List<String> sabores;
    private Double tamanho;
    private Boolean borda;
    private List<String> adicionais;

    public Pizza(Double tamanho, Boolean borda){
        sabores = new ArrayList<>();
        this.tamanho = tamanho;
        this.borda = borda;
        adicionais = new ArrayList<>();
    }

    public Double GetTamanho(){
        return tamanho;
    }

    public List<String> GetSabores(){
        return sabores;
    }

    public Boolean GetBorda(){
        return borda;
    }

    public List<String> GetAdicionais(){
        return adicionais;
    }

    public void AddSabores(String sabor){
        sabores.add( sabor );
    }

    public void AddAdicionais(String adicional){
        adicionais.add( adicional);
    }

    public void PrepararPizza(){}
    public void PreçoPizza(){}


}
