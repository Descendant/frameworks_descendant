package descendant.support.lottie.model.animatable;

import descendant.support.lottie.value.Keyframe;
import descendant.support.lottie.animation.keyframe.TextKeyframeAnimation;
import descendant.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
