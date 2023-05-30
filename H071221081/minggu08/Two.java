// package Lab_OOP-Praktikan_Grup_K.H071221081.minggu08;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class Two{
    public static void main(String[] args) {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| text to type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot One", 80, typeRacer);
        typers[1] = new Typer("Bot Two", 72, typeRacer);
        typers[2] = new Typer("Bot Three", 70, typeRacer);

        typeRacer.getRaceContestand().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}




class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestand = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();
    private String[] wordsToTypeList = {"Menuju tak terbatas dan melampauinya",
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

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestand() {
        return raceContestand;
    }

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }


    //  Buat method addResult yang mana digunakan untuk menambahkan typer yang telah selesai (mengetik semua kata), ke dalam list race standing.

    public void addResult(Result result){
        raceStanding.add(result);
    }

    private void printRaceStanding(){
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("==========================\n");

        // Tampilkan klasemen akhir dari kompetisi, dengan format {posisi}. {nama} = {waktu penyelesaian dalam detik} detik
        int i = 1;
        for (Result result : raceStanding) {
            System.out.println(result.getName() +". "+ i +" = "+result.getFinishTime()+" detik");
            i++;
        }

        // for (int i = 0; i < raceContestand.size(); i++) {
        //     Result r = raceContestand.get(i);

        // }
    }

    public void startRace(){
        // : jalankan kompetisi
        for(Typer typer : raceContestand){       
            typer.start();
        }

        // selama semua peserta belum selesai, maka tampilkan
        while(raceContestand.size() != raceStanding.size()){
            System.out.println("Typing Progress....");
            try {
                for(Typer typer : raceContestand){       
                    System.out.println(typer.getBotName() + " => " + typer.getWordsTyped());
                    // if(raceContestand.contain())
                }
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        // [nama kontestan] => [teks yang telah diketik]
        // try {
        //     for(Typer typer : raceContestand){

        //     }
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

        // Tampilkan race standing setelah semua typer selesai
        printRaceStanding();
    }
}

class Typer extends Thread{
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wmp, TypeRacer typeRacer){
        this.botName = botName;
        this.wpm = wmp;
        this.typeRacer = typeRacer;
        this.wordsTyped = "";
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public void setWordsTyped(String wordsTyped) {
        this.wordsTyped = wordsTyped;
    }

    public double getWpm() {
        return wpm;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    public TypeRacer getTypeRacer() {
        return typeRacer;
    }

    public void setTypeRacer(TypeRacer typeRacer) {
        this.typeRacer = typeRacer;
    }

    public void addWordsTyped(String newWordsTyped){
        this.wordsTyped += newWordsTyped + " ";
    }
    
    @Override
    public void run(){
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        int howLongToType = (int) (60000/wpm) ;

        // Buatlah perulangan untuk menambahkan kata dengan method addWordToTyped setelah interval waktu sebanyak howLongToType

        // for (int i = 0; i < wordsToType.length; i++) {
            
        // }

        for (int i = 0; i < wordsToType.length; i++) {
            addWordsTyped(wordsToType[i]);
            try {
                Thread.sleep(howLongToType);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }


        this.addWordsTyped("(selesai)");

        // typeRacer.setWordsToType(this.wordsTyped);

        // Tambahkan typer yang telah selesai mengetik semua kata ke list typeRaceTabel yang ada di class typeRacer.

        Result r = new Result(botName, wordsTyped.length() * howLongToType);
        typeRacer.addResult(r);
        // getTypeRacer().getRaceContestand().add(this);



        


    }
}

class Result{
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


    public void setFinishTime(int racerTime) {
        this.finishTime = racerTime;
    }

    
}

