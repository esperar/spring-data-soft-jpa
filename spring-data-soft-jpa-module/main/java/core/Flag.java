package core;

public interface Flag<F> {
    F isDeleted();
    F updateFlag(F updateFlag);
    Class<F> getFlagType();
}
