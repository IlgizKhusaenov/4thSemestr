import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.security.auth.login.AppConfigurationEntry;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(SuperHeroicConfiguration.class);
        ac.refresh();

        Superheroes superhero1 = ac.getBean(Superheroes.class);
        Superheroes superhero2 = ac.getBean(Superheroes.class);

        System.out.println(superhero1.getName() + "\n Age" + superhero1.getAge() + "\n Abilities" + superhero1.getAbilitie().getName() + ", " + superhero1.getAbilitie().getPassiveOrActive());
    }
}
