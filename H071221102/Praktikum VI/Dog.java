abstract class Dog {
    int position, averageLength;

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

    abstract void move();

    abstract void describe();
}

class Pitbull extends Dog {

    @Override
    public void move() {
        position += 3;
    }

    @Override
    public void describe() {
        System.out.println("Pitbull meiliki ciri-ciri Berotot");
    }
}

class SiberianHusky extends Dog {

    @Override
    public void move() {
        position += 2;
    }

    @Override
    public void describe() {
        System.out.println("Memiliki bulu yang tebal");
    }
}

class Bulldog extends Dog {

    @Override
    public void move() {
        position += 1;
    }

    @Override
    public void describe() {
        System.out.println("memiliki tubuh lebar");
    }
}

class GermanShepherd extends Dog {

    @Override
    public void move() {
        position += 3;
    }

    @Override
    public void describe() {
        System.out.println("Struktur tubuh yang memanjang");
    }
}