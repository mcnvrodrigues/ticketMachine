package br.calebe.ticketmachine.exception;



/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
   
    // CÒDIGO INCOMPLETO. [COMISSÃO]
    private final String erro;

    public SaldoInsuficienteException()
    {
        erro = "Saldo Insuficiente!\n\n";
    }

    public String getErro() {
        return erro;
    }
    
    
}
