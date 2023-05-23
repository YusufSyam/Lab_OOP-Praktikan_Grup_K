package TaskNo2;

import java.util.ArrayList;
import java.util.Random;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }
    
    private String[] wordsToTypeList = { "Kesuksesan sejati adalah ketika kita mencapai \n tujuan kita sambil tetap mempertahankan integritas \n dan empati terhadap orang lain" };

    public void setNewWordsToType() {
        Random random = new Random();   
        int randomNumber = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[randomNumber];
    }

    // Todo 4
    public void addResult(Typer typer) {
        int time = (int) (60000 / typer.getWpm()) * typer.getWordsTyped().split(" ").length;
        Result result = new Result(typer.getBotName(), time);
        raceStanding.add(result);
    }

    public void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=".repeat(25)+"\n");

        // Todo 5
        for (int i = 0; i < raceStanding.size(); i++) {
            int finishTime = raceStanding.get(i).getFinishTime();
            double finishTimeInSeconds = (double) finishTime / 1000.0;
            System.out.println(String.format("%d. %s = %.2f detik", i+1, raceStanding.get(i).getName(), finishTimeInSeconds));
        }
    }

    public void startRace() {
        // Todo 6
        setNewWordsToType();
        System.out.println();

        for (Typer typer : raceContestant) {
            typer.start();
        }

        // Todo 7
        boolean isFinished = false;
        while (true) {
            if (!isFinished) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("*".repeat(70));
                System.out.println("=".repeat(20));
                System.out.println("\nTyping Progress ...");
                System.out.println("=".repeat(20)+"\n");
                for (Typer typer : raceContestant) {
                    System.out.println(String.format("- %s  => %s", typer.getBotName(), typer.getWordsTyped()));
                    System.out.println("=".repeat(70));
                }

                if (raceContestant.size() == raceStanding.size()) {
                    isFinished = true;
                }
            } else {
                break;
            }
        }

        // Todo 8
        this.printRaceStanding();
    }
}