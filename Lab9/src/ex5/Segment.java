package ex5;

class Segment {
    int id;
    Train train;

    Segment(int id) {
        this.id = id;
    }

    boolean hasTrain() {
        return train != null; //returns true, if a train exists in the segment
    }

    Train departTrain() { //the train is leaving
        Train tmp = train;
        this.train = null;
        return tmp;
    }

    void arriveTrain(Train train) { //another train arrived
        this.train = train;
    } //the train arrives

    Train getTrain() {
        return train;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "id=" + id +
                ", train=" + train +
                '}'+"\n";
    }
}
