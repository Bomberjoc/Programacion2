package characters;

public class Character {
    String name;
    String occupation;
    int age;
    String phrase;

    /* Constructores */
    public Character(String name, String occupation, int age, String phrase) {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
        this.phrase = phrase;
    }

    public Character() {
    }

    /* Getters and Setters*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    /* Funciones */
    public void greeting(){
        System.out.println(this.phrase);
    }
}
