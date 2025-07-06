// Aluno : Nuno Guerra - RA : a2706504
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Compra{

	private int idCompra;
	private Cliente cliente;
	private Atendente atendente;
	private float valorTotal;
	private LocalDate dataCompra;
        private List<Produto> produtos;

	public Compra(){
		idCompra = 0;
		cliente = new Cliente();
		valorTotal = 0.0f;
		dataCompra = LocalDate.now();
                produtos = new ArrayList<>();
	}

	public int getIdCompra(){
		return idCompra;
	}

	public Cliente getCliente(){
		return cliente;
	}

	public Atendente getAtendente(){
		return atendente;
	}

	public float getValorTotal(){
		return valorTotal;
	}

	public LocalDate getDataCompra(){
		return dataCompra;
	}
        
        public List<Produto> getProdutos(){
            return new ArrayList<>(produtos);
        }

	public void setIdCompra(int idCompra){
		this.idCompra = idCompra;
	}

	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}

	public void setAtendente(Atendente atendente){
		this.atendente = atendente;
	}

	public void setValorTotal(float valorTotal){
		this.valorTotal = valorTotal;
	}

	public void setDataCompra(LocalDate dataCompra){
		this.dataCompra = dataCompra;
	}

        public void setProdutos(List<Produto> produtos){
            this.produtos = new ArrayList<>(produtos);
        }
        
        public void adicionarProdutos(List<Produto> produtos){
            this.produtos.addAll(produtos);
            calcularTotal();
        }
        
        private void calcularTotal(){
            valorTotal = 0;
            for (Produto p : produtos){
                valorTotal += p.getPreco();
            }
        }

}