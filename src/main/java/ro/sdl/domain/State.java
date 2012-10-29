package ro.sdl.domain;

public enum State {
    SENIOR,
    MID,
    JUNIOR;
    private final String value;

    private State() {
        this.value = this.name().toLowerCase();
    }

    public String getValue() {
        return this.value;
    }
}
