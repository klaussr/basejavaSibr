package com.urise.webapp.storage;

import com.urise.webapp.storage.serializer.DataStreamSerializer;

/**
 * Created by iStyle on 23.08.2020.
 */
public class DataStreamStorageTest extends AbstractStorageTest {

    public DataStreamStorageTest() {
        super(new PathStorage(STORAGE_DIR.getAbsolutePath(), new DataStreamSerializer()));
    }
}