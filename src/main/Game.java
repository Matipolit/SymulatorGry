package main;

import abc.Character;
import characters.Dragon;
import characters.Knight;
import weapons.FireStream;
import weapons.Sword;

import java.util.ArrayList;

public class Game {

    protected static ArrayList<Character> playerCharacters;

    public static void main(String[] args){
        playerCharacters = new ArrayList<Character>();

        Knight maciek = new Knight("Maciek");
        CharacterManager.addCharacter(maciek);
        Sword sword = new Sword();
        maciek.giveWeapon(sword);
        maciek.displayWeapon();

        Dragon smaug = new Dragon("Smaug");
        CharacterManager.addCharacter(smaug);
        smaug.giveWeapon(new FireStream());
        smaug.displayWeapon();

    }



}
