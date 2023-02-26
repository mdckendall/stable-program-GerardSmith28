import java.util.ArrayList;

//Create the Stable class here.
class Stable<H> {
  String address;
  ArrayList<H> h;

  public Stable() {
    this.h = new ArrayList<H>();
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return this.address;
  }

  public void addHorse(H h) {
    this.h.add(h);
  }


}