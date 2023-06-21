package autoequivalenciaconverttojson;

import JsonPost.MercadoLibreEquivalencia;
import Objetos.MercadoLibre.Catalog_ML_Obj;
import java.util.ArrayList;

public class MercadoLibre {

    public void generarObjetoMercadoLibre() {
        MercadoLibreEquivalencia data = new MercadoLibreEquivalencia();
        ArrayList<Catalog_ML_Obj> brands = data.Equivalencia("", "", "", "0");

        System.out.println("[");

        for (Catalog_ML_Obj brand : brands) {
            System.out.println("{ id: " + brand.getId() + ", " + "name: '" + replaceCaracteresRaros(brand.getName()) + "',");

            System.out.println("autos: [");

            ArrayList<Catalog_ML_Obj> cars = data.Equivalencia(brand.getId(), "", "", "1");

            for (Catalog_ML_Obj car : cars) {
                System.out.println("{ id: " + car.getId() + ", " + "name: '" + replaceCaracteresRaros(car.getName()) + "',");

                System.out.print("modelos: [");

                ArrayList<Catalog_ML_Obj> years = data.Equivalencia(brand.getId(), car.getId(), "", "2");
                for (Catalog_ML_Obj year : years) {
                    if("2019".equals(year.getName())) {
                        System.out.println("{ " + "id: " + year.getId() + ", " + "name: '" + year.getName() + "',");
                        System.out.print("versiones: [");

                        ArrayList<Catalog_ML_Obj> versions = data.Equivalencia(brand.getId(), car.getId(), year.getId(), "3");

                        for (Catalog_ML_Obj version : versions) {
                            System.out.println("{" + "id: " + version.getId() + ", " + "name: '" + replaceCaracteresRaros(version.getName()) + "'," + "},");
                        }

                        System.out.println("]\n},");
                    }
                }

                System.out.print("]");
                System.out.print("},");
            }

            System.out.println("]},");
            break;
        }

        System.out.println("]");
    }
    
    private String replaceCaracteresRaros(String w) {
        return w.replace('á', 'a').replace('é', 'e').replace('í', 'i').replace('ó', 'o').replace('ú', 'u')
                .replace('Á', 'A').replace('É', 'E').replace('Í', 'I').replace('Ó', 'O').replace('Ú', 'U')
                .replace("\"", "").replace("'", "");
    }
}
