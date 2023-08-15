package essenciaisDeJava.Poo.GetAndSet;

public class Car {
  // atributos privados
  private String name;
  private double price;

  // construtor
  public Car(String name, double price) {
    this.name = name;
    this.price = price;
  }

  // função para pegar um atributo que está encapsulado
  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  // função para setar um novo atributo que está encapsulado
  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String carModel() {
    return String.format(
        "Modelo do carro: %s\nPreço do carro: R$ %.2f",
        name, price);
  }

}
