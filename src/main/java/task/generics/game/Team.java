package task.generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Partisipant> {
    private String name;
    private List<T> partisipants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant){
        partisipants.add(participant);
        System.out.println(participant.getName());
    }

    public void playWith(Team<T> team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i==0){winnerName=this.name;}
        else{winnerName= team.name;}
        System.out.println(winnerName);
    }

}
