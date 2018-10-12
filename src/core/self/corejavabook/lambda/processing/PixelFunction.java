package core.self.corejavabook.lambda.processing;

import java.awt.Color;

@FunctionalInterface
public interface PixelFunction {
    Color apply(int x, int y);
}