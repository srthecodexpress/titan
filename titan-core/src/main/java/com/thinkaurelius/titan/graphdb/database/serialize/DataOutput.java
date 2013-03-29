package com.thinkaurelius.titan.graphdb.database.serialize;

import java.nio.ByteBuffer;

public interface DataOutput {

    public DataOutput putLong(long val);

    public DataOutput putInt(int val);

    public DataOutput putShort(short val);

    public DataOutput putByte(byte val);

    public DataOutput putString(String string);


    public DataOutput writeObject(Object object, Class<?> type);

    public DataOutput writeObjectNotNull(Object object);

    public DataOutput writeClassAndObject(Object object);

    public ByteBuffer getByteBuffer();

}
