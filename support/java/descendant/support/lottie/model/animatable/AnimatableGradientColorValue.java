package descendant.support.lottie.model.animatable;

import descendant.support.lottie.value.Keyframe;
import descendant.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import descendant.support.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import descendant.support.lottie.model.content.GradientColor;

import java.util.List;

public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor,
    GradientColor> {
  public AnimatableGradientColorValue(
      List<Keyframe<GradientColor>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation() {
    return new GradientColorKeyframeAnimation(keyframes);
  }
}
