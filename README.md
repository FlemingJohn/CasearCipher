# Caesar Cipher in Java 🔐

This project implements a basic **Caesar Cipher** encryption algorithm in Java. The Caesar Cipher is a simple substitution cipher where each letter in the plaintext is shifted a certain number of places down or up the alphabet.

---

## Features ✨

* **Encryption:** Encrypts alphabetic text using a shift key (0-25). 🔑
* **Case Preservation:** Maintains the original case (uppercase/lowercase) of letters. 🅰️🅱️
* **Non-alphabetic Characters:** Non-alphabetic characters (like numbers, punctuation) remain unchanged. 🔢 Punctuation

---

## How It Works ⚙️

The program functions by:

1.  Taking user input for the text to encrypt. 📝
2.  Prompting for a shift key (an integer between 0 and 25). 🔢
3.  Applying the Caesar Cipher logic to shift each letter. ➡️
4.  Displaying the encrypted result. 📤

---

## Code Structure 🏗️

* `encrypt(String text, int shift)`: A method that takes a string and an integer shift value, returning the encrypted version of the string. 📝➡️🔐
* `main(String[] args)`: Handles user input and displays the final output. 🖥️

---

## Example 💡

```
Input:
Enter the text to encrypt:
Hello World
Enter shift key (0-25):
3

Output:
Encrypted text: Khoor Zruog
```

---

## How to Run ▶️

1.  **Compile the code:**
    ```bash
    javac CaesarCipher.java
    ```

2.  **Run the program:**
    ```bash
    java CaesarCipher
    ```

---

## Requirements 📋

* Java Development Kit (JDK) 8 or above ☕
* Command-line terminal or an Integrated Development Environment (IDE) 💻

---

## License 📄

This project is licensed under the MIT License. 👍

---
