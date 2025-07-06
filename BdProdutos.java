// Aluno : Nuno Guerra - RA : a2706504
import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BdProdutos {
    private Cafe cafe;
    private List<Cafe> bdCafe;
    private static BdProdutos gcaUnic;
    
    private Bolo bolo;
    private List<Bolo> bdBolo;
    
    private Salgado salg;
    private List<Salgado> bdSalgado;
    
    private BdProdutos(){
        cafe = new Cafe();
        bdCafe = new ArrayList<Cafe>();
        bolo = new Bolo();
        bdBolo = new ArrayList<Bolo>();
        salg = new Salgado();
        bdSalgado = new ArrayList<Salgado>();
    }
    
    // Método Singleton
    public static BdProdutos geraBdProdutos(){
        if(gcaUnic == null){
            gcaUnic = new BdProdutos();
        }
        return gcaUnic;
    }
    
    public List<Cafe> getBdCafe(){
        return bdCafe;
    }
    
    public Cafe consCafe(Cafe cafe){
        for (int count = 0; count < bdCafe.size(); count++){
            if(cafe.getNome().equals(bdCafe.get(count).getNome())){
                return bdCafe.get(count);
            }
        }
        return null;
    } // fim consCafe
    
    public Cafe insCafe(Cafe cafe){
        if(consCafe(cafe) == null){
            bdCafe.add(cafe);
            return cafe;
        } else {
            return null;
        }
    } // fim insCafe
    
    public Cafe delCafe(Cafe cafe){
        Cafe cafe1 = consCafe(cafe);
        if(cafe1 != null){
            bdCafe.remove(cafe1);
            return null;
        } else {
            return cafe;
        }
    } // fim delCafe
    
    public Cafe atualizaPrecoCafe(Cafe cafe) {
        for (int count = 0; count < bdCafe.size(); count++){
            if(cafe.getNome().equals(bdCafe.get(count).getNome())){
                cafe = bdCafe.get(count);
                
                String preco = JOptionPane.showInputDialog(
                        null,
                        "Informe o novo preco : ",
                        "Atualizar dados Cafe",
                        JOptionPane.INFORMATION_MESSAGE
                );
                Float preco_f = Float.parseFloat(preco);
                cafe.setPreco(preco_f);
                bdCafe.set(count, cafe);
                return bdCafe.get(count);
            }
        }
        return null;
    } // fimAtualizaPrecoCafe
    
    
    public List<Bolo> getBdBolo(){
        return bdBolo;
    }
    
    public Bolo consBolo(Bolo bolo){
        for (int count = 0; count < bdBolo.size(); count++){
            if(bolo.getNome().equals(bdBolo.get(count).getNome())){
                return bdBolo.get(count);
            }
        }
        return null;
    } // fim consBolo
    
    public Bolo insBolo(Bolo bolo){
        if(consBolo(bolo) == null){
            bdBolo.add(bolo);
            return bolo;
        } else {
            return null;
        }
    } // fim insBolo
    
    public Bolo delBolo(Bolo bolo){
        Bolo bolo1 = consBolo(bolo);
        if(bolo1 != null){
            bdBolo.remove(bolo1);
            return null;
        } else {
            return bolo;
        }
    } // fim delBolo
    
    public Bolo atualizaPrecoBolo(Bolo bolo) {
        for (int count = 0; count < bdBolo.size(); count++){
            if(bolo.getNome().equals(bdBolo.get(count).getNome())){
                bolo = bdBolo.get(count);
                
                String preco = JOptionPane.showInputDialog(
                        null,
                        "Informe o novo preco : ",
                        "Atualizar dados Bolo",
                        JOptionPane.INFORMATION_MESSAGE
                );
                Float preco_f = Float.parseFloat(preco);
                bolo.setPreco(preco_f);
                bdBolo.set(count, bolo);
                return bdBolo.get(count);
            }
        }
        return null;
    } // fimAtualizaPrecoBolo
    
    
    
    public List<Salgado> getBdSalgado(){
        return bdSalgado;
    }
    
    public Salgado consSalg(Salgado salg){
        for (int count = 0; count < bdSalgado.size(); count++){
            if(salg.getNome().equals(bdSalgado.get(count).getNome())){
                return bdSalgado.get(count);
            }
        }
        return null;
    } // fim consSalg
    
    public Salgado insSalg(Salgado salg){
        if(consSalg(salg) == null){
            bdSalgado.add(salg);
            return salg;
        } else {
            return null;
        }
    } // fim insSalg
    
    public Salgado delSalg(Salgado salg){
        Salgado salg1 = consSalg(salg);
        if(salg1 != null){
            bdSalgado.remove(salg1);
            return null;
        } else {
            return salg;
        }
    } // fim delSalg
    
    public Salgado atualizaPrecoSalg(Salgado salg) {
        for (int count = 0; count < bdSalgado.size(); count++){
            if(salg.getNome().equals(bdSalgado.get(count).getNome())){
                salg = bdSalgado.get(count);
                
                String preco = JOptionPane.showInputDialog(
                        null,
                        "Informe o novo preco : ",
                        "Atualizar dados Salgado",
                        JOptionPane.INFORMATION_MESSAGE
                );
                Float preco_f = Float.parseFloat(preco);
                salg.setPreco(preco_f);
                bdSalgado.set(count, salg);
                return bdSalgado.get(count);
            }
        }
        return null;
    } // fimAtualizaPrecoSalg
    
}
