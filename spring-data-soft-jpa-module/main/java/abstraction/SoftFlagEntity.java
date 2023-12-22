package abstraction;

import core.BooleanFlagImplementation;
import core.EnumFlagImplementation;
import core.Flag;

public class SoftFlagEntity<F extends Flag> {

    /**
     * there is a flag field
     * this field's type must be instanced of Flag
     */
    private final F flag;

    public SoftFlagEntity(F flag) {

        assert flag != null;

        if(flag instanceof BooleanFlagImplementation) {
            this.flag = (F) flag;
        } else if(flag instanceof EnumFlagImplementation) {
            this.flag = (F) flag;
        } else {
            throw new IllegalArgumentException("Flag's type is not matched");
        }
    }

    public static <F extends Flag> SoftFlagEntity<F> createSoftFlagEntity(F flag) {
        return new SoftFlagEntity<F>(flag);
    }

    public F getFlag() {
        return flag;
    }
}
