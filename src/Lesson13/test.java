package Lesson13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class test {
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

        for (int y = 1; y < height - 1; ++y) {
            for (int x = 1; x < width - 1; ++x) {
                int[] newPixel = new int[COLORS_COUNT_IN_RGB];

                for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                    int colour = 0;
                    int matrixSize = matrix.length / 2;

                    for (int i = -matrixSize; i <= matrixSize; i++) {
                        for (int j = -matrixSize; j <= matrixSize; j++) {
                            raster.getPixel(x + i, y + j, pixel);

                            colour += (int) (pixel[k] * matrix[i + matrixSize][j + matrixSize]);
                        }
                    }

                    if (colour < 0) {
                        colour = 0;
                    } else if (colour > MAX_RGB) {
                        colour = MAX_RGB;
                    }

                    newPixel[k] = colour;
                }
                raster.setPixel(x, y, newPixel);
            }
        }
        ImageIO.write(image, "png", new File("outBlurImage.png"));
    }
}