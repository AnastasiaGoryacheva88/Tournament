package ru.netology.javaqa;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

public class GameTest {
    Player playerName1 = new Player(1, "Стася", 150);
    Player playerName2 = new Player(2, "Лираэль", 200);
    Player playerName3 = new Player(3, "Анатоль", 600);
    Player playerName4 = new Player(4, "Азриэль", 100);
    Player playerName5 = new Player(5, "Винсент", 200);
    Player playerName6 = new Player(6, "Вася", -300);

    Game game = new Game();

    @Test
    public void roundTest() {
        Collection<Player> players = new ArrayList<>();
        game.register(playerName1);
        game.register(playerName2);

        int actual = game.round("Стася", "Лираэль");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RoundNoWinTest() {
        Collection<Player> players = new ArrayList<>();
        game.register(playerName2);
        game.register(playerName5);

        int actual = game.round("Лираэль", "Винсент");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void roundWinTest() {
        Collection<Player> players = new ArrayList<>();
        game.register(playerName3);
        game.register(playerName4);

        int actual = game.round("Анатоль", "Азриэль");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void roundIfFirsPlayer2NotRegistered() {
        Game game = new Game();
        Player playerName8 = new Player(8, "Кузя", 120);
        Player playerName9 = new Player(9, "Вероника", 80);
        game.register(playerName8);
        int actual = 0;
        try {
            actual = game.round("Кузя", "Вероника");
        } catch (NotRegisteredException e) {

        }

        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void roundIfFirsPlayer1NotRegistered() {
        Game game = new Game();
        Player playerName8 = new Player(8, "Кузя", 120);
        Player playerName9 = new Player(9, "Вероника", 80);
        game.register(playerName9);
        int actual = 0;
        try {
            actual = game.round("Кузя", "Вероника");
        } catch (NotRegisteredException e) {

        }

        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

}

