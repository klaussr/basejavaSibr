package com.urise.webapp.exception;

/**
 * Created by iStyle on 08.08.2020.
 */
public class NotExistStorageException extends StorageException {
    public NotExistStorageException(String uuid) {
        super("Resume " + uuid + " already exist", uuid);
    }
}
