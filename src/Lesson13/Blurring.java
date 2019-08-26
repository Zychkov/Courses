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

        // создаем массив, в котором будет содержаться текущий пиксель
        // это массив из 3 элементов, в нем по очереди лежат числа R, G, B
        // т.е. по индексу 0 будет лежать красная компонента, по индексу 1 - зеленая, по индексу 2 - синяя
        int[] pixel = new int[COLORS_COUNT_IN_RGB];

        double[][] matrix = {{0.111, 0.111, 0.111},
                {0.111, 0.111, 0.111},
                {0.111, 0.111, 0.111}};

        int[] newPixel = new int[COLORS_COUNT_IN_RGB];

        for (int y = 1; y < height - 1; ++y) {
            for (int x = 1; x < width - 1; ++x) {
                int matrixSize = matrix.length / 2;

                for (int i = -matrixSize; i <= matrixSize; i++) {
                    for (int j = -matrixSize; j <= matrixSize; j++) {
                        //System.out.println(matrixSize);
                        raster.getPixel(x + i, y + j, pixel);

                        for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                            int blurring = (int) (pixel[k] * matrix[i + matrixSize][j + matrixSize]);
                            newPixel[k] += blurring;
                        }
                        raster.setPixel(x, y, newPixel);
                    }
                }
            }
        }
        ImageIO.write(image, "png", new File("outBlurImage.png"));
    }
}

/*
BufferedImage result = new BufferedImage(img.getWidth(), img.getHeight(), img.getType()) ;
final int H = img.getHeight() - 1 ;
final int W = img.getWidth() - 1 ;

for (int c=0 ; c < img.getRaster().getNumBands() ; c++) // for all the channels/bands
    for (int x=1 ; x < W ; x++) // For all the image
        for (int y=1; y < H ; y++)
            {
            int newPixel = 0 ;
            for (int i=-1 ; i <= 1 ; i++) // For the neighborhood
                for (int j=-1 ; j <= 1 ; j++)
                    newPixel += img.getRaster().getSample(x+i, y+j, c) ;
            newPixel = (int)(newPixel/9.0 + 0.5) ;
            result.getRaster().setSample(x, y, c, newPixel) ;
            }
 */