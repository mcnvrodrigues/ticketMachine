package br.calebe.ticketmachine.core;



import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
/**
 * 
 * Classes nesse arquivo não condizem com a especificação da documentação
 * (e a mesma esta desenhada erradamente)
 * (Classe Troco não é, nem deveria ser uma abstração de Iterator)
 * [COMISSÃO]
 */
class Troco {

    protected PapelMoeda[] papeisMoeda;

    /**
     * Construtor com lógica e estruturas desnecessarias,
     * loops poderiam ser organizados de outra forma oucompletamente removidos
     * Algoritmo usado não garante a resolução do problema, e seu resultado não
     * condiz com as espectativas
     * estruturas de dados usadas não são adequadas para a situação em questão.
     * [COMPUTAÇÃO]
     * [DESEMPENHO]
     * [DADOS]
     * [EXESSO]
     */
    public Troco(int valor) {
        
        // estrutura de dados errada. Não possibilita alteração no tamanho do vetor[DADOS]
        
        papeisMoeda = new PapelMoeda[6];
        PapelMoeda v2 = new PapelMoeda(2,0);
        PapelMoeda v5 = new PapelMoeda(5,0);
        PapelMoeda v10 = new PapelMoeda(10,0);
        PapelMoeda v20 = new PapelMoeda(20,0);
        PapelMoeda v50 = new PapelMoeda(50,0);
        PapelMoeda v100 = new PapelMoeda(100,0);
        
        papeisMoeda[0] = v2;
        papeisMoeda[1] = v5;
        papeisMoeda[2] = v10;
        papeisMoeda[3] = v20;
        papeisMoeda[4] = v50;
        papeisMoeda[5] = v100;
        
        int count = 0;
        /**
         * Variavel de controle (valor) não alterada durante o loop
         * Programatrava aqui e não segue pois loop não retorna.
         * [CONTROLE][DESEMPENHO]
         */
                
        if(valor >= 100)
        {            
            //papeisMoeda[5] = new PapelMoeda(100, valor/100);
            papeisMoeda[5].setQuantidade(valor/100);
            valor = valor - (100 * (valor/100));
        }
        
        
        if(valor >= 50)
        {            
            //papeisMoeda[4] = new PapelMoeda(50, valor/50);
            papeisMoeda[4].setQuantidade(valor/50);
            valor = valor - (50 * (valor/50));
        }
        
        if(valor >= 20)
        {            
            //papeisMoeda[3] = new PapelMoeda(20, valor/20);
            papeisMoeda[3].setQuantidade(valor/20);
            valor = valor - ( 20 * (valor/20));
        }
        
        if(valor >= 10)
        {            
            //papeisMoeda[2] = new PapelMoeda(10, valor/10);
            papeisMoeda[2].setQuantidade(valor/10);
            valor = valor - (10 * (valor/10));
        }
        
        if(valor >= 5)
        {            
            //papeisMoeda[1] = new PapelMoeda(5, valor/5);
            papeisMoeda[1].setQuantidade(valor/5);
            valor = valor - (5 * (valor/5));
        }
        
        if(valor >= 2)
        {            
            //papeisMoeda[0] = new PapelMoeda(2, valor/2);
            papeisMoeda[0].setQuantidade(valor/2);
            valor = valor - (2 * (valor/2));
        }
        
        
        
        
        /**
         * Variável count sempre é zerada. seu valor não passa adiante.
         * [COMPUTAÇÃO]
         */
        /*
        count = 0;
        while (valor % 50 == 0) {
            valor -= valor % 50;
            count++;
        }
        papeisMoeda[4] = new PapelMoeda(50, count);
        
        count = 0;
        while (valor % 20 == 0) {
            valor -= valor % 20;
            count++;
        }
        papeisMoeda[3] = new PapelMoeda(20, count);
        
        count = 0;
        while (valor % 10 == 0) {
            valor -= valor % 10;
            count++;
        }
        papeisMoeda[2] = new PapelMoeda(10, count);
        
        count = 0;
        while (valor % 5 == 0) {
            valor -= valor % 5;
            count++;
        }
        papeisMoeda[1] = new PapelMoeda(5, count);
        
        count = 0;
        while (valor % 2 == 0) {
            valor -= valor % 2;
            count++;
        }
        /**
         * Posição 1 do vetor tem seu valor resetado.
         * [COMPUTAÇÃO]
         */
        //papeisMoeda[0] = new PapelMoeda(2, count);
        
        
        
        /**
         * vetor papeisMoeda não inicializado corretamente.
         * O mesmo tem 6 posições e somente 5 foram usadas/inicialisadas
         * 
         * posição 0 é null
         * 
         * [COMPUTAÇÃO][DADOS]
         */
        
        /*
        System.out.printf("Num de notas de 2 = %d\n", papeisMoeda[0].getQuantidade());
        System.out.printf("Num de notas de 5 = %d\n", papeisMoeda[1].getQuantidade());
        System.out.printf("Num de notas de 10 = %d\n", papeisMoeda[2].getQuantidade());
        System.out.printf("Num de notas de 20 = %d\n", papeisMoeda[3].getQuantidade());
        System.out.printf("Num de notas de 50 = %d\n", papeisMoeda[4].getQuantidade());
        System.out.printf("Num de notas de 100 = %d\n", papeisMoeda[5].getQuantidade());
        */
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        /**
         * Variavel Troco dispensável uma vez que os atributos da instancia usada estão
         * no mesmo escopo deste iterator.
         * [DESEMPENHO]
         * [EXESSO]
         */
        protected Troco troco;
        protected int posicao;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
            posicao = 0;
        }
        
        

        @Override
        public boolean hasNext() {
            /**
             * Iteração errada, contador i sobe, e sai do escopo do array. loop não retorna.
             * [COMPUTAÇÃO]
             */
            /**
             * Implementação do método hasNext() errada!
             * Não se percorre o array, guarda-se a posição atual.
             * [COMPUTAÇÃO]
             * [DESEMPENHO]
             */
            posicao++;
            
            return true;
        }

        /**
         * 
         * Implementação completamente errada.
         * [COMPUTAÇÃO]
         * [DADOS]
         * [DESEMPENHO]
         * 
         */
        @Override
        public PapelMoeda next() {
            
            /*
            
            PapelMoeda ret = null;
            for (int i = 6; i >= 0 && ret != null; i++) {
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
            }
            return ret;
            */
            
            return troco.papeisMoeda[posicao];
            
        }

        @Override
        public void remove() {
            next();
        }
    }
}
