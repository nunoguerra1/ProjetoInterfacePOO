// Aluno : Nuno Guerra - RA : a2706504
import java.util.ArrayList;
import java.util.List;


public class BdItens {
    
    private Produto prod;
    private List<Produto> bdProd;
    private static BdItens gpUnic;
    
    private BdItens(){
        prod = new Produto();
        bdProd = new ArrayList<Produto>();
    }
    
    // Método Singleton
    public static BdItens geraGerProdutos(){
        if(gpUnic == null){
            gpUnic = new BdItens();
        }
        return gpUnic;
    }
    
    public List<Produto> getBdProd(){
        return bdProd;
    }
    
    public Produto consProd(Produto prod){
        for (int count = 0; count < bdProd.size(); count++){
            if(prod.getNome().equals(bdProd.get(count).getNome())){
                return bdProd.get(count);
            }
        }
        return null;
    } // fim consBolo
    
    public Produto insProd(Produto prod){
        if(consProd(prod) == null){
            bdProd.add(prod);
            return prod;
        } else {
            return null;
        }
    } // fim insBolo
    
}
