package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by iStyle on 07.08.2020.
 */
public class SortedArrayStorage extends AbstractArrayStorage {
    private static final Comparator<Resume> RESUME_COMPARATOR = (o1, o2) -> o1.getUuid().compareTo(o2.getUuid());

    @Override
    protected void insertElement(Resume r, int index) {
        int index1 = -index -1;
        System.arraycopy(storage, index1, storage, index1+1, size-index1);
        storage[index1] = r;
    }

    @Override
    protected void fillDeletedElement(int index) {
      int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(storage, index+1, storage, index, numMoved);
        }
    }

    @Override
    protected Integer getSearchKey(String uuid) {
        Resume searchKey = new Resume(uuid, "dummy");
        return Arrays.binarySearch(storage, 0, size, searchKey, RESUME_COMPARATOR);
    }
}
