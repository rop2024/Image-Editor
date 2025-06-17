import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ImageFilter {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ImageFilter <input_image_path> <output_image_path>");
            return;
        }

        String inputPath = args[0];
        String outputPath = args[1];

        try {
            BufferedImage image = ImageIO.read(new File(inputPath));
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose filter: ");
            System.out.println("1. Black and White");
            System.out.println("2. Sepia");
            int choice = scanner.nextInt();

            if (choice == 1) {
                image = applyBlackAndWhiteFilter(image);
            } else if (choice == 2) {
                image = applySepiaFilter(image);
            } else {
                System.out.println("Invalid choice.");
                return;
            }

            ImageIO.write(image, "jpg", new File(outputPath));
            System.out.println("Image processed and saved to " + outputPath);

        } catch (IOException e) {
            System.out.println("Error reading or writing the image file.");
            e.printStackTrace();
        }
        
    }

    private static BufferedImage applyBlackAndWhiteFilter(BufferedImage img) {
        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {
                Color color = new Color(img.getRGB(x, y));
                int gray = (int)(color.getRed() * 0.299 + color.getGreen() * 0.587 + color.getBlue() * 0.114);
                Color newColor = new Color(gray, gray, gray);
                img.setRGB(x, y, newColor.getRGB());
            }
        }
        return img;
    }

    private static BufferedImage applySepiaFilter(BufferedImage img) {
        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {
                Color color = new Color(img.getRGB(x, y));
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                int sepiaRed = (int)(0.393 * red + 0.769 * green + 0.189 * blue);
                int sepiaGreen = (int)(0.349 * red + 0.686 * green + 0.168 * blue);
                int sepiaBlue = (int)(0.272 * red + 0.534 * green + 0.131 * blue);

                sepiaRed = Math.min(255, sepiaRed);
                sepiaGreen = Math.min(255, sepiaGreen);
                sepiaBlue = Math.min(255, sepiaBlue);

                Color newColor = new Color(sepiaRed, sepiaGreen, sepiaBlue);
                img.setRGB(x, y, newColor.getRGB());
            }
        }
        return img;
    }
}
