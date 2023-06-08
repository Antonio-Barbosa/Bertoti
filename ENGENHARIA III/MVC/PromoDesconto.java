public class PromoDesconto implements Promocao{
    private View view;
    private Farmacia farmacia;

    @Override
    public void receberPromo() {
        System.out.println("Você ganhou desconto!");
                
    }

    public void setView(View v){
        v = this.view;
    }

    

}
