public class Buku {
  private int id;
  private String judul;
  private String penulis;
  private int jumlahHalaman;
  private double harga;

  public Buku() {
    System.out.println("Object telah diciptakan, constructor berjalan");
  }

  public void tampilkanDetail() {
    System.out.println("Ini method untuk menampilkan detail buku");
  }

  public void naikkanHarga() {
  }

  public void naikkanHarga(double kenaikan) {
  }

  public double getHarga() {
    return harga;
  }

  public void setHarga(double harga) {
    this.harga = harga;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getJudul() {
    return judul;
  }

  public void setJudul(String judul) {
    this.judul = judul;
  }

  public int getJumlahHalaman() {
    return jumlahHalaman;
  }

  public void setJumlahHalaman(int jumlahHalaman) {
    this.jumlahHalaman = jumlahHalaman;
  }

  public String getPenulis() {
    return penulis;
  }

  public void setPenulis(String penulis) {
    this.penulis = penulis;
  }
}
