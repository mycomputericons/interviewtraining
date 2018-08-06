package tibi.interviewtraining.stringthings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mycomputericons on 8/6/2018.
 */
public class AllUniqueCharactersTest {

    AllUniqueCharacters underTest = new AllUniqueCharacters();

    @Test
    public void testWithNull() {
        assertFalse(underTest.allUniqueCharacters(null));
    }

    @Test
    public void testWithEmpty() {
        assertTrue(underTest.allUniqueCharacters(""));
    }

    @Test
    public void testWithOneCharacter() {
        assertTrue(underTest.allUniqueCharacters("a"));
    }

    @Test
    public void testWithTwoDifferentCharacters() {
        assertTrue(underTest.allUniqueCharacters("ab"));
    }

    @Test
    public void testWithTwoSameCharacters() {
        assertFalse(underTest.allUniqueCharacters("aa"));
    }

    @Test
    public void testWithSpecialCharacters() {
        assertTrue(underTest.allUniqueCharacters("][dk8234ß$×.,a"));
    }

    @Test
    public void testWithLowerCaseAndCapitalCharacters() {
        assertTrue(underTest.allUniqueCharacters("Aa"));
    }


    @Test
    public void testArrayWithNull() {
        assertFalse(underTest.allUniqueCharactersWithArray(null));
    }

    @Test
    public void testArrayWithEmpty() {
        assertTrue(underTest.allUniqueCharactersWithArray(""));
    }

    @Test
    public void testArrayWithOneCharacter() {
        assertTrue(underTest.allUniqueCharactersWithArray("a"));
    }

    @Test
    public void testArrayWithTwoDifferentCharacters() {
        assertTrue(underTest.allUniqueCharactersWithArray("ab"));
    }

    @Test
    public void testArrayWithTwoSameCharacters() {
        assertFalse(underTest.allUniqueCharactersWithArray("aa"));
    }

    @Test
    public void testArrayWithSpecialCharacters() {
        assertTrue(underTest.allUniqueCharactersWithArray("][dk8234a"));
    }

    @Test
    public void testArrayWithLowerCaseAndCapitalCharacters() {
        assertTrue(underTest.allUniqueCharactersWithArray("Aa"));
    }
}