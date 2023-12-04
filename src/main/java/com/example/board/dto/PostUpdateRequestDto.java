package com.example.board.dto;

import lombok.Getter;

@Getter
public class PostUpdateRequestDto {
    private String title;
    private String author;
    private String content;
    private String password;
}
