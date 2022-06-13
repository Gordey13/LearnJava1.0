package task.generics.game;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Медведь", 12);
        Team<Schoolar> schoolarTeam = new Team<>("Медведи");
        Team<Schoolar> schoolarTeam2 = new Team<>("Зайцы");

        Team<Student> studentAuto = new Team<>("AutomationQA");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.playWith(schoolarTeam2);

        List<Double> list1 = new ArrayList<>();
        list1.add(1.2);
    }

    static void showListInfo(List<?> list){
        System.out.println(list);
    }




}
