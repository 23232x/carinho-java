
public class Produto{
    private String desProd;
    private int qtdProd;
    private double valorProd;
    
    public static List<Produto> list_of_prods = new ArrayList<>();
    

public Produto( String descProd, int qtdProd, valorProd){
           this.desProd=desProd;
           this.qtdProd=qtdProd;
           this.valorProd=valorProd;
    }
    
    public void setDesProd(String descPrdo ){
        this.desProd = desProd;
    }
    
    public void setQtdProd( int QtdProd ){
        this.QtdProd = QtdProd;
    }
    
    public void setValorProd( double valorProd ){
        this.valorProd = valorProd;
    }
    
    public String getDesProd(){
        return this.desProd;
    }
    
    public int getQtdProd(){
        return this.qtdProd;
    }
    
    public double getValorProd(){
        return this.valorProd;
    }
    
    public static void cadastraProdutos{
    
    String descricao;
    int qtd;
    double valor_prod;
    int numProd=0;
    double valorTotal;
    
    do{
        
        descricao = JOptionPane.showMessageDialog("Informe o nome do produto");
        qtd = Integer.parseInt(JOptionPane.showMessageDialog("Informe a quantidade do produto: ");
        valor_prod = Double.parseDouble(JOptionPane.showMessageDialog("Informe o valo do produto");    
        numProd++;
        
        Produto prod = new Produto(descricao,qtd,valor_prod);
        list_of_prods.add(prod);
        valorTotal =valor_prod++;
        
    }while(numProd==5);
    
        
    }
    
    
public static void listaProdutos(){
        

      for (Produto e: list_of_prods) {
      
    JOptionPane.showMessageDialog(null, 
    "Produto: " + e.getDesProd() +
    "Quantidade do produto " + e.getValorProd() +
    "Valor unitário do produto: " + e.getValorProd());

    }
        
} 


public static totalCompra(){
    DecimalFormat df = new DecimalFormat("###,###.###");           
    JOptionPane.showMessageDialog("O valor total do pedido é: "+df.format(valorTotal));

}  
    
}


