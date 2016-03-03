import org.springframework.stereotype.Component;

@Component
public class Superheroes {
    String name;
    int age;
    SuperAbilities abilitie;

    public Superheroes(String name, int age, SuperAbilities abilitie) {
        this.name = name;
        this.age = age;
        this.abilitie = abilitie;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public SuperAbilities getAbilitie() {
        return abilitie;
    }
}
