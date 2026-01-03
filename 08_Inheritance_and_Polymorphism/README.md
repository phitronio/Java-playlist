# Inheritance and Polymorphism

![Overview](images/overview-0.svg)

## Description

This folder demonstrates two fundamental concepts of object-oriented programming in Java: **Inheritance** and **Polymorphism**. Through a creative Iron Man suit hierarchy, students learn how classes can inherit properties and behaviors from parent classes, and how methods can be overridden to provide different implementations.

### Inheritance

The module showcases a three-level inheritance hierarchy:
- **BasicSuit** - The base/parent class containing fundamental suit functionality
- **Mark1** - Extends BasicSuit, demonstrating single-level inheritance
- **Mark2** - Extends Mark1, demonstrating multi-level inheritance
- **NanoMark** - Also extends Mark1, showing multiple classes can inherit from the same parent

### Polymorphism

Polymorphism is demonstrated through method overriding:
- The `powerUp()` method is defined in BasicSuit
- Mark2 and NanoMark override this method to provide suit-specific implementations
- Each suit displays different arc reactor information when powered up

### Key Concepts Covered

1. **Inheritance (`extends` keyword)**: Classes inherit fields and methods from parent classes
2. **Method Overriding (`@Override` annotation)**: Child classes provide new implementations of inherited methods
3. **Field Shadowing**: Child classes can define fields with the same name as parent classes
4. **Multi-level Inheritance**: Classes can inherit from classes that themselves inherit from other classes
5. **Polymorphism**: Same method name can have different behaviors in different classes

### Files in This Module

- **BasicSuit.java**: Base class with basic suit functionality
- **Mark1.java**: First generation suit inheriting from BasicSuit
- **Mark2.java**: Second generation suit with method overriding
- **NanoMark.java**: Advanced nano-tech suit demonstrating polymorphism

Each file includes comprehensive JavaDoc comments explaining the inheritance relationships, method overriding, and polymorphism concepts.

## বিবরণ

এই ফোল্ডারটি Java-তে object-oriented programming-এর দুটি মৌলিক ধারণা প্রদর্শন করে: **Inheritance** এবং **Polymorphism**। একটি সৃজনশীল Iron Man suit hierarchy-এর মাধ্যমে, শিক্ষার্থীরা শিখবে কীভাবে classes parent classes থেকে properties এবং behaviors inherit করতে পারে, এবং কীভাবে methods override করে বিভিন্ন implementation প্রদান করা যায়।

### Inheritance (উত্তরাধিকার)

এই মডিউলটি একটি তিন-স্তরের inheritance hierarchy প্রদর্শন করে:
- **BasicSuit** - Base/parent class যা fundamental suit functionality ধারণ করে
- **Mark1** - BasicSuit-কে extend করে, single-level inheritance প্রদর্শন করে
- **Mark2** - Mark1-কে extend করে, multi-level inheritance প্রদর্শন করে
- **NanoMark** - Mark1-কে extend করে, দেখায় যে multiple classes একই parent থেকে inherit করতে পারে

### Polymorphism (বহুরূপতা)

Polymorphism method overriding-এর মাধ্যমে প্রদর্শিত হয়:
- `powerUp()` method BasicSuit-এ define করা হয়েছে
- Mark2 এবং NanoMark এই method-টি override করে suit-specific implementations প্রদান করে
- প্রতিটি suit power up করার সময় বিভিন্ন arc reactor তথ্য প্রদর্শন করে

### আ covered করা মূল ধারণাসমূহ

1. **Inheritance (`extends` keyword)**: Classes parent classes থেকে fields এবং methods inherit করে
2. **Method Overriding (`@Override` annotation)**: Child classes inherited methods-এর নতুন implementations প্রদান করে
3. **Field Shadowing**: Child classes parent classes-এর মতো একই নামের fields define করতে পারে
4. **Multi-level Inheritance**: Classes এমন classes থেকে inherit করতে পারে যারা নিজেরা অন্য classes থেকে inherit করে
5. **Polymorphism**: একই method name বিভিন্ন classes-এ বিভিন্ন behavior থাকতে পারে

### এই মডিউলের ফাইলসমূহ

- **BasicSuit.java**: Basic suit functionality সহ base class
- **Mark1.java**: BasicSuit থেকে inherit করা প্রথম প্রজন্মের suit
- **Mark2.java**: Method overriding সহ দ্বিতীয় প্রজন্মের suit
- **NanoMark.java**: Polymorphism প্রদর্শনকারী advanced nano-tech suit

প্রতিটি ফাইলে comprehensive JavaDoc comments রয়েছে যা inheritance relationships, method overriding, এবং polymorphism concepts-কে ব্যাখ্যা করে।

### Inheritance Hierarchy (উত্তরাধিকার শ্রেণিবিন্যাস)

```
BasicSuit (Grandparent/Base Class)
    │
    ├── archReactor: "Mark I Core"
    └── powerUp() method
        │
        └── Mark1 (Parent Class)
            │
            ├── version: 1
            ├── Inherits: archReactor, powerUp()
            │
            ├── Mark2 (Child Class)
            │   │
            │   ├── version: 2 (shadows Mark1's version)
            │   ├── archReactor: "Mark II Core" (shadows BasicSuit's archReactor)
            │   └── powerUp() - Overridden method
            │
            └── NanoMark (Child Class)
                │
                ├── version: 3 (shadows Mark1's version)
                ├── archReactor: "Nano Core" (shadows BasicSuit's archReactor)
                └── powerUp() - Overridden method
```

### Learning Outcomes (শিক্ষণ ফলাফল)

এই মডিউলটি সম্পূর্ণ করার পর, শিক্ষার্থীরা:
- Java-তে inheritance কীভাবে কাজ করে তা বুঝতে পারবে
- Method overriding এবং polymorphism-এর মধ্যে পার্থক্য বুঝতে পারবে
- Multi-level inheritance hierarchy তৈরি করতে পারবে
- `@Override` annotation-এর ব্যবহার শিখবে
- Field shadowing এবং method overriding-এর মধ্যে পার্থক্য বুঝতে পারবে
- Real-world scenarios-এ inheritance এবং polymorphism প্রয়োগ করতে পারবে

### Additional Resources (অতিরিক্ত সম্পদ)

এই মডিউলের `images` ফোল্ডারে 10টি SVG diagram রয়েছে (overview-0.svg থেকে overview-9.svg) যা inheritance এবং polymorphism concepts-এর visual representation প্রদান করে। এই diagrams-গুলি concepts বুঝতে এবং visualize করতে সহায়তা করে।

