package descendant.support.lottie.model.content;

import android.graphics.Path;
import android.support.annotation.Nullable;

import descendant.support.lottie.LottieDrawable;
import descendant.support.lottie.animation.content.Content;
import descendant.support.lottie.animation.content.FillContent;
import descendant.support.lottie.model.animatable.AnimatableColorValue;
import descendant.support.lottie.model.animatable.AnimatableIntegerValue;
import descendant.support.lottie.model.layer.BaseLayer;

public class ShapeFill implements ContentModel {
  private final boolean fillEnabled;
  private final Path.FillType fillType;
  private final String name;
  @Nullable private final AnimatableColorValue color;
  @Nullable private final AnimatableIntegerValue opacity;

  public ShapeFill(String name, boolean fillEnabled, Path.FillType fillType,
      @Nullable AnimatableColorValue color, @Nullable AnimatableIntegerValue opacity) {
    this.name = name;
    this.fillEnabled = fillEnabled;
    this.fillType = fillType;
    this.color = color;
    this.opacity = opacity;
  }

  public String getName() {
    return name;
  }

  @Nullable public AnimatableColorValue getColor() {
    return color;
  }

  @Nullable public AnimatableIntegerValue getOpacity() {
    return opacity;
  }

  public Path.FillType getFillType() {
    return fillType;
  }

  @Override public Content toContent(LottieDrawable drawable, BaseLayer layer) {
    return new FillContent(drawable, layer, this);
  }

  @Override
  public String toString() {
    return "ShapeFill{" + "color=" +
        ", fillEnabled=" + fillEnabled +
        '}';
  }
}
