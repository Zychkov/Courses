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

        double[][] matrix = {{0.111, 0.111, 0.111},
                             {0.111, 0.111, 0.111},
                             {0.111, 0.111, 0.111}};

        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        int[] newPixel = new int[COLORS_COUNT_IN_RGB];

        for (int y = 1; y < height - 1; ++y) {
            for (int x = 1; x < width - 1; ++x) {
                for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                    int blurring = 0;
                    int matrixSize = matrix.length / 2;

                    for (int i = -matrixSize; i <= matrixSize; i++) {
                        for (int j = -matrixSize; j <= matrixSize; j++) {
                            raster.getPixel(x + i, y + j, pixel);

                            blurring += (int) (pixel[k] * matrix[i + matrixSize][j + matrixSize]);
                        }
                    }
                    newPixel[k] = blurring;
                }
                raster.setPixel(x, y, newPixel);
            }
        }
        ImageIO.write(image, "png", new File("outBlurImage.png"));
    }
}
