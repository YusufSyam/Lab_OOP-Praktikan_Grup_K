import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm; // Words Per Minute
    private TypeRacer typeRacer;

    public Typer(String botName, Double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(int wpm) {
        this.wpm = wpm;
    }

    private void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        
        String[] wordsToType = typeRacer.getWordsToType().split(" ");
        int howLongToType = (int) (60000 / wpm);

        for (String words : wordsToType) {
            try {
                Thread.sleep(howLongToType);
                this.addWordTyped(words);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.addWordTyped("(Selesai)");
        typeRacer.addResult(this);
    }
}

class Result {
    private String name;
    private int finishTime;

    public Result(String name, int finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
}

class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    private String[] wordsToTypeList = {"Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng"};
    public void setNewWordsToType() {
        Random random = new Random();
        int randomNumber = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[randomNumber];
    }

    public void addResult(Typer typer) {
        int waktu = (int) (60000 / typer.getWpm()) * typer.getWordsTyped().split(" ").length;
        Result result = new Result(typer.getBotName(), waktu);
        raceStanding.add(result);
    }

   
    private void printRaceStanding() {
        System.out.println("\nKlasmen Akhir Type Racer");
        System.out.println("=========================\n");
        for (int i = 0; i < raceStanding.size(); i++) {
            int timeint = raceStanding.get(i).getFinishTime();
           double timeFix = timeint / 1000.0;
            System.out.println(String.format("%d. %s = %.2f detik", i + 1, raceStanding.get(i).getName(), timeFix));
        }
    }
    
    public void startRace() {
        this.setNewWordsToType();
        for (Typer typerss : raceContestant) {
            typerss.start();
        }
        Boolean selesaiMengetik = false;
        while (true) {
            if (selesaiMengetik) {
                break;
            } else {
                if (raceStanding.size() != raceContestant.size()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("\n#################################################################################################");
                    System.out.println("\n Typing Progress....");
                    System.out.println("===================");
                    for (Typer pembalap : raceContestant) {
                        System.out.println(
                                String.format("- %s  =>  %s", pembalap.getBotName(), pembalap.getWordsTyped()));
                    }
                } else {
                    selesaiMengetik = true;
                }
            }
        }
        this.printRaceStanding();
    }
}

public class No2 {
    public static void main(String[] args) {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Mansur", 30.0, typeRacer);
        typers[1] = new Typer("Bot Toku", 90.0, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 70.0, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}