package ro.sdl.domain;

public enum Role {
    QA,
    DEV;

    private final String value;

    private Role() {
        this.value = this.name().toLowerCase();
    }

    public String getValue() {
        return this.value;
    }
}
