package br.calebe.ticketmachine.core;



import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;
/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    /**
     * Atributos não especificados na documentação
     * [COMISSÃO]
     * 
     */
    protected int valor;
    protected int saldo;
    
    /**
     * Lógica da classe não utiliza o index deste array corretamente
     * ele não tem a posição 6, as mesmas vão de 0 à papelMoeda.length - 1 (6).
     * Erro lógico é carregado até a classe Troco, e o mesmo estoura lá
     * [DADOS]
     */
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};
    

    /**
     * 
     * 
     *  
     */
    public TicketMachine(int valor) {
        // 
        
        this.valor = valor;
        this.saldo = 0;
    }

    /**
     * 
     * Lógica não satisfais o especificado
     * [COMISSÃO][EXESSO]
     */
    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length  && !achou; i++) {
            if (papelMoeda[i] == quantia) {
                achou = true;
            }
        }
        if (!achou) {
            throw new PapelMoedaInvalidaException();
        }
        this.saldo += quantia;
    }

    public int getSaldo() {
        return saldo;
    }

    /**
     * Método não implementado!
     * o mesmo retorna NULL!
     * [INICIALIZAÇÃO]
     */
    public Troco getTroco() {
        return new Troco(saldo);
    }

    /**
     * Método não devia ter a verificação do saldo, a mesma devia ser delegada
     * [COMPUTAÇÃO] 
     */
    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        String result /* = "*****************\n"*/;
        result = "R$ " + saldo + ",00";
        //result += "*****************\n";
        return result;
    }
}
