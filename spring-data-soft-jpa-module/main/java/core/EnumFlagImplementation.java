package core;

public class EnumFlagImplementation implements Flag<FlagType> {


    /**
     * EnumFlagImplementation Class
     * this class implement flag interface.
     * this flag's type of field(flag key) is FlagType(DELETED, NOTDELETED)
     */


    // TODO Dependency Injection to AbstractionFlagEntity and implements methods by using AbstractionFlagEntity


    @Override
    public FlagType isDeleted() {
        return null;
    }

    @Override
    public FlagType updateFlag(FlagType updateFlag) {
        return null;
    }

    @Override
    public Class<FlagType> getFlagType() {
        return FlagType.class;
    }
}
