
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NevesRibeiro
 */
public class banco {
    public String nome;
    private List <Conta> Contas;

    public List<Conta> getContas() {
        return Contas;
    }

    public void setContas(List<Conta> Contas) {
        this.Contas = Contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
