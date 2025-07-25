# 🖼️ Image-Editor

This is a simple command-line based Java image editor that allows you to apply filters like **Black & White** and **Sepia** to images.

## 📂 Project Structure

```

sem3\_project/
│
├── ImageFilter.java         # Main program for applying filters
├── input.jpg                # Sample input image
├── output\_black.jpg         # Output after applying black & white filter
├── output\_sepia.jpg         # Output after applying sepia filter
└── README.md                # Project documentation

````

## 🛠️ Features

- Convert an image to **Black and White**
- Apply **Sepia** filter
- Accepts input/output image paths via command-line arguments

## ▶️ How to Run

### ✅ Prerequisites:
- Java installed (`javac` and `java` available in terminal)
- JPG image to use as input

### 📌 Steps:

---

### ▶️ How to Run

1. **Compile the program**

   ```bash
   javac ImageFilter.java
   ```

2. **Run the program with image paths as arguments**

   ```bash
   java ImageFilter <input_image_path> <output_image_path>
   ```

   **Example:**

   ```bash
   java ImageFilter input.jpg output.jpg
   ```

3. **Choose a filter when prompted**

   You'll see the following prompt in the terminal:

   ```
   Choose filter: 
   1. Black and White
   2. Sepia
   ```

   Enter `1` for Black and White or `2` for Sepia. The edited image will be saved to the output path you provided.


## 🖼️ Input and Output Examples

### 🎯 Input:

`input.jpg`

### 🏁 Output (example):

* Black and White → `output_black.jpg`
* Sepia → `output_sepia.jpg`

## 📎 Notes

* Input and output image formats must be `.jpg`.
* Filter is chosen at runtime via terminal input.


