package descendant.support.lottie.model.animatable;

import android.graphics.PointF;

import descendant.support.lottie.value.Keyframe;
import descendant.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import descendant.support.lottie.animation.keyframe.PointKeyframeAnimation;

import java.util.List;

public class AnimatablePointValue extends BaseAnimatableValue<PointF, PointF> {
  public AnimatablePointValue(List<Keyframe<PointF>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
    return new PointKeyframeAnimation(keyframes);
  }
}
