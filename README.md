# MutationTestingExample Java

These are a few Java code snippets illustrating dos and don'ts of mutation testing
(e.g. killed and survived mutants, invalid mutants, subsumed mutants, equivalent mutants, ...).
There is a special focus for (semi-) equivalent mutants

## Usage
The `FindLast.java` file contains 2 different versions of a find function which goes over a vector backward searching for an element.
The `FindLastTest.java` file contains then a series of tests excercising these find functions.

By manually injecting mutants in findLastMutated you can then execute the tests and see whether a mutant gets killed, survives, subsumes, is equivalent, ...
The comments in the code explain which mutants to inject.

## Set-up

This is used within IntelliJ in combination with github and PITest.
The testing framework is junit.jupiter 