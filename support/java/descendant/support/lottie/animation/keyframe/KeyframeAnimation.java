package descendant.support.lottie.animation.keyframe;

import descendant.support.lottie.value.Keyframe;

import java.util.List;

abstract class KeyframeAnimation<T> extends BaseKeyframeAnimation<T, T> {
  KeyframeAnimation(List<? extends Keyframe<T>> keyframes) {
    super(keyframes);
  }
}
