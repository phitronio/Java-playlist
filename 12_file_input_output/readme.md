# Java File Input/Output Tutorial

This folder demonstrates basic text file I/O in Java using:
- `FileReader` (read from file, character by character)
- `FileWriter` (write to file)
- `BufferedReader` (read faster, usually line by line)
- `BufferedWriter` (write faster using buffer)
- `IOException` (common checked exception for I/O operations)

## Files In This Folder

- `FileHandler.java`: Main demo file for reading/writing text files
- `data.txt`: Input/sample text file
- `output.txt`: Output file (written/appended by Java code)
- `readme.md`: Learning notes (this file)

## Core Concepts (English)

### 1) `FileReader` (Reads text, usually slower)
- Reads characters directly from a file.
- Often used with a loop until `read()` returns `-1`.
- Good for learning, but less efficient for large files.

### 2) `FileWriter` (Writes text, usually slower)
- Writes characters directly to a file.
- By default, it **overwrites** the target file.
- Use `new FileWriter(path, true)` for append mode.

### 3) `BufferedReader` (Faster reading)
- Wraps `FileReader`.
- Reads using an internal memory buffer.
- Commonly used with `readLine()` for line-by-line reading.

### 4) `BufferedWriter` (Faster writing)
- Wraps `FileWriter`.
- Stores writes in memory buffer before saving, reducing disk operations.
- Use `newLine()` to add a platform-safe line break.

### 5) `IOException`
- Most file operations can throw `IOException`.
- Since it is a checked exception, Java requires handling it via `try-catch` or `throws`.

## Why Buffered Classes Are Faster

Without buffering, every read/write may hit disk directly.
With buffering, Java groups many operations in memory first, then performs fewer disk accesses.
That is why `BufferedReader`/`BufferedWriter` are usually preferred for text file processing.

## Quick Usage Pattern

1. Open reader/writer
2. Read or write in loop
3. Close stream
4. Handle `IOException`

Best practice: Use `try-with-resources` in modern Java so streams close automatically.

Example idea:
- Read from `data.txt` using `BufferedReader`
- Append processed text to `output.txt` using `BufferedWriter`

---

# বাংলা ভার্সন (Bangla Version)

এই ফোল্ডারে Java-এর ফাইল ইনপুট/আউটপুটের বেসিক দেখানো হয়েছে:
- `FileReader` দিয়ে ফাইল থেকে টেক্সট পড়া
- `FileWriter` দিয়ে ফাইলে টেক্সট লেখা
- `BufferedReader` দিয়ে দ্রুত/স্মুথভাবে পড়া
- `BufferedWriter` দিয়ে দ্রুত লেখা
- `IOException` দিয়ে error handle করা

## ফোল্ডারের ফাইলগুলোর কাজ

- `FileHandler.java`: মূল ডেমো কোড
- `data.txt`: ইনপুট ডাটা (যা পড়া হবে)
- `output.txt`: আউটপুট ডাটা (যেখানে লেখা/append হবে)
- `readme.md`: এই টিউটোরিয়াল

## মূল টপিকগুলো

### 1) `FileReader` (পড়া, তুলনামূলক slow)
- একেকটি character পড়ে।
- `read()` যতক্ষণ `-1` না দেয়, ততক্ষণ loop চলে।
- শেখার জন্য ভাল, কিন্তু বড় ফাইলে খুব efficient না।

### 2) `FileWriter` (লেখা, তুলনামূলক slow)
- character ভিত্তিক লেখা।
- ডিফল্টভাবে ফাইল overwrite করে।
- append করতে চাইলে `new FileWriter(path, true)` ব্যবহার করতে হবে।

### 3) `BufferedReader` (ফাস্ট রিড)
- `FileReader`-কে wrap করে।
- buffer ব্যবহার করে পড়ার কারণে performance ভাল হয়।
- `readLine()` দিয়ে line-by-line পড়া সহজ।

### 4) `BufferedWriter` (ফাস্ট রাইট)
- `FileWriter`-কে wrap করে।
- buffer-এ জমিয়ে পরে ডিস্কে লেখে, তাই disk hit কম হয়।
- `newLine()` দিয়ে নতুন লাইন যোগ করা ভাল practice।

### 5) `IOException`
- ফাইল নিয়ে কাজ করার সময় সাধারণত `IOException` হতে পারে।
- এটি checked exception, তাই `try-catch` বা `throws` ব্যবহার করা বাধ্যতামূলক।

## ছোট্ট সারাংশ

- `FileReader` / `FileWriter` = basic, simple, but slower
- `BufferedReader` / `BufferedWriter` = faster and preferred for regular text files
- সবসময় error handling + stream close নিশ্চিত করতে হবে

শেখার পরের ধাপ:
- `try-with-resources` ব্যবহার করা
- `java.nio.file.Files` API দিয়ে modern file handling শেখা
