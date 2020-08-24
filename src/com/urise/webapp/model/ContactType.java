package com.urise.webapp.model;

/**
 * Created by iStyle on 17.08.2020.
 */
public enum ContactType {
    PHONE("Тел"),
    MOBILE("Мобильный"),
    HOME_PHONE("Домашний"),
    SKYPE("Скайп"),
    MAIL("Почта"),
    LINKEDIN("Профиль LinkedIn"),
    GITHUB("Профиль GitHub"),
    STACKOVERFLOW("Профиль StackOverFlow"),
    HOME_PAGE("Домашняя страница");

    private final String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
