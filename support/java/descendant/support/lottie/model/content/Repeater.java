package descendant.support.lottie.model.content;

import android.support.annotation.Nullable;

import descendant.support.lottie.LottieDrawable;
import descendant.support.lottie.animation.content.Content;
import descendant.support.lottie.animation.content.RepeaterContent;
import descendant.support.lottie.model.animatable.AnimatableFloatValue;
import descendant.support.lottie.model.animatable.AnimatableTransform;
import descendant.support.lottie.model.layer.BaseLayer;

public class Repeater implements ContentModel {
  private final String name;
  private final AnimatableFloatValue copies;
  private final AnimatableFloatValue offset;
  private final AnimatableTransform transform;

  public Repeater(String name, AnimatableFloatValue copies, AnimatableFloatValue offset,
      AnimatableTransform transform) {
    this.name = name;
    this.copies = copies;
    this.offset = offset;
    this.transform = transform;
  }

  public String getName() {
    return name;
  }

  public AnimatableFloatValue getCopies() {
    return copies;
  }

  public AnimatableFloatValue getOffset() {
    return offset;
  }

  public AnimatableTransform getTransform() {
    return transform;
  }

  @Nullable @Override public Content toContent(LottieDrawable drawable, BaseLayer layer) {
    return new RepeaterContent(drawable, layer, this);
  }
}
