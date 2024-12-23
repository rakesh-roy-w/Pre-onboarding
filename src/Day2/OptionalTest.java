package Day2;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optionalName = getNullName(1);
        String name = optionalName.isPresent() ? optionalName.get() : "NA";
        System.out.println("name: " + name);

        optionalName = getName(1);
        name = optionalName.orElse("NA");
        System.out.println("name: " + name);

        Optional<String> presentOptional = Optional.of("apple");
        Optional<String> emptyOptional = Optional.empty();

        presentOptional.ifPresent((x) -> System.out.println(x));

        System.out.println(presentOptional.orElseGet(() -> "Default String"));
        System.out.println(emptyOptional.orElseGet(() -> "Default String"));
        System.out.println(emptyOptional.orElseGet(() -> getSchool()));
        System.out.println(emptyOptional.orElseThrow(() -> new RuntimeException("Default RuntimeException")));
    }
    private static Optional<String> getNullName(int id) {
        String name = null;
        return Optional.ofNullable(name);
    }
    private static Optional<String> getName(int id) {
        String name = "Haru";
        return Optional.of(name);
    }

    private static String getSchool() {
        return "St. Xaviers";
    }

}
