package com.tinqin.library.book.persistence.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum BookStatus {
    PUBLLISHED("Published"),
    UNPUBLISHED("Unpublished");

    private final String code;

    @Override
    public String toString() {

        return code;
    }


}
