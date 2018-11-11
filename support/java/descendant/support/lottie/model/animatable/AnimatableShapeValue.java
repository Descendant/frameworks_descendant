package descendant.support.lottie.model.animatable;

import android.graphics.Path;

import descendant.support.lottie.value.Keyframe;
import descendant.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import descendant.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import descendant.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
