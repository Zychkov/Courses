package Lesson13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blurring {
    public static void main(String[] args) throws IOException {
        // читаем картинку из файлу image.jpg в объект класса BufferedImage
        BufferedImage image = ImageIO.read(new File("image.jpg"));

        // получаем растр - объект, внутри которого содержится двумерный массив пикселей
        WritableRaster raster = image.getRaster();

        // получаем ширину и высоту картинки
        int width = raster.getWidth();
        int height = raster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;
        final int MAX_RGB = 255;

        double[][] matrix = {{1.0 / 9, 1.0 / 9, 1.0 / 9},
                {1.0 / 9, 1.0 / 9, 1.0 / 9},
                {1.0 / 9, 1.0 / 9, 1.0 / 9}};

        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        int matrixSize = matrix.length / 2;

        for (int y = matrixSize; y < height - matrixSize; ++y) {
            for (int x = matrixSize; x < width - matrixSize; ++x) {
                int[] newPixel = new int[COLORS_COUNT_IN_RGB];

                double redColours = 0;
                double greenColours = 0;
                double blueColours = 0;

                for (int i = -matrixSize; i <= matrixSize; i++) {
                    for (int j = -matrixSize; j <= matrixSize; j++) {
                        raster.getPixel(x + i, y + j, pixel);

                        redColours += pixel[0] * matrix[i + matrixSize][j + matrixSize];
                        greenColours += pixel[1] * matrix[i + matrixSize][j + matrixSize];
                        blueColours += pixel[2] * matrix[i + matrixSize][j + matrixSize];
                    }
                }

                newPixel[0] = (int) redColours;
                newPixel[1] = (int) greenColours;
                newPixel[2] = (int) blueColours;

                for (int k = 0; k < COLORS_COUNT_IN_RGB; k++) {
                    if (newPixel[k] < 0) {
                        newPixel[k] = 0;
                    } else if (newPixel[k] > MAX_RGB) {
                        newPixel[k] = MAX_RGB;
                    }
                }

                raster.setPixel(x, y, newPixel);
            }
        }

        ImageIO.write(image, "png", new File("outBlurImage.png"));
    }
}

/**
 * 1. Пункт 2 исправлен не полностью +
 * <p>
 * 2. Сейчас в цикле все время делается приведение к int, из-за этого сильно теряется точность. +
 * Приводить нужно только в самом конце
 * <p>
 * 3. Сейчас проход по области соседей делается 3 раза, это неэффективно. +
 * Нужно, чтобы делался 1 раз
 * <p>
 * 4. Лучше отделить концы for'ов от следующих команд пустыми строками +
 */