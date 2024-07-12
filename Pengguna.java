public class Pengguna {
  private int id;
  private String username;
  private String password;

  public Pengguna() {
    System.out.println("Object telah diciptakan, constructor berjalan");
  }

  public void hapus() {
    System.out.println("DELETE FROM pengguna");
  }

  public void hapus(int id) {
    System.out.println("DELETE FROM pengguna WHERE id=" + id);
  }

  public void hapus(String username) {
    System.out.println("DELETE FROM pengguna WHERE username=" + username);
  }

  public void login() {
    System.out.println("Ini method untuk login");
  }

  public void login(String tokenGoogle) {
    System.out.println("Ini method untuk login menggunakan google");
  }

  public void lupaPassword() {
    System.out.println("Ini method lupa password");
  }

  public void daftar() {
    System.out.println("Ini method untuk daftar user baru");
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
