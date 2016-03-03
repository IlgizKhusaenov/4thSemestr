import org.springframework.stereotype.Component;

@Component
public class SuperAbilities {
    String name;
    String passiveOrActive;

    public SuperAbilities(String name, String passiveOrActive) {
        this.name = name;
        this.passiveOrActive = passiveOrActive;
    }

    public String getName() {
        return name;
    }

    public String getPassiveOrActive() {
        return passiveOrActive;
    }
}
