package core;

public interface Flag<F> {
    Boolean isDeleted();
    F updateFlag(F updateFlag);
    Class<F> getFlagType();
}
