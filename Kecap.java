public class Kecap {
  private String merk;
  private float kapasitas;

  public Kecap() {
    System.out.println("Contructor Kecap");
  }

  public void isi(float jumlah) {
    this.kapasitas += jumlah;
  }

  public void isi(boolean full) {
    if (full)
      this.kapasitas = 1.0f;
    else
      this.kapasitas += 0.1f;
  }

  public float getKapasitas() {
    return kapasitas;
  }

  public void setKapasitas(float kapasitas) {
    this.kapasitas = kapasitas;
  }

  public String getMerk() {
    return merk;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }
}
