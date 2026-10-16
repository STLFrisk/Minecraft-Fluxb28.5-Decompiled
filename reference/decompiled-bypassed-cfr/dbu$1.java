/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public final class dbu$1
implements ParameterizedType {
    @Override
    public Type[] getActualTypeArguments() {
        Type[] typeArray = new Type[2];
        typeArray[0] = String.class;
        typeArray[1] = rv2.class;
        return typeArray;
    }

    @Override
    public Type getRawType() {
        return Map.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

