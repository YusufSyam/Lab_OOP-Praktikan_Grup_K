package minggu06;
// import javax.swing.text.Position;

public abstract class Dog {
    public Dog(){};

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    int position;
    int averageLength;

    public abstract void describe();

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLength() {
        return averageLength;
    }

    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }
}


class Pitbul extends Dog implements movable{
    int position = 3;

    @Override
    public void move() {
        System.out.println("position " + (this.position > 0 ? "+" + Integer.toString(this.position) : "-"+Integer.toString(position)) );
    }

    @Override
    public void describe() {
        String text = "" + 
        "race : Pitbul\n" +
        "-Muscular build\n"+
        "-Broad, flat head with a wide skull and strong jaws\n"+
        "-Pointy ears that may be cropped or left natural\n"+
        "-Tail is usually short and tapered\n"+
        "-Comes in a variety of colors, including black, brown, fawn, brindle, and white";
        System.out.println(text);

    }

}

class BullDog extends Dog implements movable{
    int position = 1;

    @Override
    public void move() {
        System.out.println("position " + (position > 0 ? "+" + Integer.toString(position) : "-"+Integer.toString(position)) );
    }

    @Override
    public void describe() {
        String text = "" + 
        "race : Bulldog\n" +
        "-Wide, heavy-set body with a large head and thick neck\n"+
        "-Short, stubby legs\n"+
        "-Ears are small and folded over\n"+
        "-Tail is short and either straight or screwed\n"+
        "-Comes in a variety of colors, including white, fawn, brindle, and piebald";
        System.out.println(text);

    }

}

class GermanShepherd extends Dog implements movable{
    int position = 3;

    @Override
    public void move() {
        System.out.println("position " + (position > 0 ? "+" + Integer.toString(position) : "-"+Integer.toString(position)) );
    }

    public void describe() {
        String text = "" + 
        "race : German Shepherd\n" +
        "-Muscular build with a sloping back\n"+
        "-Broad head with a long, straight muzzle\n"+
        "-Ears are large and erect\n"+
        "-Tail is long and bushy\n"+
        "-Comes in a variety of colors, including black, tan, sable, and white";
        System.out.println(text);

    }

}

class SiberianHusky extends Dog implements movable{
    int position = 2;

    @Override
    public void move() {
        System.out.println("position " + (position > 0 ? "+" + Integer.toString(position) : "-"+Integer.toString(position)) );
    }

    public void describe() {
        String text = "" + 
        "race : Siberian Husky\n" +
        "-Slender build with a compact body\n"+
        "-Narrow, wedge-shaped head with upright ears\n"+
        "-Tail is long and fluffy\n"+
        "-Comes in a variety of colors, including black, white, gray, and red, and can have a variety of markings.";
        System.out.println(text);

    }

}
