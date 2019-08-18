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

        // создаем массив, в котором будет содержаться текущий пиксель
        // это массив из 3 элементов, в нем по очереди лежат числа R, G, B
        // т.е. по индексу 0 будет лежать красная компонента, по индексу 1 - зеленая, по индексу 2 - синяя
        int[] pixel = new int[COLORS_COUNT_IN_RGB];

        double[][] h = {{1 / 9, 1 / 9, 1 / 9},
                        {1 / 9, 1 / 9, 1 / 9},
                        {1 / 9, 1 / 9, 1 / 9}};

        int [] newPixel = new int[COLORS_COUNT_IN_RGB];

        for (int y = 1; y < height - 1; ++y) {
            for (int x = 1; x < width - 1; ++x) {
                int pixel0[] = raster.getPixel(x - 1, y - 1, pixel);
                int pixel1[] = raster.getPixel(x, y - 1, pixel);
                int pixel2[] = raster.getPixel(x + 1, y - 1, pixel);
                int pixel3[] = raster.getPixel(x - 1, y, pixel);
                int pixel4[] = raster.getPixel(x, y, pixel);
                int pixel5[] = raster.getPixel(x + 1, y, pixel);
                int pixel6[] = raster.getPixel(x - 1, y + 1, pixel);
                int pixel7[] = raster.getPixel(x, y + 1, pixel);
                int pixel8[] = raster.getPixel(x + 1, y + 1, pixel);

                for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                    double colour = (pixel0[k] * h[0][0]) + (pixel1[k] * h[0][1]) + (pixel2[k] * h[0][2]) + (pixel3[k] * h[1][0]) + (pixel4[k] * h[1][1]) + (pixel5[k] * h[1][2]) + (pixel6[k] * h[2][0]) + (pixel7[k] * h[2][1]) + (pixel8[k] * h[2][2]);

                    newPixel[k] = (int) colour;
                }

                raster.setPixel(x, y, newPixel);
            }
        }

        ImageIO.write(image, "png", new File("outBlurImage.png"));
    }
}
