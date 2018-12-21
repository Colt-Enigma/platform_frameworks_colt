package pixeldust.support.lottie.model.animatable;

import pixeldust.support.lottie.value.Keyframe;
import pixeldust.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import pixeldust.support.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import pixeldust.support.lottie.model.content.GradientColor;

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
