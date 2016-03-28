package br.calebe.ticketmachine.exception;



/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
   
    // CÒDIGO INCOMPLETO. [COMISSÃO]
    private final String erro;

    public PapelMoedaInvalidaException()
    {
        erro = "Papel moeda invalido!\n\n";
    }

    public String getErro() {
        return erro;
    }
    
    
}
