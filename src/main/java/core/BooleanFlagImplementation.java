package core;

import abstraction.SoftFlagEntity;

public class BooleanFlagImplementation implements Flag<Boolean> {

    /**
     * BooleanFlag Class
     * this class implement flag interface.
     * this flag's type of field(flag key) is Boolean
     */


    // TODO Dependency Injection to AbstractionFlagEntity and implements methods by using AbstractionFlagEntity

    private final SoftFlagEntity<BooleanFlagImplementation> entity;
    private final Boolean flagStatus;

    public BooleanFlagImplementation(SoftFlagEntity<BooleanFlagImplementation> entity, Boolean flagStatus) {
        this.entity = entity;
        this.flagStatus = flagStatus;
    }

    @Override
    public Boolean isDeleted() {
        return entity.getFlag().flagStatus;
    }

    @Override
    public Boolean updateFlag(Boolean updateFlag) {
        entity.setFlag(new BooleanFlagImplementation(entity, updateFlag));
        return updateFlag;
    }

    @Override
    public Class<Boolean> getFlagType() {
        return Boolean.class;
    }

}
