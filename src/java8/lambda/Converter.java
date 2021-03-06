package java8.lambda;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
