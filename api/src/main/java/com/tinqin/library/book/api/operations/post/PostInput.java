package com.tinqin.library.book.api.operations.post;

import com.tinqin.library.book.api.base.ProcessorInput;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@ToString
public class PostInput implements ProcessorInput {
    private final String message;

}
