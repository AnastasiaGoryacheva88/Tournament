package ru.netology.javaqa;

import java.util.Objects;

public class Player {


    private int id;
    private String name;
    private int strength;

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
}

//        @Override
//        public boolean equals(Object o) {
//            if (o == null || getClass() != o.getClass()) return false;
//            if (this == o) return true;
//
//            Player player = (Player) o;
//            return id == player.id && strength == player.strength && Objects.equals(name, player.name);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(id, name, strength);
//        }
//    }
//
