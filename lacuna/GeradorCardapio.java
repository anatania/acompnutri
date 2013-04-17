/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class GeradorCardapio {
    
        private static String[] salada = {
        "alface ",
        "beterraba ",
        "tomate ",
        "chuchu ",
        "pepino ",
        "cenoura "
    };
    
    private static String[] prato_principal = {
        "sopa de creme de couve-flor",
        "sopá de creme de aveia e legumes",
        "caldo de abobora",
        "peixe assado",
        "sopa de feijão",
        "filé de frango"
    };
    
    /**
     * @return um nome feminino seguido de adjetivo no estilo western.
     */
    public static String prox() {
        
        ExpressaoGeradora exp = new ExpressaoGeradora(1);
        exp.colar(new ParteSorteada(salada));
        exp.colar(new ParteSorteada(prato_principal));
        
        ExpressaoGeradora[] ops = {exp};
        Gerador g = new Gerador(ops);
        
        return g.prox();
    }
  
    }
      
}
