package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[10000];
    private int size = 0;

    public void clear() {
        for (int i = 0; i < size; i++){
            storage[i] = null;
        }
        size = 0;
    }

    public void update(Resume r) {
        int index = getIndex(r.getUuid());
        if (index == -1) {
            System.out.println("Resume " + r.getUuid() + " not exist");
        } else {
            storage[index] = r;
        }
    }

    public void save(Resume r) {
        if (getIndex(r.getUuid()) == -1){
            if (size == storage.length) {
                System.out.println("Storage overflow");
            } else {
                storage[size] = r;
                size++;
            }
        } else {
            System.out.println("Resume " + r.getUuid() + " already exist");
            update(r);
        }
    }

    public Resume get(String uuid) {
        int index = getIndex(uuid);
        if (index == -1){
            System.out.println("Resume " + uuid + " not exist");
            return null;
        }
        return storage[index];
    }

    public void delete(String uuid) {
        storage[getIndex(uuid)] = storage[size-1];
        storage[size-1] = null;
        size--;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        Resume[] storage2 = new Resume[size];
        System.arraycopy(storage, 0, storage2, 0, size);
        return storage2;
    }

    public int size() {
        return size;
    }

    private int getIndex(String uuid) {
        for (int i = 0; i < size; i++){
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}
