/**
 * @author marcosrodriguescorreia
 * **/
public class main {

    /**
     *
     * @param args
     */
    public static void main(String args[]){


        car Camaro = new car();
        Camaro.color = "blue";
        Camaro.manufacter = "Chrevrolet";
        Camaro.model = "Camaro";
        Camaro.year = 2010;

        Camaro.acelerar();
        Camaro.parando();

    }
}
