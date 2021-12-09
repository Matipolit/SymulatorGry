package main;

import abc.Character;

import static main.Game.playerCharacters;

public class CharacterManager {

    protected static void addCharacter(Character character){
        playerCharacters.add(character);
    }

}
