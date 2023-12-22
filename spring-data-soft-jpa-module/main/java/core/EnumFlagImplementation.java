package core;

import abstraction.SoftFlagEntity;

public class EnumFlagImplementation implements Flag<FlagType> {

    /**
     * EnumFlagImplementation Class
     * this class implement flag interface.
     * this flag's type of field(flag key) is FlagType(DELETED, NOTDELETED)
     */


    // TODO Dependency Injection to AbstractionFlagEntity and implements methods by using AbstractionFlagEntity

    private final SoftFlagEntity<EnumFlagImplementation> entity;
    private final FlagType flagStatus;

    public EnumFlagImplementation(SoftFlagEntity<EnumFlagImplementation> entity, FlagType flagStatus) {
        this.entity = entity;
        this.flagStatus = flagStatus;
    }


    @Override
    public Boolean isDeleted() {
        return entity.getFlag().flagStatus == FlagType.DELETED;
    }

    @Override
    public FlagType updateFlag(FlagType updateFlag) {
        entity.setFlag(new EnumFlagImplementation(entity, updateFlag));
        return updateFlag;
    }

    @Override
    public Class<FlagType> getFlagType() {
        return FlagType.class;
    }
}
