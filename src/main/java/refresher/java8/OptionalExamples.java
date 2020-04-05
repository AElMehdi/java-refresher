package main.java.refresher.java8;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Optional.of;

public class OptionalExamples {
    public static void main(String[] args) {
        Optional<BigDecimal> x = Optional.empty();
        Optional<BigDecimal> y = of(new BigDecimal("10"));

        System.out.println(sumOfOptionals(x, y));
    }

    private static Optional<BigDecimal> sumOfOptionals(Optional<BigDecimal> x, Optional<BigDecimal> y) {
        return Stream.of(x, y)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .reduce(BigDecimal::add);
    }
}
