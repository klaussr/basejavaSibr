package com.urise.webapp.model;

/**
 * Created by iStyle on 17.08.2020.
 */
public enum SectionType {
    PERSONAL("Личные качества"),
    OBJECTIVE("Позиция"),
    ACHIEVEMENT("Достижения"),
    QUALIFICATIONS("Квалификация"),
    EXPERIENCE("Опыт работы"),
    EDUCATION("Образование");

    public String getTitle() {
        return title;
    }

    private String title;

    SectionType(String title) {
        this.title = title;
    }
}
