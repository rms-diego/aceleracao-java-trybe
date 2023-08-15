package essenciaisDeJava.Poo.GetAndSet;

class GetAndSet {

  public static void main(String[] args) {
    Car car1 = new Car("HB20", 100000.00);

    System.out.println("\n" + car1.carModel());

    car1.setName("Civic");
    car1.setPrice(80000);

    System.out.println("\n" + car1.carModel());
  }
}
