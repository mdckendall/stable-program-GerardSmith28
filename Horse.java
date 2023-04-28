//Create the Horse class here.
class Horse {
  String name;
  Double weight;
  Boolean tamed;

  public Horse(String name, double weight, Boolean tamed) {
    this.name = name;
    this.weight = weight;
    this.tamed = tamed;
  }

  public String getName() {
    return this.name;
  }

  public double getWeight() {
    return this.weight;
  }

  public boolean getTamed() {
    return this.tamed;
  }

  public String toString(){
     return "Name: " + this.getName() + " Weight: " + this.getWeight() + " Tame: " + this.getTamed();
  }
}