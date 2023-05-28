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

    private String[] wordsToTypeList = { "Menuju tak terbatas dan melampauinya" };

    public void setNewWordsToType() {
        Random random = new Random();
        int randomNumber = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[randomNumber];
    }


    // TOOD(4)
    public void addResult(Typer typer) {
        int timeResult = typer.getWordsTyped().split(" ").length * (int) (60000 / typer.getWpm());
        Result result = new Result(typer.getBotName(), timeResult);
        raceStanding.add(result);
    }

    public void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        // TOOD (5)
        for (int i = 0; i < raceStanding.size(); i++) {
            int finishTime = raceStanding.get(i).getFinishTime();
            double finishTimeInSeconds = (double) finishTime / 1000;
            System.out.println(String.format("%d. %s = %.2f detik", i+1, raceStanding.get(i).getName(), finishTimeInSeconds));
        }
    }

    public void startRace() {

        // TOOD(6)
        setNewWordsToType();
        System.out.println();


        for (Typer typer : raceContestant) {
            typer.start();
        }

        // TOOD (7)
        boolean isAllFinished = false;
        while (true) {
            if (!isAllFinished) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(
                        "\n#################################################################################################");
                System.out.println("\nTyping Progress ...");
                System.out.println("================\n");
                for (Typer typer : raceContestant) {
                    System.out.println(String.format("- %s  => %s", typer.getBotName(), typer.getWordsTyped()));
                    System.out.println(
                            "====================================================================================================");
                }

                if (raceContestant.size() == raceStanding.size()) {
                    isAllFinished = true;
                }
            } else {
                break;
            }
        }
        
        // TOOD 8
        printRaceStanding();
    }
}