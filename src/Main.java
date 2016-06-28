/**
 * Created by sunil on 6/28/16.
 */
public class Main {
    public static void main(String[] args){

        Animal genericAnimal = new Animal("Generalization", 4, 2, false);
        Tiger tony = new Tiger("Tony", 4, 15, true,true,true);
        Nessie ness = new Nessie("Nessie", 4, 30, true,true,true);
        Reptile genericReptile = new Reptile("Generic", 4,10,false,false);
        Mammal genericMammal = new Mammal("GenericMamaal", 4, 7,false,true);

        genericAnimal.printInfo();
        System.out.println();

        genericReptile.printInfo();
        System.out.println();

        ness.printInfo();
        System.out.println();

        tony.printInfo();
        System.out.println();

        genericMammal.printInfo();
        System.out.println();
    }
}
