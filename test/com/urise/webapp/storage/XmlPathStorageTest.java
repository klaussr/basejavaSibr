package com.urise.webapp.storage;

import com.urise.webapp.storage.serializer.XmlStreamSerializer;

/**
 * Created by iStyle on 23.08.2020.
 */
public class XmlPathStorageTest extends AbstractStorageTest {

    public XmlPathStorageTest() {
        super(new PathStorage(STORAGE_DIR.getAbsolutePath(), new XmlStreamSerializer()));
    }
}