package tibi.interviewtraining.stringthings;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Created by mycomputericons on 8/6/2018.
 */
public class AllUniqueCharacters {

    public boolean allUniqueCharactersWithStream(String input) {
        if (Objects.isNull(input)) {
            return false;
        }
        if (input.isEmpty()) {
            return true;
        }

        Set<Character> characters = new HashSet<>();

        Optional isThere = input.chars()
                .mapToObj(i -> (char)i)
                .filter(character -> !characters.add(character))
                .findFirst();

        return isThere.isPresent();
    }

    public boolean allUniqueCharactersWithArray(String input) {
        Optional<Boolean> preCheck = checkBefore(input);
        if (preCheck.isPresent())
            return preCheck.get();

        boolean[] array = new boolean[128];

        for (char character : input.toCharArray()) {
            if (array[character] == false) {
                array[character] = true;
                continue;
            }
            return false;
        }

        return true;
    }

    public boolean allUniqueCharacters(String input) {
        Optional<Boolean> preCheck = checkBefore(input);
        if (preCheck.isPresent())
            return preCheck.get();

        Set<Character> characters = new HashSet<>();

        for (Character character : input.toCharArray()) {
            if (!characters.add(character))
                return false;
        }

        return true;
    }

    private Optional checkBefore(String input) {
        if (Objects.isNull(input))
            return Optional.of(false);

        if (input.isEmpty())
            return Optional.of(true);

        if (input.length() >= 128)
            return Optional.of(false);

        return Optional.empty();
    }
}
