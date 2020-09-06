package com.urise.webapp.storage;

import com.urise.webapp.storage.serializer.JsonStreamSerializer;

/**
 * Created by iStyle on 23.08.2020.
 */
public class JsonPathStorageTest extends AbstractStorageTest {

    public JsonPathStorageTest() {
        super(new PathStorage(STORAGE_DIR.getAbsolutePath(), new JsonStreamSerializer()));
    }
}