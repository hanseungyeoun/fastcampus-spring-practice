package com.fastcampus.springpractice;

import com.fastcampus.springpractice.Main;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void main() {
        //Given
        String[] args = {"4", "1", "2"};
        //when & Then
        Main.main(args);
    }
}