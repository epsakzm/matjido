package com.example.demo.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FoodType {
    KOR("한식"), JAP("일식"), WES("양식"), CHN("중식"), CHK("치킨"), PIZ("피자"), BUN("분식"), SAL("샐러드");

    private final String name;
}
