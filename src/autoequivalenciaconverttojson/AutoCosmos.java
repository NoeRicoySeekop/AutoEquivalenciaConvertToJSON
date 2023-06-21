package autoequivalenciaconverttojson;

import JsonPost.AutoCosmoEquivalencia;
import Objetos.AutoCosmo.Brand_AC_Obj;
import Objetos.AutoCosmo.Model_AC_Obj;

public class AutoCosmos {

    public void generarDataAutoCosmos() {
        AutoCosmoEquivalencia dataAutoCosmos = new AutoCosmoEquivalencia();

        Brand_AC_Obj marcasAuto = dataAutoCosmos.getMarcasVigentes();
        System.out.println("[");

        marcasAuto.getEntries().forEach((marcas) -> {
            System.out.println("{ " + "name : '" + marcas.getNombre() + "',");

            System.out.println("modelos: [");

            Model_AC_Obj modelos = dataAutoCosmos.EquivalenciaModelo(
                    marcas.getNombre().replace(" ", ""),
                    "", "", "1");

            modelos.getEntries().forEach((modelo) -> {
                System.out.println(
                        "{ name: '" + modelo.getNombre() + "',"
                        + "code_name: '" + modelo.getCodename() + "'"
                        + " },"
                );
            });

            System.out.println("]},");
        });

        System.out.println("]");
    }

    public void generarURLModelos() {
        AutoCosmoEquivalencia dataAutoCosmos = new AutoCosmoEquivalencia();
        Brand_AC_Obj marcasAuto = dataAutoCosmos.getMarcasVigentes();

        System.out.println("[");

        marcasAuto.getEntries().forEach((marcas) -> {
            System.out.println("{ \"" + marcas.getNombre() + "\": \"" + marcas.getModelos().getLocation() + "\"},");
        });

        System.out.println("];");
    }
}
