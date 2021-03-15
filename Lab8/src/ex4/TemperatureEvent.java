package ex4;

class TemperatureEvent extends Event {

    private int value;

    TemperatureEvent(int value) {
        super(EventType.TEMPERATURE);
        this.value = value;
    }

    int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "TemperatureEvent{" + "value=" + value + '}';
    }

}
