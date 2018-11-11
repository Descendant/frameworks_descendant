package descendant.support.lottie.model.animatable;

import descendant.support.lottie.value.Keyframe;
import descendant.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import descendant.support.lottie.animation.keyframe.ColorKeyframeAnimation;

import java.util.List;

public class AnimatableColorValue extends BaseAnimatableValue<Integer, Integer> {
  public AnimatableColorValue(List<Keyframe<Integer>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<Integer, Integer> createAnimation() {
    return new ColorKeyframeAnimation(keyframes);
  }
}
