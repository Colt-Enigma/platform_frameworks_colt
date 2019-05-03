package colt.support.lottie.model.animatable;

import colt.support.lottie.value.Keyframe;
import colt.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import colt.support.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import colt.support.lottie.model.content.GradientColor;

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
