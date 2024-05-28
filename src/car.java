public class car {
    String color;
    String manufacter;
    String model;
    int year;

    /**
     *
     * System.out.println: printa Acelerando + o nome do modelo
     *
     * */
    public void acelerar(){
        System.out.println("Acelerando: " + this.model);
    }

    public void parando(){
        System.out.println("Parando: " + this.model);
    }
}
