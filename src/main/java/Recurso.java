public class Recurso {

  private String name;
  private String skills;

  Recurso() {}

  public Recurso(String name, String skills) {
    this.name = name;
    this.skills = skills;
  }

  public String getName() {
     return name;
  }
  
  public String getSkills() {
     return skills;
  }
}
