package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;


    @Autowired
    private Timer timer;


    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println(animal.toString());
        System.out.println(timer.getTime());
        System.out.println("--------------");
    }

}


