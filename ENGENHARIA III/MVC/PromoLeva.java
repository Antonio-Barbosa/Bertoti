public class PromoLeva implements Promocao {
    private View view;
    private Farmacia farmacia;

    @Override
    public void receberPromo() {
        System.out.println("Você levou um produto de graça!");
                
    }

    public void setView(View v){
        v = this.view;
    }
}
