public interface Range {
    boolean contains(int value);
    // returns true if v is ≥ lower bound and ≤ upper bound,
    // and false otherwise
    boolean overlaps(Range other);
    // returns true if the receiver contains at least
    // one value in common with other, and false otherwise
    int size();
    // returns the number of integers in the range
    boolean isEquals(Range other);
    // Returns if the passed in Range is equal to the range in the class
}
