// Aluno : Nuno Guerra - RA : a2706504
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Pedido{

	private int idPedido;
	private List<Produto> produtos;
	private int quantidadeProduto;
	private LocalDate dataPedido;

	public Pedido(){
		idPedido = 0;
		produtos = new ArrayList<>();
		quantidadeProduto = 0;
		dataPedido = LocalDate.now();
	}
		
	public int getIdPedido(){
		return idPedido;
	}

	public List<Produto> getProduto(){
		return new ArrayList<>(produtos);
	}

	public int getQuantidadeProduto(){
		return quantidadeProduto;
	}

	public LocalDate getDataPedido(){
		return dataPedido;
	}
        
        public float getTotal(){
            float total = 0;
            for (Produto p : produtos){
                total += p.getPreco();
            }
            return total;
        }
		
	public void setIdPedido(int idPedido){
		this.idPedido = idPedido;
	}

	public void setProdutos(List<Produto> produtos){
            this.produtos = new ArrayList<>(produtos);
        }

	public void setQuantidadeProduto(int quantidadeProduto){
		this.quantidadeProduto = quantidadeProduto;
	}

	public void setDataPedido(LocalDate dataPedido){
		this.dataPedido = dataPedido;
	}

	public void adicionarProduto(Produto p){
		produtos.add(p);
	}

}	