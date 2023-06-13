import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Typer extends Thread {
    private String botName, wordsTyped;
    private Double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, Double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public Double getWpm() {
        return wpm;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");
        int howLongToType = (int) Math.floor(((60 / this.wpm)) * 1000);

        for (int i = 0; i < wordsToType.length; i++) {
            try {
                Thread.sleep(howLongToType);
                addWordTyped(wordsToType[i]);
            } catch (InterruptedException e) {
                System.out.println("Error: " + this.botName);
            }
        }

        this.addWordTyped(("selesai"));
        typeRacer.addResult(new Result(botName, howLongToType * wordsToType.length));
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

    private String[] wordsToTypeList = {
    "Menuju tak terbatas dan melampauinya",
    "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
    "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
    "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
    "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
    "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
    "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
    "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
    "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
    "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai",
    };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    public synchronized void addResult(Result result) {
        raceStanding.add(result);
    }

    public void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");
        int index = 1;
        for (Result result : raceStanding) {
            System.out.println(index + ". " + result.getName() + " = " + result.getFinishTime() / 1000.0 + " seconds");
            index += 1;
        }
    }

    public void startRace() throws InterruptedException {
        for (Typer typer : raceContestant) {
            typer.start();
        }

        while (raceContestant.size() != raceStanding.size()) {
            Thread.sleep(2000);
            System.out.println("\nTyping progress ...");
            System.out.println("================\n");
            for (Typer typer : raceContestant) {
                System.out.println("~ " + typer.getBotName() + " \t=> " + typer.getWordsTyped());
                System.out.println("-----------------------------------------------------------------------------------------------");
            }
            System.out.println("\n###################################################################################################");
            }
            printRaceStanding();
        }
    }


public class No2 {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];
        typers[0] = new Typer("Fikri", 75.2, typeRacer);
        typers[1] = new Typer("Adnan", 48.1, typeRacer);
        typers[2] = new Typer("Mayko", 52.7, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));
        typeRacer.startRace();
    }
}
