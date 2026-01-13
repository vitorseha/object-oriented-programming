/*
                                                    Exercícios
    1. Escreva uma classe para representar carros. Adicione a ela dois atributos e dois métodos que lhe pareçam razoáveis. 
    Os dois atributos devem ser encapsulados. Escreva métodos getters/setters para cada um deles.
    
    2. Escreva uma classe de teste que:
        2.1 Instancia dois veículos.
        2.2 Obtém valores para seus atributos e os atribui adequadamente.
        2.3 Chama cada um dos métodos que você criou.
        2.4 Exibe os valores das variáveis, usando os métodos getters.
    
    3. Rescreva a classe do exercício 1 adicionando a ela um construtor que recebe valores a serem atribuídos às duas 
    variáveis de instância da classe carro.

    4. Note que a classe de teste deixou de funcionar após a adição do construtor. Faça os ajustes necessários para que 
    ela volte a funcionar.

*/
public class Car {

    // Attributes
    private String licensePlate;
    private String brand;

    // Constructor
    public Car(String licensePlate, String brand) {
        this.licensePlate = licensePlate;
        this.brand = brand;
    }

    // Methods
    public void accelerate() {
        System.out.println("Accelerating...");
    }

    public void displayInfo() {
        System.out.printf(
            "Brand: %s | License Plate: %s%n",
            getBrand(),
            getLicensePlate()
        );
    }

    // Getters and Setters
    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
