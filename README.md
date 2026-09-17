# Java Collections Framework

A collection of small, self-contained Java programs demonstrating the core classes and interfaces of the Java Collections Framework (JCF). Each demo lives in its own package under `src/` and contains a `main` method you can compile and run independently.

## Project Structure

Each top-level package under `src/` covers one area of the Collections Framework:

| Package | Files | Demonstrates |
| --- | --- | --- |
| `Arraylist` | `Arraylist.java` | `ArrayList` — add, get, set, remove, iteration, and sorting with `Collections.sort` |
| `vector` | `Main.java` | `Vector` — add, get, remove (synchronized legacy list) |
| `linkedList` | `Main.java` | `LinkedList` — add, addFirst/addLast, remove, size, get by index |
| `stack` | `Main.java` | `Stack` — push, peek, pop, isEmpty, size |
| `Queue` | `Main.java`, `priorityQueueDemo.java`, `DequeDemo.java` | `PriorityQueue` (natural ordering + FIFO drain), `ArrayDeque` (offer, offerFirst, pollLast) |
| `Set` | `MainHashSet.java`, `LinkedHashSetDemo.java`, `TreeSetDemo.java` | `HashSet` (uniqueness + basic ops), `LinkedHashSet` (insertion order), `TreeSet` (sorted order) |
| `Map` | `HashmapDemo.java`, `LinkedHashMapDemo.java`, `TreeMapDemo.java` | `HashMap` (put, get, remove), `LinkedHashMap` (insertion order), `TreeMap` (sorted keys) |
| `Comparator` | `Student.java`, `Main.java` | Sorting a `List` with custom `Comparator` lambdas (by marks asc, by marks desc, by name) |

There is also a `src/Main.java` (default package) that prints a welcome message — a starter file from the IDE template, not collection-related.

## Requirements

- **JDK 8 or later** (the code uses lambdas introduced in Java 8)
- **A Java IDE** (IntelliJ IDEA is configured via `.idea/`) or a plain `javac` command line

## How to Compile and Run

### From the command line

From the project root (`collection framework`), compile a single demo and run it:

```sh
# Example: run the ArrayList demo
javac -d out src/Arraylist/Arraylist.java
java -cp out Arraylist.Arraylist
```

Compile and run any other demo the same way, replacing the package and class name:

```sh
javac -d out src/Set/MainHashSet.java
java -cp out Set.MainHashSet
```

### From IntelliJ IDEA

Open the project directory in IntelliJ IDEA. Each class with a `main` method appears as a run configuration in the gutter next to the editor; click the green ▶ icon, or right-click the file and choose **Run**.

## Notes

- Every file uses fully qualified or explicit imports from `java.util.*` — no external dependencies are required.
- The `Comparator` demo relies on Java 8 lambdas, so a JDK 8+ is required for it to compile.
- Each program is intentionally small and focused on the API calls a beginner needs to see; they intentionally avoid advanced topics like generics beyond the basic type-parameter demos shown here.