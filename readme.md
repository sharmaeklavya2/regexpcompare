# Comparing regular expressions

This program takes 2 regular expressions as command-line inputs
and outputs whether they describe the same language or not.

It uses [`RegExp.toAutomaton`](http://www.brics.dk/automaton/doc/dk/brics/automaton/RegExp.html#toAutomaton--)
and [`Automaton.equals`](http://www.brics.dk/automaton/doc/dk/brics/automaton/Automaton.html#equals-java.lang.Object-)
from the [`dk.brics.automaton`](http://www.brics.dk/automaton/) library to do this.

### Build instructions

* Install [Apache Maven](https://maven.apache.org/).
* Run `mvn package`.

### How to run

```
$ java -jar target/regexpcompare-1.0-jar-with-dependencies.jar 'a+' 'a*a'
true
```
