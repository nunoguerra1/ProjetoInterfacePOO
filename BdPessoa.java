// Aluno : Nuno Guerra - RA : a2706504
import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BdPessoa {
    
    private Atendente atend;
    private List<Atendente> bdAtend;
    private static BdPessoa gaUnic;
    
    private Cliente cli;
    private List<Cliente> bdCli;
    
    private BdPessoa(){
        atend = new Atendente();
        bdAtend = new ArrayList<Atendente>();
        cli = new Cliente();
        bdCli = new ArrayList<Cliente>();
    }
    
    // Método Singleton
    public static BdPessoa geraBdPessoa(){
        if(gaUnic == null){
            gaUnic = new BdPessoa();
        }
        return gaUnic;
    }
    
    public List<Atendente> getBdAtend(){
        return bdAtend;
    }
    
    public Atendente consAtendCpf(Atendente atend){
        for (int count = 0; count < bdAtend.size(); count++){
            if(atend.getCpf().equals(bdAtend.get(count).getCpf())){
                return bdAtend.get(count);
            }
        }
        return null;
    } // fim consAtendCpf
    
    public Atendente insAtend(Atendente atend){
        if(consAtendCpf(atend) == null){
            bdAtend.add(atend);
            return atend;
        } else {
            return null;
        }
    } // fim insAtend
    
    public Atendente delAtendCpf(Atendente atend){
        Atendente atend1 = consAtendCpf(atend);
        if(atend1 != null){
            bdAtend.remove(atend1);
            return null;
        } else {
            return atend;
        }
    } // fim delAtendCpf
    
    public Atendente atualizaAtendCpf(Atendente atend) throws SalarioMinException{
        for (int count = 0; count < bdAtend.size(); count++){
            if(atend.getCpf().equals(bdAtend.get(count).getCpf())){
                atend = bdAtend.get(count);
                
                String salario = JOptionPane.showInputDialog(
                        null,
                        "Informe o novo salario : ",
                        "Atualizar dados atendente",
                        JOptionPane.INFORMATION_MESSAGE
                );
                Float salario_f = Float.parseFloat(salario);
                atend.setSalario(salario_f);
                bdAtend.set(count, atend);
                return bdAtend.get(count);
            }
        }
        return null;
    } // fimAtualizaAtendCpf
    
    
    
    public List<Cliente> getBdCli(){
        return bdCli;
    }
    
    public Cliente consCliCpf(Cliente cli){
        for (int count = 0; count < bdCli.size(); count++){
            if(cli.getCpf().equals(bdCli.get(count).getCpf())){
                return bdCli.get(count);
            }
        }
        return null;
    } // fim consCliCpf
    
    public Cliente insCli(Cliente cli){
        if(consCliCpf(cli) == null){
            bdCli.add(cli);
            return cli;
        } else {
            return null;
        }
    } // fim insCli
    
    public Cliente delCliCpf(Cliente cli){
        Cliente cli1 = consCliCpf(cli);
        if(cli1 != null){
            bdCli.remove(cli1);
            return null;
        } else {
            return cli;
        }
    } // fim delCliCpf
    
    public Cliente atualizaCliCpf(Cliente cli) throws PreferenciaNumException{
        for (int count = 0; count < bdCli.size(); count++){
            if(cli.getCpf().equals(bdCli.get(count).getCpf())){
                cli = bdCli.get(count);
                
                String preferencia = JOptionPane.showInputDialog(
                        null,
                        "Informe a nova preferência : ",
                        "Atualizar dados Cliente",
                        JOptionPane.INFORMATION_MESSAGE
                );
                cli.setPreferencia(preferencia);
                bdCli.set(count, cli);
                return bdCli.get(count);
            }
        }
        return null;
    } // fimAtualizaCliCpf
    
}
