package pixeldust.support.lottie.model.animatable;

import pixeldust.support.lottie.animation.keyframe.BaseKeyframeAnimation;

public interface AnimatableValue<K, A> {
  BaseKeyframeAnimation<K, A> createAnimation();
}
