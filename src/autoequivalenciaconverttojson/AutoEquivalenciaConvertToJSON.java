package autoequivalenciaconverttojson;

import Menu.Menu;

public class AutoEquivalenciaConvertToJSON {
    public static void main(String[] args) {
        Menu menu = new Menu();
        AutoCosmos cosmos = new AutoCosmos();
        MercadoLibre mercado = new MercadoLibre();
        
        int option = menu.showOptionsConvertJson();
        
        switch(option) {
            
            case 1: mercado.generarObjetoMercadoLibre(); break;
            
            case 2:
                option = menu.showOptionsAutoCosmos();
                
                if(option == 1) { cosmos.generarDataAutoCosmos(); }
                else if(option == 2) { cosmos.generarURLModelos(); }
                break;
                
            case 3: break;
                
            case 4:
                option = menu.showOptionsSegundaMano();
                
                // generarDataSegundaManoPorAnio(option);
                break;
        }
    }
}
