/*
Fazer
um programa para digitar 5 produtos, pedindo descrição, quantidade e valor
unitário.
Após
isto mostrar os produtos cadastrados, com a descrição, quantidade, valor
unitário e valor total e totalizar a compra, mostrando os valores no formato de
moeda.
*/
class cadastro {
    public static void main(String[] args) {

int opcao;


do{
    
    opcao = Integer.parseInt(JOptionPane.showMessageDialog("Selecione a opcao: \n *1-cadastrar Produtos.\n *2 Listar produtos cadastrados.\n *3 Mostrar valor total da compra.\n *4 sair.   ");
    
    if(opcao ==1){
        cadastraProdutos();
    }else if(opcao ==2){
        listaProdutos();
    }else if(opcao==3){
        totalCompra();
    }
} while(opcao==4 ||numProd==5 )

    }
}
