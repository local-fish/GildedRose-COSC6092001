# Gilded Rose

## About this Repo
This repo is a refactor of the [Gilded Rose](https://github.com/emilybache/GildedRose-Refactoring-Kata#) Refactoring Kata. This refactor is done in java, and is done for the Code Reengineering course. In particular, we break the rule that we aren't allowed to change the item class as to allow for a refactor which uses a simpler polymorphic approach which fits within the requirements of the assignment. We recognize the proper solution of using a decorator pattern to instead handle the item class to allow for polymorphism, however we did not find that this constraint would be appropriate for the assignment.

We also decided to use the project specification to implement the conjured items, which resulted in us creating 2 tests, one without the conjured item implementation to show feature parity, and one with the conjured item implementation to adhere to the project specification.

## Running this Repo
If you are on NixOS and use flakes, the simplest way to run is to run `nix develop` and then run the `./run-nix.sh` script. This will automatically generate 2 text files and diff them with the expected result.

Otherwise, this project requires
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

To run, there are 2 commands of interest
- `./gradlew -q text` runs the test with the proper implementation for the conjured items. note that diffing the output of this command with `expected-out.txt` will show that the conjured item is different each day.
- `./gradlew -q pre` runs the test without the proper implementation for the conjured items. This test intends to show that the project is indeed feature parity with the original code, as diffing the two will show no difference.
