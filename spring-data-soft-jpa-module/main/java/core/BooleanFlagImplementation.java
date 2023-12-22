package core;

public class BooleanFlagImplementation implements Flag<Boolean> {

    /**
     * BooleanFlag Class
     * this class implement flag interface.
     * this flag's type of field(flag key) is Boolean
     */


    // TODO Dependency Injection to AbstractionFlagEntity and implements methods by using AbstractionFlagEntity

    @Override
    public Boolean isDeleted() {
        return null;
    }

    @Override
    public Boolean updateFlag(Boolean updateFlag) {
        return null;
    }

    @Override
    public Class<Boolean> getFlagType() {
        return Boolean.class;
    }
}
