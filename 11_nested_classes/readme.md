# 12. Nested Classes [1]

This folder demonstrates the four common nested-class patterns in Java:

- Inner class (non-static)
- Static nested class
- Local class (inside a method)
- Anonymous class

It also shows **shadowing** (same variable name in outer and inner class).

## File

- `Driver.java`: all examples are implemented here.

## Concepts Covered

### 1) Inner Class (Non-Static)

- `OuterClass.InnerClass` is a non-static inner class.
- It is tied to an `OuterClass` object.
- Creation style:
  - `OuterClass outer = new OuterClass();`
  - `OuterClass.InnerClass inner = outer.new InnerClass();`

### 2) Static Nested Class

- `SomeClass.StaticNestedClass` is static.
- It does not need an object of `SomeClass` to be created.
- It can directly access static members of `SomeClass` (`staticData`).
- It cannot directly access non-static members (`someData`) without an object reference.

### 3) Local Class

- `LocalClass` is declared inside `OuterClass.someMethod()`.
- Its scope is limited to that method only.
- It is useful for short helper logic that is not needed elsewhere.

### 4) Anonymous Class

- In `OuterClass.anonymousClassExample()`, `MyInterface` is implemented without creating a named class.
- Useful for one-time behavior.

## Shadowing Explained

Shadowing means a variable in an inner scope has the same name as a variable in an outer scope.

In this code:

- `OuterClass.data = 42`
- `InnerClass.data = 24`

Inside `InnerClass`:

- `this.data` refers to `InnerClass.data` (`24`)
- `OuterClass.this.data` refers to `OuterClass.data` (`42`)

## How to Run

From this folder, compile and run:

```bash
javac Driver.java
java Driver
```

## Try These in `main`

Uncomment lines in `main` to test each topic:

- `outer.someMethod();` -> local class
- `outer.anonymousClassExample();` -> anonymous class
- static nested class creation lines -> static nested class

Currently, `main` runs the inner class example and prints shadowing-related output.